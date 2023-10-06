package day24Lmultithreading;

class Circle implements Runnable 
{
	Thread t;
	String msg;
	
	Circle(String k)


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

public class MulThrRunnMethod2Ctor {

	public static void main(String[] args) 


	{
 	  Circle c= new Circle("welcome");//go to line 8 call ctor.. fm ther it will go to line 16.. call run method
 	  Circle c1= new Circle("cdac");
 	  Circle c2= new Circle(" testing");
 	  

	}

}
