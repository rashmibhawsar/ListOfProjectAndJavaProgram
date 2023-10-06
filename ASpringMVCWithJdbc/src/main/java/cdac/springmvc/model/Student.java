package cdac.springmvc.model;

public class Student {
	public int id;
	String name;
	String address;
	
	int marks;
	
	public Student(int id, String name, String address, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}

	

}
