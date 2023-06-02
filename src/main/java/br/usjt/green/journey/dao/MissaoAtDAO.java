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
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
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
   public MissaoAtribuida[] obterMissoesAt(int idPessoa) throws Exception{
        String sql = "SELECT * FROM tb_missaoAt";
        try (Connection conn = ConnectionFactory.obtemConexao();
            PreparedStatement ps = conn.prepareStatement(sql,
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = ps.executeQuery()){
            int totalDeMissoes = rs.last () ? rs.getRow() : 0;
            MissaoAtribuida[] missoesUsuario = new MissaoAtribuida[totalDeMissoes];
            rs.beforeFirst();
            int contador = 0;
            while (rs.next()){
                int idMissao = rs.getInt("idMissao");
                boolean finalizada = rs.getBoolean("finalizada");
                missoesUsuario[contador++] = new MissaoAtribuida (idMissao, finalizada);
            }
            return missoesUsuario;
        }
    }
   //metodo de retorno do atributo finalizada na tabela
   //chamar esse metodo da classe missaoAtribuida
    public boolean isFinalizada(int idPessoa) throws Exception {
        String sql = "SELECT finalizada FROM tb_missaoAt WHERE id_pessoa = ?";
        try (Connection conn = ConnectionFactory.obtemConexao();
         PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idPessoa);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getBoolean("finalizada");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
    }
    return false;
}
    //metodo que insere uma missão para todos os usuarios contidos na tabela missão
    public void inserirMissaoAtPorId(int idMissao) throws Exception {
        String sqlUsuarios = "SELECT id FROM tb_pessoa";
    
        try (Connection conn = ConnectionFactory.obtemConexao();
            PreparedStatement stmtUsuarios = conn.prepareStatement(sqlUsuarios);
            PreparedStatement stmtInsert = conn.prepareStatement("INSERT INTO tb_missaoAt (id_pessoa, id_missao, finalizada) VALUES (?, ?, ?)")) {
        
        // Obtém todos os IDs dos usuários
        ResultSet rsUsuarios = stmtUsuarios.executeQuery();
            while (rsUsuarios.next()) {
                int idPessoa = rsUsuarios.getInt("id");
            
                // Insere a associação entre usuário e missão
                stmtInsert.setInt(1, idPessoa);
                stmtInsert.setInt(2, idMissao);
                stmtInsert.setBoolean(3, false);
                stmtInsert.executeUpdate();
            
        }
        
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}
    
    
}
