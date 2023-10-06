package day20GenericCollections;

public class ExampleGeneric_toString {
	public static void main(String[] args)
	{
		Testp<Integer> t = new Testp<Integer>(10,20);
		t.display();
		System.out.println(t);
	}

}
class Testp<T>{
	T a,b;
	public Testp(T i, T j) {

		this.a=i;
		this.b=j;
	}
	void display() {

		System.out.println(a +" "+b);
	}
	public String toString() {

		
		return (a+" "+b);
	}
}
