package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertingDataPreparedStatement {
	
	public static void main(String[] args) {
		
		System.out.println("Performing Operations by using JDBC");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connection IS Sucessfull");
			
			try {
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "Vignesh@8368");
				System.out.println("DriverManager Connection is Successfull");
				
			   Statement statement=connection.createStatement();
				
				String insertingData="INSERT INTO `jdbcproject`.`phonedetails` (`PhoneName`, `phoneCost`, `phoneManufacturingLocation`, `price`, `itemsSoldPerMonth`) VALUES "
						+ "('Vivo', '26000', 'Mumbai', '45000', '25');\r\n"
						+ "";
				
				Boolean insert=statement.execute(insertingData);
				System.out.println(insert+"Data inseryted sucessfully");
				
				System.out.println("================================================================================");
				
				String insertingValues="INSERT INTO `jdbcproject`.`phonedetails` (`PhoneName`, `phoneCost`, `phoneManufacturingLocation`, `price`, `itemsSoldPerMonth`) VALUES "
						+ "('?', '?', '?', '?', '?');\r\n"
						+ "";
				PreparedStatement preparedStatement1= connection.prepareStatement(insertingValues);
				
				preparedStatement1.setString(1, "Samsung");
				preparedStatement1.setInt(2,20000);
				preparedStatement1.setString(3, "Banglore");
				preparedStatement1.setInt(4, 40000);
				preparedStatement1.setInt(5, 32);
				
				int valuesUpdated=preparedStatement1.executeUpdate();
				System.out.println(valuesUpdated+"Values Updated successfuly into the database by using prepared Statement");
				
				System.out.println();
			

			
				
				
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
