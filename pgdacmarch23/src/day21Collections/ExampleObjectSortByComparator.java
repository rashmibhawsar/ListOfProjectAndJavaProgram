package day21Collections;





import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
 class Namesorter implements Comparator<Book1>
{
	public int compare(Book1 o1, Book1 o2) {

		// TODO Auto-generated method stub
		return o1.author_name.compareTo(o2.author_name);
	}
}


 class Book1 {

	String author_name;
	String book_name;
	int book_price;
	Book1(String book_name,String author_name,int book_price){
		this.book_name=book_name;
		this.author_name=author_name;
		this.book_price=book_price;
	}
		public String toString() {



		return book_name+" "+author_name+" "+book_price;
	}//to display only bookname return only book name

}


public class ExampleObjectSortByComparator {
	public static void main(String[] args) {

	
		
		/*ArrayList<String> s= new ArrayList<String>();
		s.add("rashm");
		s.add("amit");
		s.add("chreeysss");
		s.add("siyaaaa");
		
		System.out.println(s);
		Comparator<String> com = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length())
					return 1;
				else if (o1.length() < o2.length())
					return -1;
				else
					return 0;
				
			}
		
			
		};*/
	
		
		Book1 e= new Book1("java","xyz",500);
		Book1 e1= new Book1("c++","mno",600);
		Book1 e2= new Book1("python","hhh",600);
		ArrayList<Book1> s= new ArrayList<Book1>();
		s.add(e);
		s.add(e1);
		s.add(e2);
		System.out.println("***** *****");
		//System.out.println(s.clone());
		System.out.println(s);
		
		/*Iterator<Book> P= s.iterator(); 
		while(P.hasNext()) {
			System.out.println(P.next());
			
		}*/


		Collections.sort(s, new Namesorter());
		Iterator<Book1> i= s.iterator(); 
		while(i.hasNext()) {
			System.out.println(i.next());//
			
		}
		
	}



}