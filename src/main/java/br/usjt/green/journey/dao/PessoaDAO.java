/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.usjt.green.journey.dao;

import br.usjt.green.journey.connection.ConnectionFactory;
import br.usjt.green.journey.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author usuario
 */
public class PessoaDAO {
    
       public boolean existeUsuario (Usuario usuario) throws Exception {
        String sql = "select * from tb_usuario where nome = ? and senha = ?";
        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
        
    }
       public void inserirUsuario(Usuario usuario){
       /*esse metodo é responsavel por cadastrar o usuario, ele pode retornar um vazio
           e só inserir ou ele pode retornar algo... como uma mensagem de sucesso*/
       
       
       }
}
