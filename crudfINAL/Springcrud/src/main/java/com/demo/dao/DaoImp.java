package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Books;


@Repository
public class DaoImp implements DaoInterface{
@Autowired
private JdbcTemplate jdbcT;

@Override
public void AddnewBook(Books b) {
	jdbcT.update("insert into books values (?,?,?,?)",new Object[] {b.getBookId(),b.getBname(),b.getType(),b.getCost()});
}

@Override
public List<Books> displayAll() {
	
	List<Books> list = jdbcT.query("Select * from Books", (res,num)->{
		Books b =new Books();
		b.setBookId(res.getInt(1));
		b.setBname(res.getString(2));
		b.setType(res.getString(3));
		b.setCost(res.getInt(4));
		return b;
	});
	return list;
}

@SuppressWarnings("deprecation")
@Override
public Books DisplayById(int id) {
	 return  jdbcT.queryForObject("Select * from Books where bookId = ?",new Object[] {id},BeanPropertyRowMapper.newInstance(Books.class));
	
}




}
