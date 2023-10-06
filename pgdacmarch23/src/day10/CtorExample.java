package day10;
public class CtorExample {
	public static void main(String args[]) {

		demo d = new demo();
		d.show();
		demo d1 = new demo(5,6);
		d1.show();
		
		
		
	
	}

}

class demo{
	int a;
	int b;
	demo()
	{
		a=0;
		b=0;
	}
	demo(int a,int b)
	{
		this.a= 10;
		this.b=5;
	}
	
	
	public void show(){
		System.out.println(a);
		System.out.println(b);
	}
}
