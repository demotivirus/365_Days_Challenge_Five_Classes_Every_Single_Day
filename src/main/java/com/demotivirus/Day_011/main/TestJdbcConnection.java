package com.demotivirus.Day_011.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJdbcConnection {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/testdb";
        String login = "postgres";
        String password = "root";

        System.out.println("Connection to db: " + url);
        try {
            Connection connection = DriverManager.getConnection(url, login, password);
            System.out.println("CONNECTION SUCCESSFUL");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM public.student");
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("first_name"));
                System.out.println(resultSet.getString("last_name"));
                System.out.println(resultSet.getString("email"));
            }
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
