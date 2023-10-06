package com.Aopspring_2Aopspring_Annotation;

public class Employee {

String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
	}

@Override
public String toString() {
	return "Employee [name=" + name + "]";
}

void register() {
	System.out.println("im in employee registration section..");
	
}

}
