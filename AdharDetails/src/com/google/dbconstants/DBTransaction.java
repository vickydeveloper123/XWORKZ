package com.google.dbconstants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBTransaction {

	public static void main(String[] args) throws SQLException {

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		String inserting = "INSERT INTO `jdbcproject`.`adhar_details` (AdharNumberl, Name, Address, phoneNumber, Adhar_Detailscol) VALUES (?, ?, ?, ?, ?);\r\n"
				+ "";

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class Connection is successfull");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject", "root", "Vignesh@8368");

			preparedStatement = connection.prepareStatement(inserting);

			connection.setAutoCommit(false);

			preparedStatement.setInt(1, 274924);
			preparedStatement.setString(2, "JaganMohamRedyy");
			preparedStatement.setString(3, "Nellore");
			preparedStatement.setInt(4, 4444);
			preparedStatement.setString(5, "Verified Sucessfully");

			int executedSucessfully = preparedStatement.executeUpdate();
			System.out.println("Executed Sucessfully" + executedSucessfully);

			connection.commit();

			connection.rollback();

		} catch (ClassNotFoundException | SQLException e) {

			connection.commit();
			connection.rollback();
			System.out.println("RoLL Back Executed sucessfully");

			e.printStackTrace();
		}

	}

}
