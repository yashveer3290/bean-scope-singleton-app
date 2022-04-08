package com.sunglowsys.test;

import java.sql.*;

public class FindByID {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/sunglowsys";
        String username = "root";
        String password = "root";

            try {
                Class.forName(driver);
                Connection connection = DriverManager.getConnection(url,username,password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from customer where customer_id = 7");

                while (resultSet.next()) {

                    System.out.println(resultSet.getLong(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getString(4));
                }
            }catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

    }
}
