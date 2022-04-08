package com.sunglowsys.test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaveStudents {
    public static void main(String[] args)  throws SQLException, ClassNotFoundException  {
        String driver = "com.mysql.jdbc.Driver";
        String url ="jdbc:mysql://localhost:3306/sunglowsys";
        String username = "root";
        String password = "root";

            try {

                Class.forName(driver);
                Connection connection = DriverManager.getConnection(url,username,password);
                String record = "insert into students(student_id, gender, date_of_birth, first_name, middle_name, last_name, other_student_details) values(?,?,?,?,?,?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(record);

                    preparedStatement.setLong(1,3);
                    preparedStatement.setString(5,"Male");
                    preparedStatement.setString(6,"02/03/1995");
                    preparedStatement.setString(2,"Govind");
                    preparedStatement.setString(3,"Kumar");
                    preparedStatement.setString(4,"Singh");
                    preparedStatement.setString(7,"Null");

                    System.out.println("record inserted");
                    preparedStatement.executeUpdate();

            }catch (ClassNotFoundException e) {

                e.printStackTrace();
            }

    }
}
