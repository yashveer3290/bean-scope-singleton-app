package com.sunglowsys.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {

    public static void main(String[] args) throws SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/sunglowsys";
        String username = "root";
        String password = "root";
            try {
                Class.forName(driver);
                Connection connection = DriverManager.getConnection(url,username,password);
                Statement statement = connection.createStatement();
                statement.executeUpdate("delete from student where student_id = 11");
                System.out.println("record deleted");
            }catch (ClassNotFoundException e){

                e.printStackTrace();

            }

    }
}
