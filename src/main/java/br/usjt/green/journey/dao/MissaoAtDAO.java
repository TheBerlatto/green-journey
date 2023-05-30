package br.usjt.green.journey.dao;

import br.usjt.green.journey.connection.ConnectionFactory;
import br.usjt.green.journey.model.MissaoAtribuida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author vitornunes000
 */
public class MissaoAtDAO {
    
    public void inserirMissaoAt(String username) throws Exception{
       
        String sqlPessoa = "SELECT id FROM tb_pessoa WHERE username = ?";
        String sqlMissao = "SELECT id FROM tb_missao";
        
        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement stmtUsuario = conn.prepareStatement(sqlPessoa);
             PreparedStatement stmtMissao = conn.prepareStatement(sqlMissao)) {
            
            // Obtém o ID do usuário pelo nome
            stmtUsuario.setString(1, username);
            ResultSet rsPessoa = stmtUsuario.executeQuery();
            if (rsPessoa.next()) {
                int idPessoa = rsPessoa.getInt("id");
                
                // Obtém todos os IDs das missões
                ResultSet rsMissao = stmtMissao.executeQuery();
                while (rsMissao.next()) {
                    int idMissao = rsMissao.getInt("id");
                    
                    // Verifica se já existe a associação entre usuário e missão
                    if (!existeAssociacao(idPessoa, idMissao, conn) && !existeMissao(idMissao, conn)) {
                        // Insere a associação entre usuário e missão
                        String sqlInsert = "INSERT INTO tb_missaoAt (id_pessoa, id_missao, finalizada) VALUES (?, ?, ?)";
                        try (PreparedStatement stmtInsert = conn.prepareStatement(sqlInsert)) {
                            stmtInsert.setInt(1, idPessoa);
                            stmtInsert.setInt(2, idMissao);
                            stmtInsert.setBoolean(3, false);
                            stmtInsert.executeUpdate();
                        }
                    }
                }
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
    }
    private boolean existeAssociacao(int idPessoa, int idMissao, Connection conn) throws SQLException{
    /*metodo que verifica se ja existe uma associação do usuario com a missão*/
     String sql = "SELECT COUNT(*) FROM tb_missaoAt WHERE id_pessoa = ? AND id_missao = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idPessoa);
            stmt.setInt(2, idMissao);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;
            }
        }
        return false;
    
    }
    private boolean existeMissao(int idMissao, Connection conn) throws SQLException{
    /*verifica se a tabela ja possui a missão*/
    String sql = "SELECT COUNT(*) FROM tb_missaoAt WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idMissao);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;
            }
        }
        return false;
    }
    public void concluirMissao(int idPessoa, int idMissao) throws Exception{
    /*altera estado da missão de não finalizada para finalizada*/
      String sql = "UPDATE tb_missaoAt SET finalizada = ? WHERE id_missao = ? AND id_pessoa = ?";
        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setBoolean(1, true);
            stmt.setInt(2, idMissao);
            stmt.setInt(3, idPessoa);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public MissaoAtribuida obterMissao(int idPessoa, int idMissao) throws Exception{
    /*fazer metodo para selecionar missão com id dela (recebe id do usuario e da missão)*/
    String sql = "SELECT finalizada FROM tb_missaoAt WHERE id_pessoa = ? AND id_missao = ?";
        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1,idPessoa);
            stmt.setInt(2, idMissao);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                boolean finalizada = rs.getBoolean("finalizada");

                return new MissaoAtribuida(idPessoa, idMissao, finalizada);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    } 
    
    
    
}
