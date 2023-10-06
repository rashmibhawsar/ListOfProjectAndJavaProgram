package day20GenericCollections;

import java.util.*;

//All generic classes works only wirth object not with primitive datatype
//LinkedHashSet <int>l= new LinkedHashSet<int>(); -->compile time error

//wap to store 50 unique number or data and print them in ascending order

public class LinkedHashSetExample {

	public static void main(String[] args) {




		//LinkedHashSet  <String> l= new LinkedHashSet<String>(); //insertion order
		//HashSet  <String> l= new HashSet<String>();//random order  --fast execution 
		//TreeSet <String> l= new TreeSet<String>();//ascending order  -- slow execution
		 TreeSet  l= new TreeSet ();//ascending order  -- slow execution 
		 
		l.add("amit");
		l.add("neha");
		 
		l.add("bina");
		l.add("chaitan");
		l.add("deepa");
		//l.add(null);//Null pointer exception in case of TreeSet
		l.remove("amit");
		System.out.println(l);
		

	}

}