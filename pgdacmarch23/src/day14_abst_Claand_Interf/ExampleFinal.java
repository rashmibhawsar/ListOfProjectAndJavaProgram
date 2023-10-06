package day14_abst_Claand_Interf;
public class ExampleFinal extends student5 implements student4{
	public static void main(String[] args) {
		
		student1 s1 = new student1();
		student1.input1();//static way...class name with method
		s1.input1();//its not good way
		
		ExampleFinal e = new ExampleFinal();
		e.show();
		e.display1();
		e.displayStudent4();
		e.show4();
		e.show1();
		e.show2();
		
	}
	public void displayStudent4() {
		System.out.println("this is interface class student4 implemented");
		
	}

	public void  show4(){
		System.out.println("this is interface class student3 implemented");
		
	}

}

final class student1{
static int b;
static void input1() {
	//a=30; can't make static refernce to non static members
	b= 40;
	System.out.println(b);
	
	}
int a;
final int c=50;
public student1() {
	a=20;
	b=30;// can define static variable inn non static method
	//c=40; final variable cannot be assigned
	}
	
}
abstract class student2{
	
	 void show() {
		System.out.println("hello");
	}
	 
	 public abstract void show1();
	 
	final void show2() {
		int d=24;
		System.out.println("d : " +d);
		
	}
	
}
interface student3{
	/*void show2() {
		System.out.println("hello");
	} you cant define method inside interface
}*/
	void show4();
		
	
}
interface student4 extends student3{
	void displayStudent4();
		
	}
//public class ExampleFinal extends student2 implements student3,student4
//public class ExampleFinal extends student1 implements student3,student4 xxxxx
//public class ExampleFinal extends student2 implements student4
class student5 extends student2{
	void display1() {
		System.out.println("display....");

	}
	 public void show1() {
		System.out.println("im show2 im abs class student2 ");
	}
}
