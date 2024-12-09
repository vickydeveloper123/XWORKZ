package com.good.dto;

public class LibraryDTO {
	
	int Book_No;
	String Book_Name;
	String Book_Author;
	String Branch;
	String Book_Issued;
	
	public LibraryDTO() {

		System.out.println("Running Library");
	}

	public LibraryDTO(int book_No, String book_Name, String book_Author, String branch, String book_Issued) {
		super();
		Book_No = book_No;
		Book_Name = book_Name;
		Book_Author = book_Author;
		Branch = branch;
		Book_Issued = book_Issued;
	}

	public int getBook_No() {
		return Book_No;
	}

	public void setBook_No(int book_No) {
		Book_No = book_No;
	}

	public String getBook_Name() {
		return Book_Name;
	}

	public void setBook_Name(String book_Name) {
		Book_Name = book_Name;
	}

	public String getBook_Author() {
		return Book_Author;
	}

	public void setBook_Author(String book_Author) {
		Book_Author = book_Author;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

	public String getBook_Issued() {
		return Book_Issued;
	}

	public void setBook_Issued(String book_Issued) {
		Book_Issued = book_Issued;
	}

	@Override
	public String toString() {
		return "LibraryDTO [Book_No=" + Book_No + ", Book_Name=" + Book_Name + ", Book_Author=" + Book_Author
				+ ", Branch=" + Branch + ", Book_Issued=" + Book_Issued + "]";
	}
	
	

}
