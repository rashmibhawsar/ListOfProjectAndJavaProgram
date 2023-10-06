package day25multithreading;

class drawing extends Thread

{
	String shape;
	drawing(String shape)
	{
	this.shape=shape;
	
	}
	public void run()

	{try {
		for(int i=0;i<10;i++)
		{
			System.out.println(shape);
			Thread.sleep(1000);
		}
	}catch(Exception d) {}
	}
}
public class JoinExample {

	public static void main(String[] args)throws Exception {

		 drawing d= new drawing("circle");
		 drawing d1= new drawing("Arc");
		 d.start();
		 d1.start();
		 d.join(); // other thread will now wait till d and d1 task is over 
		 
		 drawing d2= new drawing("semicircle");
		  d2.start();
		 
		 
		 
	}

}