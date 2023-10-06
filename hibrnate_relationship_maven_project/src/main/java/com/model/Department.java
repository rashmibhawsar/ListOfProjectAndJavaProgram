package com.model;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Department")
public class Department 
{
@Id
int deptno;
String dname;

@OneToMany(mappedBy="d")
Set<Employee> emp;


public Set<Employee> getEmp() {
	return emp;
}
public void setEmp(Set<Employee> emp) {
	this.emp = emp;
}
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}


}
