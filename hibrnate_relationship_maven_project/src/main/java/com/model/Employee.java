package com.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {

	
	@Id
	int empid;
	String ename;
	String address;
	@ManyToOne
	@JoinColumn(name="deptno")
	Department d;
	
	public Department getD() {
		return d;
	}
	public void  setD(Department d) {
		this.d = d;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}

