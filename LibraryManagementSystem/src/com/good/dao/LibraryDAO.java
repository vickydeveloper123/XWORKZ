package com.good.dao;

import java.sql.SQLException;
import java.util.List;

import com.good.dto.LibraryDTO;

public interface LibraryDAO {

	public int add(LibraryDTO library) throws SQLException;

	public void delete(int no) throws SQLException;

	public void update(LibraryDTO library) throws SQLException;

	public LibraryDTO getLibrary(int id) throws SQLException;

	public List<LibraryDTO> getAll() throws SQLException;

}
