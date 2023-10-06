package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userinfo")
public class lmsuser {
	@Id
	int uid;
	String email;
	int pass;
	String name;
	String address;
	int mobile;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
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
	@Override
	public String toString() {
		return "user [uid=" + uid + ", email=" + email + ", pass=" + pass + ", name=" + name + ", address=" + address
				+ ", mobile=" + mobile + "]";
	}
	
}
