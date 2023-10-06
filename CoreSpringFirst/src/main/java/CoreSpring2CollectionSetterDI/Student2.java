package CoreSpring2CollectionSetterDI;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student2 {
	private int rollno;
	private String Name;
	private double marks;
	private Project2 proj;
	public Set<String> getEmail() {
		return email;
	}
	public void setEmail(Set<String> email) {
		this.email = email;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Map<String, Integer> getCourse() {
		return course;
	}
	public void setCourse(Map<String, Integer> course) {
		this.course = course;
	}
	private Set<String> email;
	private List<String> phone;
	private Map<String,Integer> course;
	
	
	
	
	
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
	@Override
	public String toString() {
		return "Student2 [rollno=" + rollno + ", Name=" + Name + ", marks=" + marks + ", proj=" + proj + ", email="
				+ email + ", phone=" + phone + ", course=" + course + "]";
	}
	public Project2 getProj() {
		return proj;
	}

	/*
	 * @Override public String toString() { return "Student2 [rollno=" + rollno +
	 * ", Name=" + Name + ", marks=" + marks + ", proj=" + proj + "]"; }
	 */
	public void setProj(Project2 proj) {
		this.proj = proj;
	}


}
