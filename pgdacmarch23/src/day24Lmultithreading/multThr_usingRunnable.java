package day24Lmultithreading;


//demonstrate multi threading using runnable interface 
//Runnable interface has only one abstract method ---> run


class Aplha123   implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("cdac");
			     Thread.sleep(2000);//millisecond //exception -InterruptedException
			}}catch(InterruptedException e) {}
		
		}	}
public class multThr_usingRunnable {

	public static void main(String[] args) {
		Aplha123 e= new Aplha123();
		//e.start();//you cant writ like this becz u dont have start method in runnable interface
		Thread s= new Thread(e);//so passing an object of alpha to thread class
		s.start();
		
		//Thr2 k= new Thr2();
		//k.start();
		
	}

}
