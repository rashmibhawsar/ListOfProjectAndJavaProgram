package day25multithreading;


public class Priducer_cusomerMain {

	public static void main(String[] args) throws Exception{
		Producer_consumerProblem c= new Producer_consumerProblem();
		
		
		Runnable r= new Runnable()
				{
			     public void run()
			     
			     {try {
			    	 c.producer();
			     }catch(Exception j) {}
			     }
				};
		
		Thread t= new Thread(r);
		t.start();
	

	
	Runnable r1= new Runnable()
	{
     public void run()
     
     {try {
    	 c.consumer();
     }catch(Exception j) {}
     }
	};

Thread t1= new Thread(r1);
t1.start();
}
	
	
	
}