package CoreSpring4FactoryDI;


public class Exam {
	private String name;
	private String startdate;
	private String enddate;
	private String duration;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Exam [name=" + name + ", startdate=" + startdate + ", enddate=" + enddate + ", duration=" + duration
				+ "]";
	}

	

}

