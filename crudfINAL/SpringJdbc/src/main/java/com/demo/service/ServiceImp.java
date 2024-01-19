package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.DaoInterface;
import com.demo.model.MenuCard;
@Service
public class ServiceImp implements ServiceInterface{
    @Autowired
	private DaoInterface d;
	@Override
	public List<MenuCard> displayAll() {
		
		return d.displayAll();
	}
	@Override
	public void insertData(MenuCard m) {
		d.insertData(m);
		
	}
	@Override
	public void DeleteProduct(int id) {
		d.Delete(id);
		
	}

}
