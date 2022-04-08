package com.sunglowsys.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/sunglowsys";
        String username = "root";
        String password = "root";

            try {
                Class.forName(driver);
                Connection connection = DriverManager.getConnection(url,username,password);
                Statement statement = connection.createStatement();
                String record = "update student set first_name = 'Ram' where student_id = 2";
                statement.executeUpdate(record);
                System.out.println("record updated");
            }catch (ClassNotFoundException e){

                e.printStackTrace();
            }

    }
}
