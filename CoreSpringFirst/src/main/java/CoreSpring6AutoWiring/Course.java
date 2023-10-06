package CoreSpring6AutoWiring;

public class Course {
	
	private String name;
	private int duration;
	private Faculty faculty;                                                
	public Course( Faculty faculty) {
		this.faculty = faculty;
	} // this ctor is only for auto wire through ctor in .xml file
	public Course() {

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
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}


}
