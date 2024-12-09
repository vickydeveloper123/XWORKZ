package com.google.dbconstants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.google.dbconstants.DBConstants.DBConstant;
import com.mysql.cj.jdbc.JdbcPreparedStatement;

public class Batchupdate {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("btachupdated sucessfully");
		Connection cn=null;
		JdbcPreparedStatement psmt=null;
		String insert="INSERT INTO jdbcproject.adhar_details (AdharNumberl,Name, Address, phoneNumber, Adhar_Detailscol)"
				+ " VALUES (?, ?,?, ?, ?);\r\n"
				+ "";
		try {
			Class.forName(DBConstant.DRIVER_CLASS_NAME);
			Connection con=DriverManager.getConnection(DBConstant.DRIVER_URL,DBConstant.USER_NAME,DBConstant.USER_PASSWORD);
			System.out.println("db connected");
			PreparedStatement pmt=con.prepareStatement(insert);
			pmt.setInt(1, 45343);
			pmt.setString(2, "MyDarling");
			pmt.setString(3, "Nellore");
			pmt.setInt(4, 4000);
			pmt.setString(5, "VERIFICATION IS IN PROCESS");
			pmt.addBatch();
			
			int[]noofrecords=pmt.executeBatch();
			System.out.println("noofrecords");
			
			System.out.println("execute query");
		}
			finally {
				if(psmt!=null) {
					((Connection) psmt).close();
					psmt.close();
					System.out.println("Connection Closes Sucessfully");
		
				}
			}
		
	}

	
}
