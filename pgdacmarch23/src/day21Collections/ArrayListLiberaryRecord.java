package day21Collections;


import java.util.*;
class Book {

	String author_name;
	String book_name;
	int book_price;
	Book(String book_name,String author_name,int book_price){

		this.book_name=book_name;
		this.author_name=author_name;
		this.book_price=book_price;
	}
		public String toString() {


		return book_name+" "+author_name+" "+book_price;
	}//to display only bookname return only book name

}


public class ArrayListLiberaryRecord {
	public static void main(String[] args) {

		
		/*ArrayList<String> l= new ArrayList<String>();
		l.add(" rashmi");
		l.add("reya");
		l.add("chreey");
		l.add("siya");
		l.add("rupesh"); 
		System.out.println(l);
		*/
		Book e= new Book("java","xyz",500);
		Book e1= new Book("c++","mno",600);
		Book e2= new Book("c++","mno",600);
		ArrayList<Book> s= new ArrayList<Book>();
		s.add(e);
		s.add(e1);
		s.add(e2);
		System.out.println("***** *****");
		System.out.println(s.clone());
		System.out.println(s);
		
		/*Iterator<Book> P= s.iterator(); 
		while(P.hasNext()) {
			System.out.println(P.next());
			
		}*/
		Book e3= new Book("python","pno",700);	
		s.add(0, e3);
		System.out.println("*****object e3 added at index 0 *****");
		Iterator<Book> i= s.iterator(); 
		while(i.hasNext()) {
			System.out.println(i.next());//
			
		}
		
	}

}
