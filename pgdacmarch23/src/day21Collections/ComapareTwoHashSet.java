package day21Collections;


import java.util.Iterator;
import java.util.HashSet;


public class ComapareTwoHashSet {

	public static void main(String[] args) {

		int flag=0;
		HashSet<Integer> l= new HashSet<Integer>();
		l.add(10);
		l.add(20);
		l.add(5);
		l.add(15);
		l.add(25);   //		System.out.println(s.remove(e));
		System.out.println("******elements of list1 ********");
		Iterator<Integer> a= l.iterator();
		while(a.hasNext()){
			System.out.println(a.next());}
		
		HashSet<Integer> m = new HashSet<Integer>();
		m.add(10);
		m.add(20);
		m.add(5);
		m.add(15);
		m.add(25);
		//m.add(85);
		System.out.println("******elements of list2********");
		Iterator<Integer> n= m.iterator();
		while(n.hasNext()){
			System.out.println(n.next());}
		
		if((l.size())==(m.size())) {
			for(int i=0; i < l.size() ; i++) {
				if(l.equals(m)) {
					flag=1;
					continue;}
				else
					System.out.println("not equal");
					break;
				}if(flag==1)
					System.out.println("elements are equal");}
		else
			System.out.println("size not match");
	}
}
