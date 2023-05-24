package br.usjt.green.journey.dao;

import br.usjt.green.journey.connection.ConnectionFactory;
import br.usjt.green.journey.model.Missao;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class MissaoDAO {

    public void incluirMissao(Missao missao) throws Exception {
        String sql = "insert into tb_missao (titulo, descricao, nivelDificuldade, pontos) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, missao.getTitulo());
            ps.setString(2, missao.getDescricao());
            ps.setInt(3, missao.getNivelDificuldade());
            ps.setInt(4, missao.getPontos());
            ps.executeUpdate();
        }
    }
}
