package day25multithreading_LabAssignment;



class Odd1 extends Thread
{ int num;
	Odd1(int num){

		this.num=num;
	}
	public void run() {
		try
	{
		for(int i=0;i<10;i++)
		{
			if(this.num%2==0)
			{
			System.out.println("even");}
		     Thread.sleep(2000);
		}
		}catch(InterruptedException e) {}
	
	}
}


class Even1 extends Thread
{ int num;
	Even1(int num){

	this.num=num;
}
	public void run() 


	{try
	{
		for(int i=0;i<10;i++)
		{
			if(this.num%3==0) {
				System.out.println("Odd");}
			
		     Thread.sleep(2000);
		}}catch( Exception e) {}
	
	}
}
public class OddEvenMultiThreading {

	public static void main(String[] args) {


		 Odd1 t= new Odd1(51);
		 t.start();// create a child thread and call run method 
		 Even1 e= new Even1(32);
		 e.start();

	}

}