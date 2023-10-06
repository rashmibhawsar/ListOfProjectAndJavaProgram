package day22Collections_Queue_Map;


import java.util.LinkedList;
import java.util.Queue;

//queue -- linked list -->FIFO 
//FIrst in first out 
//example -printing 
public class queueExample {

	public static void main(String[] args) {
		 

Queue<Integer> r= new LinkedList<Integer>();//r can access only methods present in quque interface 
		
		//LinkedList<Integer> r= new LinkedList<Integer>();//here r can access List and queue both methods 
		r.add(10); //this is top element and will be removed first 
		r.add(30);
		r.add(12);
		r.add(43);
		r.add(25);
		r.add(25);
		r.add(25);
		r.add(null);//null allowed 
		    System.out.println(r);
		    System.out.println(r.remove());//print then remove top element --> throws Exception 
			System.out.println(r.poll());//print & remove data and in case if queue is empty it will return null
			System.out.println(r.remove());
			System.out.println(r.peek()) ; //show top element
			
			// System.out.println(r.get(0));
			 System.out.println(r.remove(0)); 
	}

}