package br.usjt.green.journey.dao;

import br.usjt.green.journey.connection.ConnectionFactory;
import br.usjt.green.journey.model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author TheBerlatto
 */
public class PessoaDAO {

    public void inserir(Pessoa pessoa) throws Exception {
        String sql = "INSERT INTO tb_pessoa (username, email, senha, pontuacao, tipoPessoa) VALUES (?, ?, ?, 0, 'U');";
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, pessoa.getUsername());
            ps.setString(2, pessoa.getEmail());
            ps.setString(3, pessoa.getSenha());
            ps.executeUpdate();
        }
    }
    
    public void deletar(Pessoa pessoa) throws Exception {
        String sql = "DELETE FROM tb_pessoa WHERE id = ?;";
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, pessoa.getId());
            ps.executeUpdate();
        }
    }
    
    public Pessoa consultar(int id) throws Exception {
        String sql = "SELECT * FROM tb_pessoa WHERE id = ?;";
        Pessoa pessoa = new Pessoa();
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            try(ResultSet rs = ps.executeQuery()) {
                if(rs.next()) {
                    //Pegando os dados do ResultSet para criar um objeto Pessoa
                    pessoa.setId(rs.getInt("id"));
                    pessoa.setUsername(rs.getString("username"));
                    pessoa.setEmail(rs.getString("email"));
                    pessoa.setSenha(rs.getString("senha"));
                }
            }
        }
        return pessoa;
    }
    
    public boolean consultarSeExistir(Pessoa pessoa) throws Exception {

        /*metodo que consulta os dados do usuario usando o username e a senha*/
        String sql = "select * from tb_pessoa where nome = ? and senha = ?;";
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, pessoa.getUsername());
            ps.setString(2, pessoa.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
    
    public void alterar(Pessoa pessoa) throws Exception {
        String sql = "UPDATE tb_pessoa SET username = ?, email = ?, senha = ? WHERE id = ?;";
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, pessoa.getUsername());
            ps.setString(2, pessoa.getEmail());
            ps.setString(3, pessoa.getSenha());
            ps.executeUpdate();   
        }
    }
}

