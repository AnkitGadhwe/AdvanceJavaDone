package com.demo.service;

import java.util.List;

import com.demo.model.Books;

public interface ServiceInterface {

	void AddNewBook();

	List<Books> DisplayAll();

	Books DisplayById();

}
