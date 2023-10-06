package CoreSpring3ThirdCtor;

public class Employee {

	private int emp_is;
	 private String name;
	 private String designation;
	
	
	public Employee(int emp_is, String name, String designation) {

		super();
		this.emp_is = emp_is;
		this.name = name;
		this.designation = designation;
	}/*
		 * public int getEmp_is() { return emp_is; } public void setEmp_is(int emp_is) {
		 * this.emp_is = emp_is; } public String getName() { return name; } public void
		 * setName(String name) { this.name = name; } public String getDesignation() {
		 * return designation; } public void setDesignation(String designation) {
		 * this.designation = designation; }
		 */
	@Override
	public String toString() {

		return "Employee [emp_is=" + emp_is + ", name=" + name + ", designation=" + designation + "]";
	}
	

	 

}
