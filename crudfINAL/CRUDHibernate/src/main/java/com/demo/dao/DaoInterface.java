package com.demo.dao;

import java.util.List;

import com.demo.model.Books;

public interface DaoInterface {

	void addBook(Books b);

	List<Books> DisplayAll();

	Books getById(int id);

	

	Books Update(Books b);

}
