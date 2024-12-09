package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcProject {
	
	public static void main(String[] args) {
		
		
		System.out.println("Establishing Connections and Creating Project");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			try {
				Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject","root","Vignesh@8368");
				System.out.println("Established Connection between mysql and java Application");
				
				 Statement statement=connection.createStatement();
				 
                String insertingTable="INSERT INTO `jdbcproject`.`new_table` (`Student_name`, `Stream`, `passout`, `Training_course_name`, `Batch_Name`, `Fees`, `phone_Number`)"
                		+ "          VALUES ('Shivayan', 'COMUTER Engineering', '2015', 'JAVA SCRIPT Development', 'Jan 20', '25000', '523235');\r\n"
                		+ "";
                Boolean exectionInsertion=statement.execute(insertingTable);
                System.out.println(exectionInsertion);
                
               
				
				
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {

			System.out.println("Here we are execting the JAR files from the JDdecompliler");
			e.printStackTrace();
		}
		
		
		
		
	}

}
