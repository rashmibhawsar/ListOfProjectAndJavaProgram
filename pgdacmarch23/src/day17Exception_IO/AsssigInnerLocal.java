package day17Exception_IO;

interface Admission{
	int age = 28;
	String name ="rashmi";
	public  abstract void registration();
	
}
 public class AsssigInnerLocal {
	public static void main(String args[]) {
		studentR s = new studentR();
		s.AddStudents();
		
		
	}
	

}

class studentR implements Admission
{
	void AddStudents()
	{
		
		class mtec implements Admission{
			public void information() {
				
				System.out.println("name: "+name +"age : "+age );
			}
			public void registration() {
				int reg_no= 255;
				System.out.println("registration no is : "+reg_no);
			}
			}
			mtec m = new mtec();
			m.information();
			m.registration();
			
			 new mtec()  {

				void displayy(){
					System.out.println("im in mba class displayy method and name ..." +name);
				}
			}.displayy();;
			}
	public void registration() {
		int reg_no= 45;
		System.out.println("registration no is : "+reg_no);
	}
}

