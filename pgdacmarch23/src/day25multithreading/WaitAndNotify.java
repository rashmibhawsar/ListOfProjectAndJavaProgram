package day25multithreading;


//example to demonstrate wait and notify method of Object class

public class WaitAndNotify {

	public static void main(String[] args) {
		
		
		thread4 b= new thread4();
		b.start();
	synchronized(b) {
	try
		{
			System.out.println("waiting for total of number");
			 b.wait();// stop execution 
			
		
		}catch(Exception d) {}
		System.out.println(b.total);//0
	}}

}

class thread4 extends Thread
{
	int total ;
	
	public void run()
	{
		synchronized(this) {
		for(int i=0;i<100;i++)
		{
			total+=i; //sum from zero to 100 and storing it in total variable
			
		}
		 notify();
		
		}
	}
}