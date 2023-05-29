package br.usjt.green.journey.dao;

import br.usjt.green.journey.connection.ConnectionFactory;
import br.usjt.green.journey.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author TheBerlatto
 */
public class PessoaDAO {

    public void inserir(Usuario usuario) throws Exception {
        String sql = "INSERT INTO tb_pessoa (username, email, senha, pontuacao, tipoPessoa) VALUES (?, ?, ?, ?, 'U');";
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getSenha());
            ps.setInt(4, 0);
            ps.executeUpdate();
        }
    }
    
    public void deletar(int id) throws Exception {
        String sql = "DELETE FROM tb_pessoa WHERE id = ?;";
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }
    
    public Usuario consultar(int id) throws Exception {
        String sql = "SELECT * FROM tb_pessoa WHERE id = ?;";
        Usuario usuario = new Usuario();
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            try(ResultSet rs = ps.executeQuery()) {
                if(rs.next()) {
                    //Pegando os dados do ResultSet para criar um objeto Pessoa
                    usuario.setId(rs.getInt("id"));
                    usuario.setUsername(rs.getString("username"));
                    usuario.setEmail(rs.getString("email"));
                    usuario.setSenha(rs.getString("senha"));
                }
            }
        }
        return usuario;
    }
    
    public boolean consultarSeExistir(Usuario usuario) throws Exception {

        /*metodo que consulta os dados do usuario usando o username e a senha*/
        String sql = "select * from tb_pessoa where nome = ? and senha = ?;";
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
    
    public void alterar(Usuario usuario) throws Exception {
        String sql = "UPDATE tb_pessoa SET username = ?, email = ?, senha = ? WHERE id = ?;";
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getSenha());
            ps.executeUpdate();   
        }
    }
}

