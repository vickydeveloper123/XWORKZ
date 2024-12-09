package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatement {
	
	public static void main(String[] args) {
		
		System.out.println("Performing Operations by using JDBC");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connection IS Sucessfull");
			
			try {
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "Vignesh@8368");
				System.out.println("DriverManager Connection is Successfull");
				
			   Statement statement=connection.createStatement();
				
				String creatingTable="CREATE TABLE `jdbcproject`.`phonedetails` (\r\n"
						+ "  `PhoneName` VARCHAR(45) NOT NULL,\r\n"
						+ "  `phoneCost` INT NULL,\r\n"
						+ "  `phoneManufacturingLocation` VARCHAR(45) NULL,\r\n"
						+ "  `price` VARCHAR(45) NULL,\r\n"
						+ "  `itemsSoldPerMonth` INT NULL,\r\n"
						+ "  PRIMARY KEY (`PhoneName`));";
				
				boolean creatingStatement=statement.execute(creatingTable);
				System.out.println(creatingStatement+"Table Created Sucessfully");
				

			
				
				
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
