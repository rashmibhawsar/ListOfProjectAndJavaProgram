package _4_arrays;

public class arrayMain {

	public static void main(String[] args) {

		Array a = new Array();
		a.create(5);
		System.out.println("create set of array elements");
		a.display();
		System.out.println();
		System.out.println("insert array element at pos 2");
		a.addpos(2,10);
		a.display();
		System.out.println("remove at last************");
		a.removeatlast();
		a.display();
		System.out.println("remove at pos  2 ************");
		a.removeAtpos(2);
		a.display();

	}

}
