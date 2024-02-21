package com.codeWithDharani.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database_db {
    private final static String connectionUrl = "jdbc:mysql://localhost:3306/userLogin";
    private static final String username="root";
    private static final String password="Dharu@0402";

    public static Connection getConnection(){
        Connection connection=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection(connectionUrl,username,password);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
