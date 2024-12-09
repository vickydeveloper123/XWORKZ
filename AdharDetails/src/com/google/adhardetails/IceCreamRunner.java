package com.google.adhardetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class IceCreamRunner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		IceCreamRunner runner = new IceCreamRunner();

		int ch;

		do {

			System.out.println("Enter ur coice");
			System.out.println("1.Inserting the data");
			System.out.println("2.Displaying the data");
			System.out.println("3.Updating the data");
			System.out.println("4.Deleting the data");
			System.out.println("5.Exit");
			System.out.println("Thank you for Shopping");

			ch = sc.nextInt();

			switch (ch) {
			case 1:

				runner.insertData();

				break;

			case 2:

				runner.displayData();

				break;

			case 3:
				runner.updateData();
				break;

			case 4:
				runner.deleteData();
				break;

			case 5:
				System.out.println("Thank You For Visting Us");
			}

		} while (ch != 5);
		System.out.println("Application Closed");

	}

	public void deleteData() {

	}

	public void updateData() {

	}

	public void displayData() {

	}

	public void insertData() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject", "root",
					"Vignesh@8368");
			System.out.println("DriverManager is Sucessfull");
			/*
			 * IceCream icecream = new IceCream();
			 * 
			 * System.out.println("Enter the IceCream Name");
			 * 
			 * String iname = sc.next(); icecream.setIceName(iname);
			 * 
			 * System.out.println("Enter the IceCream Flavour"); String ifalvour =
			 * sc.next(); icecream.setIceFlavour(ifalvour);
			 * 
			 * System.out.println("Enter the IceCream Cost"); double iflavour =
			 * sc.nextDouble(); icecream.setIcePrice(iflavour);
			 */

			String inserting = "INSERT INTO jdbcproject.icecream (icecream_no, icecreamName, icecream_Flavour, icecream_Price) VALUES (?, ?,?,?);\r\n"
					+ "";

			PreparedStatement preparedStatement = connection.prepareStatement(inserting);

			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, "Venilla");
			preparedStatement.setString(2, "Venilla");
			preparedStatement.setInt(4, 100);

			int inserted = preparedStatement.executeUpdate();
			System.out.println(inserted + "insertedSucessfully");

			if (inserted == 1) {
				System.out.println("Updated Sucessfully into the database");

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
