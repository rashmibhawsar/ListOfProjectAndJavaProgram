package day25multithreading;



import java.util.LinkedList;

public class Producer_consumerProblem {

	LinkedList <Integer> l= new LinkedList<Integer>();
	int maxcapacity=5;
	void producer() throws InterruptedException
	{
		int value=0;
		while(true)
		{
			synchronized(this)
			{
				while(l.size()==maxcapacity) 					wait();
				
				System.out.println("producer"+value);
				l.add(value++);
				
				notify();  //1 2 3 5 
			 Thread.sleep(1000);
			}
		}
	}
	
	
	void consumer() throws InterruptedException
	{
		int value=0;
		while(true)
		{
			synchronized(this)
			{
				while(l.size()==0)
					wait();
				
				int val=l.removeFirst();
				System.out.println("consume"+val);
				
				
				 notify();
				 Thread.sleep(1000);
			}
		}
	}
	

}