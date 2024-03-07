package controller;


import model.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBManager {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://127.0.0.1:5432/crud";
        String user = "Davi Alves";
        String password = "1708Davi";
        return DriverManager.getConnection(url, user, password);

    }
}



