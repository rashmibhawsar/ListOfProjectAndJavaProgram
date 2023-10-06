package day24Lmultithreading;


class Task1 extends Thread
{
	public void run() 

	{try
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("siya");
		     Thread.sleep(2000);
		}}catch(InterruptedException e) {}
	
	}
}

class Task2 implements Runnable
{
	public void run()

	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("rashmi");
			     Thread.sleep(2000);
			}}catch(InterruptedException e) {}
			}
}
public class multithreadExampleHW {
	public static void main(String[] args)

	{
		Task2 t2= new Task2();
		//t2.start();
		Thread e = new Thread(t2);
		e.start();
		Task1 t1 = new Task1();
		t1.start();
		
	}

}