package day10;


public class CtorChaining {
	public static void main(String args[]) {

	demo2 obj =	new demo2(56);
}

}

class demo2{
	int a;
	int b;
	demo2()
	{
		a= 10;b=5;
		System.out.println("value of a & b :" +a+"  " +b);
	}
	demo2(int a){

		this(15,16);
		System.out.println("value of a :" +a);
	}
	
	demo2(int a,int b){

		this();
		this.a= a;
		this.b= b;
		System.out.println("value of a & b :" +a +" "  +b);
		}
	
	public void show(){

		System.out.println(a);
		System.out.println(b);
	}
}
