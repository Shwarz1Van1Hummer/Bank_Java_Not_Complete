package com.example.bank.Models;

import java.sql.*;

public class DatabaseDriver {
    private Connection conn;

    public DatabaseDriver(){
        try {
            this.conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/javafx:mazebank.db");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }


    public ResultSet getClientData(String pAddress, String password){
        Statement statement;
        ResultSet resultSet = null;
        try {
            statement = this.conn.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM Clients WHERE PayeeAddress"+ pAddress+" AND Password"+ password + ";");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

}
