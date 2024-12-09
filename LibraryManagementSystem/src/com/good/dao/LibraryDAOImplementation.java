package com.good.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.good.dto.LibraryDTO;
import com.good.util.DBScript;
import com.good.util.DataBaseConnection;

public class LibraryDAOImplementation implements LibraryDAO {

	static Connection connection = DataBaseConnection.getDataBaseConnection();

	@Override
	public int add(LibraryDTO library) throws SQLException {
		PreparedStatement preparedstatement = connection.prepareStatement(DBScript.insert);

		preparedstatement.setInt(1, library.getBook_No());
		preparedstatement.setString(2, library.getBook_Name());
		preparedstatement.setString(3, library.getBook_Author());
		preparedstatement.setString(4, library.getBranch());
		preparedstatement.setString(5, library.getBook_Issued());

		int insertedDetails = preparedstatement.executeUpdate();
		System.out.println("Inserted Details sucessFully into the database ===>" + insertedDetails);

		return insertedDetails;
	}

	@Override
	public void delete(int no) throws SQLException {

		PreparedStatement preparedstatement = connection.prepareStatement(DBScript.deletingData);

		preparedstatement.setInt(1, 1111);

		int deleting = preparedstatement.executeUpdate();
		System.out.println("Deleting Information Sucessfully" + deleting);

	}

	@Override
	public void update(LibraryDTO library) throws SQLException {

		PreparedStatement preparedstatement = connection.prepareStatement(DBScript.updatingDetails);

		preparedstatement.setString(1, "herberdtSchildt(TheProgrammer)");
		preparedstatement.setInt(2, 222);

		int updated = preparedstatement.executeUpdate();
		System.out.println("Details Sucessfully Updated in the database" + updated);

	}

	@Override
	public LibraryDTO getLibrary(int id) throws SQLException {

		PreparedStatement preparedstatement = connection.prepareStatement(DBScript.getBookByNum);
		preparedstatement.setInt(1, id);

		ResultSet resultSet = preparedstatement.executeQuery();

		LibraryDTO libraryDto = new LibraryDTO();

		boolean isPresent = false;

		while (resultSet.next()) {

			isPresent = true;

			libraryDto.setBook_No(resultSet.getInt("Book_No"));
			libraryDto.setBook_Name(resultSet.getString("Book_Name"));
			libraryDto.setBook_Author(resultSet.getString("Book_Author"));
			libraryDto.setBranch(resultSet.getString("Branch"));
			libraryDto.setBook_Issued(resultSet.getString("Book_Issued"));

		}
		if (isPresent) {
			return libraryDto;
		} else {
			return null;
		}

	}

	@Override
	public List<LibraryDTO> getAll() throws SQLException {

		PreparedStatement preparedstatement = connection.prepareStatement(DBScript.fetchingData);
		ResultSet resultSet = preparedstatement.executeQuery();

		List<LibraryDTO> lists = new ArrayList<>();

		while (resultSet.next()) {
			LibraryDTO libraryDto = new LibraryDTO();

			libraryDto.setBook_No(resultSet.getInt("Book_No"));
			libraryDto.setBook_Name(resultSet.getString("Book_Name"));
			libraryDto.setBook_Author(resultSet.getString("Book_Author"));
			libraryDto.setBranch(resultSet.getString("Branch"));
			libraryDto.setBook_Issued(resultSet.getString("Book_Issued"));

			lists.add(libraryDto);

		}

		return lists;
	}

}
