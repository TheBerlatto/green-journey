/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.usjt.green.journey.dao;

import br.usjt.green.journey.connection.ConnectionFactory;
import br.usjt.green.journey.model.Administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author usuario
 */
public class AdminDAO {
    
    public boolean consultarAdmin(Administrador admin) throws Exception {
        String sql = "select * from tb_usuario where nome = ? and senha = ? ";
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, admin.getUsername());
            ps.setString(2, admin.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
    public void atualizarAdmin(Administrador admin) throws Exception{
    /*recebe os dados do usuario e atribui*/
    /*comando do sql usado*/
    String sql = "UPDATE tb_pessoa SET email = ?, senha = ?, username = ? WHERE codigo = ?";
    /*conexao com o banco e pre-compila o comando sql*/
    try (Connection conn = ConnectionFactory.obtemConexao(); 
            PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, admin.getUsername());
        ps.setString(2, admin.getEmail());
        ps.setString(2, admin.getSenha()); 
        
        ps.execute();
    }
    
    }
    public void deletarAdmin(Administrador admin) throws Exception{
    /*classe responsavel por excluir o usuario do banco*/
    String sql = "DELETE FROM tb_pessoa WHERE codAdmin = ?";
    
    try (Connection conn = ConnectionFactory.obtemConexao(); 
            PreparedStatement ps = conn.prepareStatement(sql)){
        ps.setInt(1,admin.getCodAdmin());
        
        ps.execute();
    }
    }
    
}
