package com.demo.model;

public class MenuCard {
private int id;
private String name;
private String rate;
public MenuCard() {
	super();
}
public MenuCard(int id, String name, String rate) {
	super();
	this.id = id;
	this.name = name;
	this.rate = rate;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRate() {
	return rate;
}
public void setRate(String rate) {
	this.rate = rate;
}
@Override
public String toString() {
	return "MenuCard [id=" + id + ", name=" + name + ", rate=" + rate + "]";
}

}
