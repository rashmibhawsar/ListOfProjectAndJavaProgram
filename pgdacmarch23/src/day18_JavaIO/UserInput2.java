package day18_JavaIO;
import java.io.*;


public class UserInput2 {

	public static void main(String[] args) {
		try {
		UserInput2 i= new UserInput2();
		i.adddata();
		i.display();
		}catch(Exception f)
		{
			System.out.println(f);
		}
	}
	int age;
	String name;
	
	
  float salary;
  void adddata() throws Exception
  {
	System.out.println("enter name ,age,salary ");
	BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
	name= b.readLine();
	age= Integer.parseInt(b.readLine());
	salary= Float.parseFloat(b.readLine());
	
	
  }
	
	void display()
	  {
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	  }
}
	