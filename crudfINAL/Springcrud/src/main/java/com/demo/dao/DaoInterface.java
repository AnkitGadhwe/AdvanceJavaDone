package com.demo.dao;

import java.util.List;

import com.demo.model.Books;

public interface DaoInterface {

	void AddnewBook(Books b);

	List<Books> displayAll();

	Books DisplayById(int id);

}
