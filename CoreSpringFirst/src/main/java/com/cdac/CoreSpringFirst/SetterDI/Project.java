package com.cdac.CoreSpringFirst.SetterDI;

public class Project {
	private String Name;
	private String technology;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	@Override
	public String toString() {
		return "Project [Name=" + Name + ", technology=" + technology + "]";
	}
	
	
}
