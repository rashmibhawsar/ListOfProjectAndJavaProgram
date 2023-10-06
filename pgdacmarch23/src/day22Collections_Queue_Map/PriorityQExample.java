package day22Collections_Queue_Map;


import java.util.PriorityQueue;
import java.util.Queue;
//PriorityQueue doesnot follow fifo 
// arrange data in natural order then process 
// priority quweu doesnot work opn different data 
public class PriorityQExample {

	public static void main(String[] args) {
		//[10, 30, 12, 43, 25, 25, 25, null]    
		
		      //11 12 13 14 30 43 120
		       // Queue <Integer> r= new PriorityQueue<Integer>();//here r can access List and queue both methods 
		       Queue<Integer>  r= new PriorityQueue<Integer>();
				r.add(120); //this is top element and will be removed first 
				r.add(30 );
				r.add(22);
				r.add(55);
				r.add(66);
				r.add(74);
				r.add(13);
				//r.add(null);//run time exception
		 
				System.out.println(r.remove());
				System.out.println(r.remove());
				r.add(10);
				System.out.println(r.remove());
			}

		}