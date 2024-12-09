package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementInsert {
	
	public static void main(String[] args) {
		
		System.out.println("Performing Operations by using JDBC");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connection IS Sucessfull");
			
			try {
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "Vignesh@8368");
				System.out.println("DriverManager Connection is Successfull");
			
				System.out.println("================================================================================");
				
				/*
				 * String insertingValues =
				 * "INSERT INTO jdbcproject.phonedetails (PhoneName, phoneCost, phoneManufacturingLocation, price, itemsSoldPerMonth)"
				 * + " VALUES (?, ?, ?, ?, ?)";
				 * 
				 * PreparedStatement preparedStatement1 =
				 * connection.prepareStatement(insertingValues); preparedStatement1.setString(1,
				 * "SamsungGalooxy"); preparedStatement1.setInt(2, 20000);
				 * preparedStatement1.setString(3, "Banglore"); preparedStatement1.setInt(4,
				 * 40000); preparedStatement1.setInt(5, 32);
				 * 
				 * int valuesUpdated = preparedStatement1.executeUpdate(); System.out.println(
				 * valuesUpdated +
				 * "Values Updated successfuly into the database by using prepared Statement");
				 */

				System.out.println("=========================================================================================");
				
				String updatingValues="UPDATE jdbcproject.phonedetails SET PhoneName = ? WHERE (PhoneName = ?)";
				
				PreparedStatement updating=connection.prepareStatement(updatingValues);
				updating.setString(1, "Vivo123s");
				System.out.println("Updated Sucessfully");
				
				/*
				 * String
				 * updatingDetails="UPDATE jdbcproject.phonedetails SET phoneManufacturingLocation = ? WHERE (PhoneName = ?)"
				 * ;
				 * 
				 * PreparedStatement prStatement=connection.prepareStatement(updatingDetails);
				 * 
				 * Scanner sc=new Scanner(System.in);
				 * System.out.println("Enter your Manufacturing Location"); String
				 * details=sc.nextLine();
				 * 
				 * 
				 * prStatement.setString(0, "Kolkata"); prStatement.setString(1,"OppoA3s" );
				 * 
				 * int result=prStatement.executeUpdate();
				 * System.out.println(result+"Result get Updated");
				 */
				

			
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
