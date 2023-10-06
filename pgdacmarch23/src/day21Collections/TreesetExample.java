package day21Collections;


import java.util.*;


public class TreesetExample {

	public static void main(String[] args) {

		//TreeSet<Colour> s= new TreeSet<Colour>();
		TreeSet<String> s= new TreeSet<String>();
		
		s.add("pink");
		s.add("blue");
		s.add("white");
		s.add("yello");
		s.add("blue");
		s.add("black");
		
		Iterator<String> i= s.iterator();
		while(i.hasNext())
		
		{
			System.out.println(i.next());
		}
		System.out.println("******************");
		System.out.println(s.descendingSet());
		Iterator<String> j= s.descendingIterator();
		while(j.hasNext())
		
		{
			System.out.println(j.next());
		}

	}

}