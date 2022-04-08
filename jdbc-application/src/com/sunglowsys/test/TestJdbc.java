package com.sunglowsys.test;

import java.sql.*;

public class TestJdbc {
    public static void main(String[] args) throws SQLException ,ClassNotFoundException{
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/sunglowsys";
        String username = "root";
        String password = "root";
        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from student");

                while (resultSet.next()) {
                    System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + "  " + resultSet.getString(3) + "  " + resultSet.getString(4)+""+resultSet.getString(5));
                }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
