/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.usjt.green.journey.dao;

import br.usjt.green.journey.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author usuario
 */
public class MissaoAtDAO {
    
    public void inserirMissaoAt(String username) throws Exception{
       
        String sqlUsuario = "SELECT id FROM tb_usuario WHERE username = ?";
        String sqlMissao = "SELECT id FROM tb_missao";
        
        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement stmtUsuario = conn.prepareStatement(sqlUsuario);
             PreparedStatement stmtMissao = conn.prepareStatement(sqlMissao)) {
            
            // Obtém o ID do usuário pelo nome
            stmtUsuario.setString(1, username);
            ResultSet rsUsuario = stmtUsuario.executeQuery();
            if (rsUsuario.next()) {
                int idUsuario = rsUsuario.getInt("id");
                
                // Obtém todos os IDs das missões
                ResultSet rsMissao = stmtMissao.executeQuery();
                while (rsMissao.next()) {
                    int idMissao = rsMissao.getInt("id");
                    
                    // Verifica se já existe a associação entre usuário e missão
                    if (!existeAssociacao(idUsuario, idMissao, conn) && !existeMissao(idMissao, conn)) {
                        // Insere a associação entre usuário e missão
                        String sqlInsert = "INSERT INTO tb_missaoAt (id_usuario, id_missao, finalizada) VALUES (?, ?, ?)";
                        try (PreparedStatement stmtInsert = conn.prepareStatement(sqlInsert)) {
                            stmtInsert.setInt(1, idUsuario);
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
    private boolean existeAssociacao(int idUsuario, int idMissao, Connection conn) throws SQLException{
    /*metodo que verifica se ja existe uma associação do usuario com a missão*/
     String sql = "SELECT COUNT(*) FROM tb_missaoAt WHERE id_usuario = ? AND id_missao = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idUsuario);
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
    public void alterarEstado(int idUsuario, int idMissao) throws Exception{
    /*altera estado da missão de não finalizada para finalizada*/
      String sql = "UPDATE tb_missaoAt SET finalizada = ? WHERE id_missao = ? AND id_usuario = ?";
        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setBoolean(1, true);
            stmt.setInt(2, idMissao);
            stmt.setInt(3, idUsuario);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
    
}
