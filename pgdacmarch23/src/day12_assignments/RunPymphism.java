package day12_assignments;

//Q 8 wap to perform addition of two three and fourth integer numbers using functions
//(use polymorphism)

class demo1Ctor{
	int a;
	int b;
	{
		a= 10;b=5;
	}
	demo1Ctor() {
		// TODO Auto-generated constructor stub
	}
	demo1Ctor(int a,int b){

		System.out.println("sum is 2 parameter is : " +a+b);}
	demo1Ctor(int a,int b,int c){

		System.out.println("sum is 3 parameter is : " +(a+b+c));}
	demo1Ctor(int a,int b,int c,int d){

		System.out.println("sum is 4 parameter is : " +(a+b+c+d));}
	

}

public class RunPymphism {
	public static void main(String args[]) {

		demo1Ctor d = new demo1Ctor();
		demo1Ctor d1 = new demo1Ctor(55,66);
		demo1Ctor d2 = new demo1Ctor(55,66,78);
		demo1Ctor d3 = new demo1Ctor(55,66,9,5);
	
	
	}

}
