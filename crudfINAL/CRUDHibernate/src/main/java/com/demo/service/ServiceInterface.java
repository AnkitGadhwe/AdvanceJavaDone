package com.demo.service;

import java.util.List;

import com.demo.model.Books;

public interface ServiceInterface {

	void AddData();

	List<Books> DisplayAll();

	Books DisplayById();

	Books Update();

}
