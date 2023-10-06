package day22Collections_Queue_Map;

//Stack class that inherits Vector
//stack -- Lifo last in firstout 
//recursion 
//maths calculation 
//datastructure prefix |postfix |infix operation

//duplicate allowed 
import java.util.*;

public class StackExample {

	public static void main(String[] args) {

		
		Stack s= new Stack();
		s.push(233);
		s.push(233);
		s.push(233);
		s.push(233);
		s.push(null);
		s.push(null);
		
		s.add(1,333);
		System.out.println(s);
		System.out.println(s.get(0));
		

	}

}