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
            /*modificar para que o codigo pegue o id do usuario que se cadastrou*/
             PreparedStatement psUsuario = conn.prepareStatement(sqlUsuario);
             PreparedStatement psMissao = conn.prepareStatement(sqlMissao);
             ResultSet rsUsuario = psUsuario.executeQuery();
             ResultSet rsMissao = psMissao.executeQuery()) {
            ps.setInt(1, idUsuario);
            ps.setInt(2, idMissao);
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
    }
    public void alterarEstado(){
    /*altera estado da missão de não finalizada para finalizxada*/
    
    }
    
}
