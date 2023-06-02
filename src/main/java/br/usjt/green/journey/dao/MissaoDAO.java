package br.usjt.green.journey.dao;

import br.usjt.green.journey.connection.ConnectionFactory;
import br.usjt.green.journey.model.Missao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author TheBerlatto
 */
public class MissaoDAO {

    public void inserir(Missao missao) throws Exception {
        String sql = "INSERT INTO tb_missao (titulo, descricao, nivelDificuldade, pontos) VALUES (?, ?, ?, ?);";
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, missao.getTitulo());
            ps.setString(2, missao.getDescricao());
            ps.setInt(3, missao.getNivelDificuldade());
            ps.setInt(4, missao.getPontos());
            ps.executeUpdate();
        }
    }

    public Missao[] consultar() throws Exception {
        String sql = "SELECT * FROM tb_missao";
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql,
                ResultSet.TYPE_SCROLL_INSENSITIVE,//pode flutuar pela tabela
                ResultSet.CONCUR_READ_ONLY); //somente leitura
                 ResultSet rs = ps.executeQuery()) {
            //contar quantas missões tem
            int totalDeMissoes = rs.last() ? rs.getRow() : 0; //if(rs.last())
            Missao[] missoes = new Missao[totalDeMissoes];
            rs.beforeFirst();
            int contador = 0;
            while (rs.next()) {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String descricao = rs.getString("descricao");
                int nivelDificuldade = rs.getInt("nivelDificuldade");
                int pontos = rs.getInt("pontos");
                missoes[contador++] = new Missao(id, titulo, descricao, nivelDificuldade, pontos);
            }
            return missoes;
        }
    }

    public Missao consultarPorId(int id) throws Exception {
        String sql = "SELECT * FROM tb_missao WHERE id = ?;";
        Missao missao = new Missao();
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql, ResultSet.CONCUR_READ_ONLY)) {

            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    //Pegando os dados do ResultSet para criar um objeto Missao
                    missao.setId(rs.getInt("id"));
                    missao.setTitulo(rs.getString("titulo"));
                    missao.setDescricao(rs.getString("descricao"));
                    missao.setNivelDificuldade(rs.getInt("nivelDificuldade"));
                    missao.setPontos(rs.getInt("pontos"));
                } else {
                    missao = null;
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
            ps.setInt(5, missao.consultarIdPeloTitulo(missao.getTitulo()));
            ps.executeUpdate();
        }
    }

    public void deletar(int id) throws Exception {
        String sql = "DELETE FROM tb_missao where id = ?;";
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }

    public int consultarIdPeloTitulo(String titulo) throws Exception {
        int id = -1;

        String sql = "SELECT id FROM tb_missao WHERE titulo = ?;";
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, titulo);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    id = rs.getInt("id");
                }
            }
        }

        return id;
    }

    public String consultarDescricaoPeloTitulo(String titulo) throws Exception {
        String descricao = null;

        String sql = "SELECT descricao FROM tb_missao WHERE titulo = ?;";
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, titulo);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    descricao = rs.getString("descricao");
                }
            }
        }

        return descricao;
    }
    
    public int consultarPontosPeloTitulo(String titulo) throws Exception {
        int pontos = 0;

        String sql = "SELECT pontos FROM tb_missao WHERE titulo = ?;";
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, titulo);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    pontos = rs.getInt("pontos");
                }
            }
        }

        return pontos;
    }

}
