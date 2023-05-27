/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.usjt.green.journey.dao;

import br.usjt.green.journey.connection.ConnectionFactory;
import br.usjt.green.journey.model.Pessoa;
import br.usjt.green.journey.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author TheBerlatto
 */
public class PessoaDAO {

    public boolean consultar(Pessoa pessoa) throws Exception {

        /*metodo que consulta os dados do usuario usando o username e a senha*/
        String sql = "select * from tb_pessoa where nome = ? and senha = ? ";
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, pessoa.getUsername());
            ps.setString(2, pessoa.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

}

