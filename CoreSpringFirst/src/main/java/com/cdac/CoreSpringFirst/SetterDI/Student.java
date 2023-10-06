package com.cdac.CoreSpringFirst.SetterDI;

public class Student {
private int rollno;
private String Name;
private double marks;
private Project proj;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
public Project getProj() {
	return proj;
}
public void setProj(Project proj) {
	this.proj = proj;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", Name=" + Name + ", marks=" + marks + ", proj=" + proj + "]";
}


}
