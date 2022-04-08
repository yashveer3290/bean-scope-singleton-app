package com.sunglowsys.preaparedtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteById {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/sunglowsys";
        String username = "root";
        String password = "root";

            try {
                Class.forName(driver);
                Connection connection = DriverManager.getConnection(url,username,password);
                String record = "delete from customer where customer_id =3 ";
                PreparedStatement preparedStatement = connection.prepareStatement(record);
                    System.out.println("record deleted");
                    preparedStatement.executeUpdate();
                    connection.close();
            }catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

    }
}
