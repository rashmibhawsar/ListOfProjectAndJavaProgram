package com.model;


import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sellerdetails")
public class SellerDetails {
    @Id
 
	int regno;
    @Column(name="companyname") 
	String companyname;
    @Column(name="address")
	String address;
    @Column(name="mobile")//-- here u van give col name for table.. it will take only given @column  in mysql-->
	int mobile;

	public int getRegno() {

		return regno;
	}
	public void setRegno(int regno) {

		this.regno = regno;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobile() {

		return mobile;
	}
	public void setMobile(int mobile) {

		this.mobile = mobile;
	}
	
}
