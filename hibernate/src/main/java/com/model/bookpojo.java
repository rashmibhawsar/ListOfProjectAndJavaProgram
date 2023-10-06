package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LMS123")
public class bookpojo {
	@Id
	int isfc;
	String bname;
String aname;
int price;
int noOfPages;
public int getIsfc() {
	return isfc;
}
public void setIsfc(int isfc) {
	this.isfc = isfc;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getNoOfPages() {
	return noOfPages;
}
public void setNoOfPages(int noOfPages) {
	this.noOfPages = noOfPages;
}
@Override
public String toString() {
	return "book [isfc=" + isfc + ", bname=" + bname + ", aname=" + aname + ", price=" + price + ", noOfPages="
			+ noOfPages + "]";
}


}
