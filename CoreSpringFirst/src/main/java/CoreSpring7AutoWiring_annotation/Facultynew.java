package CoreSpring7AutoWiring_annotation;


public class Facultynew {

	private String name;
	public String getName() {

		return name;
	}
	public void setName(String name) {

		this.name = name;
	}
	public String getExpertise() {

		return expertise;
	}
	public void setExpertise(String expertise) {

		this.expertise = expertise;
	}
	private String expertise;
	@Override
	public String toString() {

		return "Faculty [name=" + name + ", expertise=" + expertise + "]";
	}
	
	

}
