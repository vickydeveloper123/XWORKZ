package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatingDetails {

	public static void main(String[] args) {

		System.out.println("Updating Student Details ");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connection is Sucessfull");
			
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject","root","Vignesh@8368");
			System.out.println("Getting Connection is successfully Updated to the local host");
			
			Statement statement=connection.createStatement();
			
			String updatingDetails="UPDATE `jdbcproject`.`new_table` SET `Stream` = 'Electrical Engineering', `Training_course_name` = 'Web-Development', `Fees` = '16000' WHERE (`Student_name` = 'VijayaDuraga') and (`phone_Number` = '12345');\r\n"
					+ "";
			String updateDetai="UPDATE `jdbcproject`.`new_table` SET `Student_name` = 'kickkick', `Stream` = 'civil', `passout` = '2222', `Training_course_name` = 'PYTHON' WHERE (`Student_name` = 'kick') and (`phone_Number` = '55345');\r\n"
					+ "";
			
			String update="UPDATE `jdbcproject`.`new_table` SET `Student_name` = 'RACHAMALLI DORA SRI VIGNESH' WHERE (`Student_name` = 'Sri Vignesh') and (`phone_Number` = '12345');\r\n"
					+ "";
			
			String updat="UPDATE `jdbcproject`.`new_table` SET `Student_name` = 'Mallikarjuna' WHERE (`Student_name` = 'krishna') and (`phone_Number` = '55345');\r\n"
					+ "";
			//Statement statement=connection.createStatement();
			Boolean exection=statement.execute(updat);
			System.out.println("Student Details Successfully updated into the database from the java Application");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
