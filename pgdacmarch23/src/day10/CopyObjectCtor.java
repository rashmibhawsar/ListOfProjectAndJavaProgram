package day10;

public class CopyObjectCtor {
	public static void main(String args[]) {
		demo d = new demo();
		demo d1 = new demo(55,66);
		//d1.a = d.a;
		//d1.b= d.b;
		
		d.show();
		d1.show();
		demo d2 = new demo(d);
		d2.show();
		
	}

}

class demo{
	int a;
	int b;
	demo()
	{
		a= 10;b=5;
	}
	demo(demo m){
		this.a= m.a;
		this.b= m.b;}
	
	demo(int a,int b){
		this.a= a;
		this.b= b;}
	
	public void show(){
		System.out.println(a);
		System.out.println(b);
	}
}
