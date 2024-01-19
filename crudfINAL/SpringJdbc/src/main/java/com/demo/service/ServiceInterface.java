package com.demo.service;

import java.util.List;

import com.demo.model.MenuCard;

public interface ServiceInterface {

	List<MenuCard> displayAll();

	void insertData(MenuCard m);

	void DeleteProduct(int id);

}
