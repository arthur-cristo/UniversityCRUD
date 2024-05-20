package com.arthur.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private static final String USERNAME = "user";
    private static final String PASSWORD = "";
    private static final String URL = "jdbc:mysql://localhost:3306/university";


    public static Connection createConnectionToMySQL() throws Exception {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}