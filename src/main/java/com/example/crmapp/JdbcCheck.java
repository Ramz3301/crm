package com.example.crmapp;

import java.sql.*;

public class JdbcCheck {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/student", "postgres", "1");
        System.out.println("Connected with DB");

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM customer");

        while (resultSet.next()) {
            System.out.println(resultSet.getLong("id"));
            System.out.println(resultSet.getString("first_name"));
        }
    }

}
