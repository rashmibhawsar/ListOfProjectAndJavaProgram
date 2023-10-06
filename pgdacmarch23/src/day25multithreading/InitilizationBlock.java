package day25multithreading;


//mcq 
//what can be defined in a java class

class Tester
{
	int y;//non static variable 
	static int z;// static variable 
	void print() {} //non static method
	static void show() {} //static method 
	 
	{  y=100;
	   System.out.println("initialization block "+y);
	}
	
	static 
	{   z=22;
		System.out.println("static initilaization block"+z);
	}
	Tester()
	{
		System.out.println("constructor");
	}
}
public class InitilizationBlock {

	public static void main(String[] args) {
		Tester r= new Tester();

	}

}