package day21Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ExampleIntSortByLastDigitComparator {

	public static void main(String[] args) {


		List<Integer> s=  Arrays.asList(52,73,16,25,33);
		/*ArrayList<Integer> s= new ArrayList<Integer>();
		s.add(new Integer(51));
		s.add(67);
		s.add(96);
		s.add(72);
		s.add(63); 
		s.add(99);*/
		System.out.println(s);
		Comparator<Integer> com = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1%10>o2%10)
					return 1;
				else
					return -1;
				
			}
		
			
		};
	

		Collections.sort(s,com);
		Iterator<Integer> i= s.iterator(); 
		while(i.hasNext()) {
			System.out.println(i.next());//
			
		}
		
	}

}

