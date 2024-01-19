package com.demo.model;

public class Books {
  private int bookId;
  private String bname;
  private String Type;
  private int cost;
public Books() {
	super();
}
public Books(int bookId, String bname, String type, int cost) {
	super();
	this.bookId = bookId;
	this.bname = bname;
	Type = type;
	this.cost = cost;
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getType() {
	return Type;
}
public void setType(String type) {
	Type = type;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "Books [bookId=" + bookId + ", bname=" + bname + ", Type=" + Type + ", cost=" + cost + "]";
}
  
  
  
}
