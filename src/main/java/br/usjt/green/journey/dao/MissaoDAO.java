package br.usjt.green.journey.dao;

import br.usjt.green.journey.connection.ConnectionFactory;
import br.usjt.green.journey.model.Missao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MissaoDAO {

    public void incluir(Missao missao) throws Exception {
        String sql = "insert into tb_missao (titulo, descricao, nivelDificuldade, pontos) VALUES (?, ?, ?, ?);";
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, missao.getTitulo());
            ps.setString(2, missao.getDescricao());
            ps.setInt(3, missao.getNivelDificuldade());
            ps.setInt(4, missao.getPontos());
            ps.executeUpdate();
        }
    }
    public void deletar(Missao missao) throws Exception {
        String sql = "delete from tb_missao where id = ?";
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, missao.getId());
            ps.executeUpdate();
        }
    }
    
    public Missao consultar(int id) throws Exception {
        String sql = "SELECT * FROM tb_missao WHERE id = ?;";
        Missao missao = new Missao();
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            try(ResultSet rs = ps.executeQuery()) {
                if(rs.next()) {
                    //Pegando os dados do ResultSet para criar um objeto Missao
                    missao.setId(rs.getInt("id"));
                    missao.setTitulo(rs.getString("titulo"));
                    missao.setDescricao(rs.getString("descricao"));
                    missao.setNivelDificuldade(rs.getInt("nivelDificuldade"));
                    missao.setPontos(rs.getInt("pontos"));
                }
            }
        }
        return missao;
    }
    
    public void alterar(Missao missao) throws Exception {
        String sql = "UPDATE tb_missao SET titulo = ?, descricao = ?, nivelDificuldade = ?, pontos = ? WHERE id = ?;";
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, missao.getTitulo());
            ps.setString(2, missao.getDescricao());
            ps.setInt(3, missao.getNivelDificuldade());
            ps.setInt(4, missao.getPontos());
            ps.setInt(5, missao.getId());
            ps.executeUpdate();
            
            //A AVALIAR!!!
        }
    }
}
