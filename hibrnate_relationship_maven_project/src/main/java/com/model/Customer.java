package com.model;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class Customer {


	@Id
	int cid;
	String email;
String pass;
String name;
String address;
int mobile;
@ManyToOne
(fetch = FetchType.EAGER)
@JoinColumn(name="sid")
SellerDetails sd;


public int getCid() {

	return cid;
}
public void setCid(int cid) {

	this.cid = cid;
}
public String getEmail() {


	return email;
}
public SellerDetails getSd() {

	return sd;
}
public void setSd(SellerDetails sd) {

	this.sd = sd;
}
public void setEmail(String email) {


	this.email = email;
}
public String getPass() {


	return pass;
}
public void setPass(String pass) {


	this.pass = pass;
}
public String getName() {

	return name;
}
public void setName(String name) {

	this.name = name;
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
