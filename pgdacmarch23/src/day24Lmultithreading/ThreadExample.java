package day24Lmultithreading;


//Multithreading running two or more thread / activities together
//to perform multithreading 2 ways 
//1 extends Thread  2 ) implements Runnable
//example  game -- play /score /database /time 
//example2 microsoftword --typing /spelling/print 
//example 3 webbrowser load /scroll/print 

//wap  to demonstrate Thread class method and see properties of current running thread
import java.lang.Thread;

public class ThreadExample {

	public static void main(String[] args) {


		//Thread r= new Thread();
		Thread r= Thread.currentThread();
		System.out.println(r.getId()); //1
		System.out.println(r.getName());//main
		System.out.println(r.getPriority());//5
		System.out.println(r.isAlive()); //true
		r.setName("CDAC");
		r.setPriority(10);
		System.out.println(r.getName());
		System.out.println(r.getPriority());
		System.out.println(r.isAlive());
		

	}

}
