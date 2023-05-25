package br.usjt.green.journey.dao;

import br.usjt.green.journey.connection.ConnectionFactory;
import br.usjt.green.journey.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {

    public boolean consultarUsuario(Usuario usuario) throws Exception {
        
        /*metodo que consulta os dados do usuario usando o username e a senha*/
        
        String sql = "select * from tb_usuario where nome = ? and senha = ? ";
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
    public void atualizarUsuario(Usuario usuario) throws Exception{
    /*recebe os dados do usuario e atribui*/
    /*comando do sql usado*/
    String sql = "UPDATE tb_pessoa SET email = ?, senha = ?, username = ? WHERE codigo = ?";
    /*conexao com o banco e pre-compila o comando sql*/
    try (Connection conn = ConnectionFactory.obtemConexao(); 
            PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, usuario.getUsername());
        ps.setString(2, usuario.getEmail());
        ps.setString(2, usuario.getSenha()); 
        
        ps.execute();
    }
    
    }
    public void deletarUsuario(Usuario usuario) throws Exception{
    /*classe responsavel por excluir o usuario do banco*/
    String sql = "DELETE FROM tb_pessoa WHERE codigo = ?";
    
    try (Connection conn = ConnectionFactory.obtemConexao(); 
            PreparedStatement ps = conn.prepareStatement(sql)){
        ps.setLong(1, usuario.getId());
        
        ps.execute();
    }
    }
    /*metodo que associa uma missão ao usuario*/
    public void atribuirMissao(Missao missao){
    
    }
}
