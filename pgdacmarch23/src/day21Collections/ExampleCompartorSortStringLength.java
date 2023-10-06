package day21Collections;


import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
/*class Book1 {


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

class nameComparator implements Comparator
{

	public int compare(String o1, String o2) {
	
		return o1.name.CompareTo(o2.name);
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
};*/
public class ExampleCompartorSortStringLength {
	public static void main(String[] args) {


		
		ArrayList<String> s= new ArrayList<String>();
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
		
			
		};
	
		/*
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
			
		}
		Book e3= new Book("python","pno",700);	
		s.add(0, e3);
		System.out.println("*****object e3 added at index 0 *****");*/
		Collections.sort(s,com);
		Iterator<String> i= s.iterator(); 
		while(i.hasNext()) {
			System.out.println(i.next());//
			
		}
		
	}

}