package day19_serialization;

import java.io.Serializable;
//Serializable  is a marker interface 
//marker interface are empty interface 
public class Emp implements Serializable{

	String address;
	int  empid;
	String name;
	Emp(){}
	public Emp(int empid, String name, String address) {
		super();
		this.empid = empid;
		this.name = name;
		this.address = address;
	}
	void display()

	{
		System.out.println(empid +"  "+ name +"  "+address);
	}
	
}
