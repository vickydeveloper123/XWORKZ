package com.good.util;

public interface DBScript {
	
	public static final String DBCreate="CREATE TABLE `jdbcproject`.`library` (\r\n"
			+ "  `Book_No` INT NOT NULL,\r\n"
			+ "  `Book_Name` VARCHAR(45) NULL,\r\n"
			+ "  `Book_Author` VARCHAR(45) NULL,\r\n"
			+ "  `Branch` VARCHAR(45) NULL,\r\n"
			+ "  `Book_Issued` VARCHAR(45) NULL,\r\n"
			+ "  PRIMARY KEY (`Book_No`));";
	
	public static String insert="INSERT INTO `jdbcproject`.`library` (`Book_No`, `Book_Name`, `Book_Author`, `Branch`, `Book_Issued`) "
			+ "VALUES (?, ?, ?, ?, ?);\r\n"
			+ "";
	public static String getBookByNum="SELECT * FROM library WHERE Book_No=?";
	
	public static String fetchingData="SELECT * FROM library";
	
	public static String deletingData="DELETE FROM jdbcproject.library WHERE (Book_No =?)";
	
	
	public static String updatingDetails="UPDATE jdbcproject.library SET Book_Author = ? WHERE (Book_No = ?);\r\n"
			+ "";

}
