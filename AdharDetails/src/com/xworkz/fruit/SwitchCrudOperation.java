package com.xworkz.fruit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class SwitchCrudOperation {
	public static void main(String[] args) {
		Scanner take = new Scanner(System.in);
		System.out.println("choose the operation \n 1) INSERT \n 2) DELET \n 3) UPDATE \n 4) READ");
		int option = take.nextInt();
		System.out.println("");
		System.out.println();
		switch (option) {
		case 1:
			SwitchCrudOperation.insertData();
			break;
		case 2:
			SwitchCrudOperation.deletData();
			break;
		case 3:
			SwitchCrudOperation.upData();
			break;
		case 4:
			SwitchCrudOperation.getAllData();
			break;
		default:
			System.out.println("selest the number betwwen 1 to 4");
			break;
		}
	}
	public static void insertData() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class is loaded");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject", "root",
					"Vignesh@8368");
			Statement statement = connection.createStatement();
			System.out.println("database is connected with sql");
			String sqlInsert = "INSERT INTO `jdbcproject`.`phonedetails` (`PhoneName`, `phoneCost`, `phoneManufacturingLocation`, `price`, `itemsSoldPerMonth`) VALUES ('xworkz123', '535835', 'Nellore', '5145465', '25');\r\n"
					+ "";
			boolean result = statement.execute(sqlInsert);
			System.out.println("data insserted succesfully to database");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	public static void upData() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class is loaded");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject", "root",
					"Vignesh@8368");
			Statement statement = connection.createStatement();
			System.out.println("database is connected with sql");
			String updatequery = "UPDATE `jdbcproject`.`phonedetails` SET `phoneCost` = '123456', `phoneManufacturingLocation` = 'Nellore-Mumbai' WHERE (`PhoneName` = 'xworkz123');\r\n"
					+ "";
			int noof = statement.executeUpdate(updatequery);
			System.out.println(noof + "data updated succesfully to database");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	public static void deletData() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class is loaded");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject", "root",
					"Vignesh@8368");
			Statement statement = connection.createStatement();
			System.out.println("database is connected with sql");
			String deletquery = "DELETE FROM `jdbcproject`.`phonedetails` WHERE (`PhoneName` = 'Vivo');\r\n"
					+ "";
			int noof = statement.executeUpdate(deletquery);
			System.out.println(noof + "data deleted succesfully to database");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	public static void getAllData() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class is loaded");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject", "root",
					"Vignesh@8368");
			
			Statement statement = connection.createStatement();
			System.out.println("database is connected with sql");
			String getData = "SELECT * FROM jdbcproject.phonedetails";

			ResultSet takenData = statement.executeQuery(getData);
			takenData.next();
			while (takenData.next()) {
				System.out.println(takenData.getString("PhoneName") + "  " + takenData.getInt("phoneCost") + "  "
						+ takenData.getString("phoneManufacturingLocation") + "  " + takenData.getInt("phoneCost")+" "+takenData.getInt("itemsSoldPerMonth"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		}
}