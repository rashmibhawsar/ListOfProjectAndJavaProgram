package day24Lmultithreading;

class Thr1 extends Thread
{
	public void run() 

	{try
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("welcome");
		     Thread.sleep(2000);//millisecond //exception -InterruptedException
		}}catch(InterruptedException e) {}
	
	}
}


class Thr2 extends Thread
{
	public void run() 


	{try
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Testing");
		     Thread.sleep(2000);//millisecond //exception -InterruptedException
		}}catch( Exception e) {}
	
	}
}
public class multhrUsingExteExample1 {

	public static void main(String[] args) {


		 Thr1 t= new Thr1();
		 t.start();// create a child thread and call run method 
		 Thr2 e= new Thr2();
		 e.start();

	}

}
