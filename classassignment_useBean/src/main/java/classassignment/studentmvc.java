package classassignment;


//getter &setter
//model class |bean class |Pojo class

//bean class private fields ,public getter,setter 
public class studentmvc {

	 int rollno;
	String name,whichclass,gender,country;
	String extra[];
	public void setExtra(String[] extra) {
		this.extra = extra;
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWhichclass() {
		return whichclass;
	}
	public void setWhichclass(String whichclass) {
		this.whichclass = whichclass;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
