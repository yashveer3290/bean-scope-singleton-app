package com.sunglowsys.test2;

import java.sql.*;

public class FindAll {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/sunglowsys";
        String username = "root";
        String password = "root";
            try {

                Class.forName(driver);
                Connection connection = DriverManager.getConnection(url,username,password);
                PreparedStatement preparedStatement = connection.prepareStatement("select * from students");
                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()){

                    System.out.println(resultSet.getLong(1) + " = ");
                    System.out.println(resultSet.getString(2) + " ");
                    System.out.println(resultSet.getString(3) + " ");
                    System.out.println(resultSet.getString(4) + " ");
                    System.out.println(resultSet.getString(5) + " ");
                    System.out.println(resultSet.getString(6) + " ");
                    System.out.println(resultSet.getString(7) + " ");
                }

            }catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

    }
}
