package com.good.main;

import java.sql.SQLException;
import java.util.List;

import com.good.dao.LibraryDAOImplementation;
import com.good.dto.LibraryDTO;

public class LibraryRunner {
	
	public static void main(String[] args) throws SQLException {

		LibraryDTO librarydto=new LibraryDTO();
		
		librarydto.setBook_No(1111);
		librarydto.setBook_Name("Data Structures and Algorithms");
		librarydto.setBook_Author("Sri Vignesh");
		librarydto.setBranch("ComputerScienceEngineering");
		librarydto.setBook_Issued("Issued Sucessfully");
		
		LibraryDAOImplementation libDaoImpl=new LibraryDAOImplementation();
		/*
		 * int result= libDaoImpl.add(librarydto);
		 * System.out.println("Inserted Successfully"+result);
		 */
		librarydto=	libDaoImpl.getLibrary(0);
	    System.out.println("Book_No ==>"+librarydto.getBook_No()+" "+"Book_Name ==>"+librarydto.getBook_Name()+" "+"Book_Author ==>"+librarydto.getBook_Author()+" "+"Branch_Book ==>"+librarydto.getBranch()+" "+"Book_Issued ==>"+" "+librarydto.getBook_Issued());
	    
	    List<LibraryDTO> listOfLibrary=libDaoImpl.getAll();
	    
	    for (LibraryDTO libraryDTO2 : listOfLibrary) {
	    	
	    	System.out.println(libraryDTO2);
			
		}
	    
	    libDaoImpl.delete(2222);
	    
	    libDaoImpl.update(librarydto);

	}
}
