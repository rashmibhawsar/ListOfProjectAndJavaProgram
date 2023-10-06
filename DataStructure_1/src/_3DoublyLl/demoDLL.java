package _3DoublyLl;

public class demoDLL {

	public static void main(String[] args) {

		Doublyll dl = new Doublyll();
		System.out.println("******add set of elements*********");
		dl.create(5);
		dl.display();
		System.out.println("******insert at last*********");
		dl.addlast(3);
		dl.display();
		System.out.println("******insert at first*********");
		dl.addfirst(10);
		dl.display();
		System.out.println("******insert at pos*********");
		dl.inseratpos(5, 11);
		dl.display();
		
		System.out.println("******delete at last*********");
		dl.deleteatlast();
		dl.display();
		System.out.println("******delete at first*********");
		dl.deleteatfirst();
		dl.display();
		System.out.println("******delete at position*********");
		dl.deleteatpos(2);
		dl.display();
		
		System.out.println("******display in reverse*********");
		dl.displayreverse();
		

	}

}
