package com.sunglowsys.preaparedtest;

import java.sql.*;

public class UpdateById {
    public static void main(String[] args)  throws SQLException, ClassNotFoundException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/sunglowsys";
        String username = "root";
        String password = "root";
            try {
                Class.forName(driver);
                Connection connection = DriverManager.getConnection(url,username,password);
                String record = "update customer set first_name = 'Krishan' where customer_id = 5";
                PreparedStatement preparedStatement =connection.prepareStatement(record);
                    System.out.println("record updated");
                    preparedStatement.executeUpdate();
                    connection.close();

            }catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

    }
}
