package model;

import jakarta.persistence.Entity;

@Entity
public class Bookpojo {
	private int isbn;
	private int price;
	private int noOfPage;
	private String bname;
	private String aname;
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNoOfPage() {
		return noOfPage;
	}
	
	public void setNoOfPage(int noOfPage) {
		this.noOfPage = noOfPage;
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

	@Override
	public String toString() {
		return "Bookpojo [isbn=" + isbn + ", price=" + price + ", noOfPage=" + noOfPage + ", bname=" + bname
				+ ", aname=" + aname + "]";
	}
	

}
