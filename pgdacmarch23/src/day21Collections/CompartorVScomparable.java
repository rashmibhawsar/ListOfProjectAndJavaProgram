package day21Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


class Book2 implements Comparable{

	String author_name;
	String book_name;
	int book_price;
	Book2(String book_name,String author_name,int book_price){

		this.book_name=book_name;
		this.author_name=author_name;
		this.book_price=book_price;
	}
	public String toString() {



		return book_name+" "+author_name+" "+book_price;
	}//to display only bookname return only book name
	@Override
	public int compareTo(Object o) {


		return this.author_name.compareTo(((Book2)o).author_name);
	}

}


public class CompartorVScomparable {
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


		Book2 e= new Book2("java","xyz",500);
		Book2 e1= new Book2("c++","mno",600);
		Book2 e2= new Book2("python","hhh",600);
		ArrayList<Book2> s= new ArrayList<Book2>();
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


		Collections.sort(s);
		Iterator<Book2> i= s.iterator(); 
		while(i.hasNext()) {
			System.out.println(i.next());//

		}

	}


}