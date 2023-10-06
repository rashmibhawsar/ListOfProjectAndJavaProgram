package day24Lmultithreading;


class Task11 extends Thread
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

class Task22 implements Runnable
{
	Thread t;
	String msg;
	
	Task22(String k)


	{
		t= new Thread(this);
		msg=k;
		t.start();
		
	}
	public void run()


	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println(msg);
			     Thread.sleep(2000);//millisecond //exception -InterruptedException
			}}catch(InterruptedException e) {}
		
		}	 
	}
public class multThreadingExam2HW  {
	public static void main(String[] args)

	{
		Task22 t2= new Task22("wellcome");
		//t2.start();
		//Thread e = new Thread(t2); no need to do this
		//e.start();
		Task1 t1 = new Task1();
		t1.start();
		
	}

}