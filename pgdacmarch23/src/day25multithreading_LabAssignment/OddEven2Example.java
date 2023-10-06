package day25multithreading_LabAssignment;





class Odd extends Thread
{
	public void run() {

		try
	{
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
			{
			System.out.println("even" +i);}
		     Thread.sleep(1000);
		}
		}catch(InterruptedException e) {}
	
	}
}


class Even extends Thread
{ 
	public void run() 




	{try
	{
		for(int i=0;i<=10;i++)
		{
			if(i%2!=0) {
				System.out.println("Odd" +i);}
			
		     Thread.sleep(1000);
		}}catch( Exception e) {}
	
	}
}
public class OddEven2Example {

	public static void main(String[] args) {



		 Odd t= new Odd();
		 t.start();// create a child thread and call run method 
		 Even e= new Even();
		 e.start();

	}

}