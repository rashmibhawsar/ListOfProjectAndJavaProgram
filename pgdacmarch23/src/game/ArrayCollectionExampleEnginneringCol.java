package game;



import java.util.*;


public class ArrayCollectionExampleEnginneringCol {
	public static void main(String[] args) {



		
		ArrayList<String> l= new ArrayList<String>();
		l.add("college1 CS");
		l.add("college2 IT");
		l.add("college3 CS");
		l.add("college4 CS");
		
		Iterator<String> P= l.iterator(); 
		while(P.hasNext()) {
			System.out.println(P.next());
			
		}
		l.add("college5 CS");
		l.add("college6 CS");
		System.out.println("removing the college at index0.." +l.remove(0));
		
		
		System.out.println("*****check colleges in arraylist *****");
		
		//System.out.println(s);
		
		Iterator<String> q= l.iterator(); 
		while(q.hasNext()) {
			System.out.println(q.next());
			
		}
		

		
	}

}
