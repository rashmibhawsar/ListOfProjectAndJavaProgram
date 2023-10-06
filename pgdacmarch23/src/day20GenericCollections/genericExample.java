package day20GenericCollections;

 public class genericExample {

	public static void main(String[] args) {

		 
		Test <Integer>r= new Test(10,20);
		r.display();
		Test <Float> r1= new Test(10.22f,20.23f);
		r1.display();
		Test <String> r2= new Test("abc","xyz");
		r2.display(); 
	}

} 
/*{

	public static void main(String[] args) {

		 
		Test <Integer>r= new Test(10,20);
		r.display();
		Test <Float> r1= new Test(10.22f,20.23f);
		r1.display();
		Test <String> r2= new Test("abc","xyz");
		r2.display(); 
	}

} {

}
//parametreized classes 
class Test <T>
{
	T a,b;
	Test(T  a , T b)
	{
		this.a=a;
		this.b=b;
	}
	void display()
	{		System.out.println(a +"    "+ b);	}
}
public class GenericExample1 {

	public static void main(String[] args) {
		 
		Test <Integer>r= new Test(10,20);
		r.display();
		Test <Float> r1= new Test(10.22f,20.23f);
		r1.display();
		Test <String> r2= new Test("abc","xyz");
		r2.display(); 
	}

}*/
//parametreized classes 
class Test <T>
{
	T a,b;
	Test(T  a , T b)
	{
		this.a=a;
		this.b=b;
	}
	void display()

	{		System.out.println(a +"    "+ b);	}
}