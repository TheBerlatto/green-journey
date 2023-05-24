package br.usjt.green.journey.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static String host = "localhost";
    private static String port = "3306";
    private static String db = "db_green_journey";
    private static String usuario = "root";
    private static String senha = "xxxxx"; //senha não inserida ainda, vou inserir depois
    
    public static Connection obtemConexao() throws Exception {
        String url = String.format("jdbc:mysql://%s:%s/%s", host, port, db);
        return DriverManager.getConnection(url, usuario, senha);
    } 
}
