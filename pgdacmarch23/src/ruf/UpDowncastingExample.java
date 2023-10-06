package ruf;
class A{
	void show1()
	{
		System.out.println("im in class a show1");
	}
	
}
class B extends A{
	void show1()

	{
		System.out.println("im in class b show1");
	}
	void show2() {

		System.out.println("im in class b show2");
	}
	
	
}

public class UpDowncastingExample {

	public static void main(String[] args) {

		A obj1 = new B();//UPCASTING
		// or   A obj1 = (A)new B();
		obj1.show1();
		//obj1.show2();// can't acessign reference of class toB class method
		//B obj2 = obj1;
		//B obj3 = new A();//conver parent class object to child is not possible in inheritance
		B obj2 = (B)obj1;//DOWNCASTING
		obj2.show2();

	
	}

}
