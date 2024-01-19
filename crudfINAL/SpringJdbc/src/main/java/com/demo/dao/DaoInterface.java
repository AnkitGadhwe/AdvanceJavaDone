package com.demo.dao;

import java.util.List;

import com.demo.model.MenuCard;

public interface DaoInterface {

	List<MenuCard> displayAll();

	void insertData(MenuCard m);

	void Delete(int id);

}
