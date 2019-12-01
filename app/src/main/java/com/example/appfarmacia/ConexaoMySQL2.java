package com.example.appfarmacia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL2 {
    private static final String USUARIO = "root";
    private static final String SENHA = "123456";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/sistema";

    public static Connection conectar() throws SQLException{

        Connection conexao = null;


        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();;
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        return conexao;
    }

}



