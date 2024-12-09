package com.good.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

	private static Connection connection = null;

	static {
		String DRIVER = "com.mysql.cj.jdbc.Driver";
		String URL = "jdbc:mysql://localhost:3306/jdbcproject";
		String USER = "root";
		String PASS = "Vignesh@8368";

		try {
			Class.forName(DRIVER);
			connection   =  DriverManager.getConnection(URL, USER, PASS);
			System.out.println("DriverManager Connection is Sucess");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getDataBaseConnection() {
		return connection;
	}

}
