package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.MenuCard;

@Repository
public class DaoImp implements DaoInterface{
   @Autowired
	private JdbcTemplate jdbcT;
	@Override
	public List<MenuCard> displayAll() {
		return jdbcT.query("Select * from menucard", (res,num)->{
			MenuCard m = new MenuCard();
			m.setId(res.getInt(1));
			m.setName(res.getString(2));
			m.setRate(res.getString(3));
			return m;
		});
		//list.forEach(System.out::println
		
	}
	@Override
	public void insertData(MenuCard m) {
		jdbcT.update("insert into menucard values(?,?,?)",new Object[] {m.getId(),m.getName(),m.getRate()});
		
	}
	@Override
	public void Delete(int id) {
		jdbcT.update("delete from menucard where id=?",new Object[] {id});
		
	}

}
