package com.sunglowsys.test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RecordUpdate {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/sunglowsys";
        String username = "root";
        String password = "root";
            try {
                Class.forName(driver);
                Connection connection = DriverManager.getConnection(url, username,password);
                String record = "update students set first_name = 'Pravender' where student_id = 3";
                PreparedStatement preparedStatement = connection.prepareStatement(record);
                preparedStatement.executeUpdate(record);

                System.out.println("record updated");
            }catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

    }
}
