package com.sunglowsys.preaparedtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaveCustomer {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/sunglowsys";
        String username = "root";
        String password = "root";
            try {
                Class.forName(driver);
                Connection connection = DriverManager.getConnection(url,username,password);
                String record = "insert into customer (customer_id, first_name, last_name, mobile) values(?,?,?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(record);

                    preparedStatement.setLong(1,10);
                    preparedStatement.setString(2,"Shyam");
                    preparedStatement.setString(3,"Kumar");
                    preparedStatement.setString(4,"8988983456");

                    System.out.println("record inserted");
                    preparedStatement.executeUpdate();
                    connection.close();

            }catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

    }
}
