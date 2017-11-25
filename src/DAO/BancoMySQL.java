/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author paulo.hbezerra
 */
public class BancoMySQL {

    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {

            String url = "jdbc:mysql://localhost:3306/LojaBrinquedosDatabase";

            Properties dados = new Properties();
            dados.put("user", "root");
            dados.put("password", "adminadmin");

            connection = DriverManager.getConnection(url, dados);
        }

        return connection;
    }

}
