package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletingStudentDetails {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connection Successfull");

			try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject", "root",
						"Vignesh@8368");

				System.out.println("Driver Manager connection is success");

				String deletingData = "DELETE FROM `jdbcproject`.`new_table` WHERE (`passout` = '2019'); \r\n" + "";
				Statement statement = connection.createStatement();

				String gettingData = "SELECT * FROM jdbcproject.new_table" + "";

				int deletingData1 = statement.executeUpdate(deletingData);

				System.out.println(deletingData1 + "=======" + "Sucessfully Data is Deleted from the Data Base MySql");

				ResultSet resultSet = statement.executeQuery(gettingData);

				/*
				 * resultSet.next();
				 * System.out.println(resultSet.getString(1)+" "+resultSet.getInt(1)+" "
				 * +resultSet.getString(1)+" "+resultSet.getInt(1)+" "+resultSet.getInt(1));
				 */
				resultSet.next();
				System.out.println(resultSet.getString("Student_name") + " " + resultSet.getString("Stream") + " "
						+ resultSet.getString("passout") + " " + resultSet.getString("Training_course_name") + " "
						+ resultSet.getString("Batch_Name") + " " + resultSet.getInt("Fees")
						+ resultSet.getInt("Phone_Number"));

				resultSet.next();
				System.out.println(resultSet.getString("Student_name") + " " + resultSet.getString("Stream") + " "
						+ resultSet.getString("passout") + " " + resultSet.getString("Training_course_name") + " "
						+ resultSet.getString("Batch_Name") + " " + resultSet.getInt("Fees")
						+ resultSet.getInt("Phone_Number"));

				resultSet.next();
				System.out.println(resultSet.getString("Student_name") + " " + resultSet.getString("Stream") + " "
						+ resultSet.getString("passout") + " " + resultSet.getString("Training_course_name") + " "
						+ resultSet.getString("Batch_Name") + " " + resultSet.getInt("Fees")
						+ resultSet.getInt("Phone_Number"));

				while (resultSet.next()) {
					System.out.println(resultSet.getString("Student_name") + " " + resultSet.getString("Stream") + " "
							+ resultSet.getString("passout") + " " + resultSet.getString("Training_course_name") + " "
							+ resultSet.getString("Batch_Name") + " " + resultSet.getInt("Fees")
							+ resultSet.getInt("Phone_Number"));
				}

			} catch (SQLException e) {

				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
