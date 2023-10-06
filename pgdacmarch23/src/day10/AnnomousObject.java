package day10;

public class AnnomousObject {
	public static void main(String args[]) { 
		new demo1(22);
}

}

class demo1{
	int a;
	int b;
	demo1() 
	{
		a= 10;b=5;
	}
	demo1(int a){
		
		System.out.println("value of a :" +a);
	}
	
	demo1(int a,int b){ 
		
		this.a= a;
		this.b= b;}
	
	public void show(){ 
		System.out.println(a);
		System.out.println(b);
	}
}

