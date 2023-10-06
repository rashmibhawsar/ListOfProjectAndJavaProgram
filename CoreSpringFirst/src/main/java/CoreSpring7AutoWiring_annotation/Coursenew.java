package CoreSpring7AutoWiring_annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import CoreSpring6AutoWiring.Faculty;

public class Coursenew {
	private String name;
	private int duration;
	@Autowired
	@Qualifier("fac1")
	private Facultynew faculty;                                                
	public Coursenew( Facultynew faculty) {
		this.faculty = faculty;
	} // this ctor is only for auto wire through ctor in .xml file
	public Coursenew() {

		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", duration=" + duration + ", faculty=" + faculty + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Facultynew getFaculty() {
		return faculty;
	}
	public void setFaculty(Facultynew faculty) {
		this.faculty = faculty;
	}


}
