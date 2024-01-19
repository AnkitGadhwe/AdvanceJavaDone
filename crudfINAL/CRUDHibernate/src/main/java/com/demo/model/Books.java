package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class Books {
	@Id
 private int bid;
 private String bname;
 private String type;
 private int cost;
public Books() {
	super();
}
public Books(int bid, String bname, String type, int cost) {
	super();
	this.bid = bid;
	this.bname = bname;
	this.type = type;
	this.cost = cost;
}
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "Books [bid=" + bid + ", bname=" + bname + ", type=" + type + ", cost=" + cost + "]";
}
 
 
 
}
