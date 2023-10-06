/*Q 3 . Write a program in java. A class Teacher contains 
 * two fields Name and Qualification. 
 * Extends the class to department it contains dept. no and Dept Name. 
 * An interface named as college it contains one field name of the college.
 *  Using the above classes and interface get the 
 *  appropriate information and display it.*/
package day15_assig_inheriatanc;
interface collage{
	String collageName="cdacNoida";
	void StudentDetails();
}
public class CollageInterface {
	public static void main(String args[]) {
		Teacher t = new Teacher();
		t.StudentDetails();
		t.display();
	}

}
class department{
	String deptName ="pgDac";
	int deptNo =32;
	
}

class Teacher extends department implements collage{
	String name ="gupta_mam";
	String qualification="xyz";
	void display() {
		System.out.println("teacher name: "+name);
		System.out.println("teacher qualification: "+qualification);
		System.out.println("dept name: "+deptName);
		System.out.println("dept no: "+deptNo);
		System.out.println("collage name: "+collageName);
		}
		

	public void  StudentDetails() {
		String studentname="rashmi";
	}
}
