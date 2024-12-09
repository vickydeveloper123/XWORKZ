package com.google.adhardetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AdharDetails {

	public static void main(String[] args) {

		System.out.println("=============CRUD opersations ====================");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Connection is Sucess");

			try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root",
						"Vignesh@8368");
				System.out.println("Driver Manager connection is0 sucess");
				/*
				 * Statement statement=connection.createStatement();
				 * 
				 * 
				 * 
				 * String creatingTable="CREATE TABLE `jdbcproject`.`adhar_details` (\r\n" +
				 * "  `AdharNumberl` INT NOT NULL,\r\n" + "  `Name` VARCHAR(45) NULL,\r\n" +
				 * "  `Address` VARCHAR(45) NULL,\r\n" + "  `phoneNumber` VARCHAR(45) NULL,\r\n"
				 * + "  `Adhar_Detailscol` VARCHAR(45) NULL,\r\n" +
				 * "  PRIMARY KEY (`AdharNumberl`))\r\n" + "COMMENT = '			';";
				 * 
				 * boolean creatingTableDetails= statement.execute(creatingTable);
				 * System.out.println(
				 * creatingTableDetails+"Inserting table Sucessfully in the database");
				 */
				
				
				Statement statement1 = connection.createStatement();

				String inserting = "INSERT INTO `jdbcproject`.`adhar_details` (`AdharNumberl`, `Name`, `Address`, `phoneNumber`, `Adhar_Detailscol`) VALUES ('87236', 'Shahi', 'Mysore', '34643', 'verified');\r\n"
						+ "";
				boolean insert = statement1.execute(inserting);
				System.out.println(insert + "INSERTED DATA SUCCESSFULLY INTO THE DATABASE");

				Statement statement2 = connection.createStatement();
				

				/*
				 * System.out.println("Updating Details SuccessFully"); Statement
				 * statement2=connection.createStatement();
				 * 
				 * String
				 * update="UPDATE `jdbcproject`.`adhar_details` SET `Name` = 'Renuu', `Address` = 'dharwadaa' WHERE (`AdharNumberl` = '1343');\r\n"
				 * + ""; Boolean updatee=statement2.execute(update);
				 * System.out.println(updatee+"Updated Successfully");
				 */

				/*
				 * Statement statement2=connection.createStatement();
				 * 
				 * String
				 * delete="DELETE FROM `jdbcproject`.`adhar_details` WHERE (`AdharNumberl` = '23423');\r\n"
				 * + ""; Boolean deletee=statement2.execute(delete);
				 * System.out.println(deletee+"Deleted Successfully");
				 * 
				 */

				System.out.println("===================Prepared Statement CRUD OPERATIONS=================");

				/*
				 * String
				 * preparedInsertingValues="INSERT INTO jdbcproject.adhar_details (AdharNumberl, Name, Address, phoneNumber, Adhar_Detailscol) "
				 * + " VALUES (?, ?, ?, ?, ?);\r\n" + "";
				 * 
				 * 
				 * PreparedStatement preparedStatement1 =
				 * connection.prepareStatement(preparedInsertingValues);
				 * 
				 * preparedStatement1.setInt(1, 111111); preparedStatement1.setString(2,
				 * "Ayush"); preparedStatement1.setString(3, "Karnataka");
				 * preparedStatement1.setInt(4, 111111); preparedStatement1.setString(5,
				 * "NotVerified");
				 * 
				 * int INSERT=preparedStatement1.executeUpdate();
				 * System.out.println(INSERT+"Inserted Sucessfully");
				 */

				
				String preparedUpdating = "UPDATE jdbcproject.adhar_details SET Adhar_Detailscol = ? WHERE (AdharNumberl = ?);\r\n"
						+ "";
				PreparedStatement preparedStatement1 = connection.prepareStatement(preparedUpdating);

				preparedStatement1.setString(1, "VERIFIED");
				preparedStatement1.setInt(2, 8734);

				int UPDATE = preparedStatement1.executeUpdate();
				System.out.println(UPDATE + "Updated Sucessfully");
				 

				System.out.println("===========Prepared Statement by using deleting Operation===============");
				String preparedDeleting = "DELETE FROM jdbcproject.adhar_details WHERE (AdharNumberl = ?);\r\n" + "";
				PreparedStatement preparedStatement2 = connection.prepareStatement(preparedDeleting);
				preparedStatement1.setInt(1, 1234);
				int UPDATEe = preparedStatement2.executeUpdate();

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
