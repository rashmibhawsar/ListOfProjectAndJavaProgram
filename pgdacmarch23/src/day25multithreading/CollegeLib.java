package day25multithreading;
class Book1{
	String bname;
	int price;
	void input()

	{
		System.out.println("input method in book class");
	}
	public synchronized void show()

	{ for(int i=0;i<10;i++)
		System.out.println("show method in book class");
	try {Thread.sleep(1000);}catch(InterruptedException e) {}
	}
}


class banner{
	void msg()

	{   System.out.println("input method in book class");

	}
}
public class CollegeLib extends Thread {
	
	void data(Book1 a,banner b)

	{
		a.input();
		a.show();
		b.msg();
	}
	public void run()

	{
		{ for(int i=0;i<10;i++)
			System.out.println("hi");
		try {Thread.sleep(1000);}catch(InterruptedException e) {}
		}
		
	}
	public static void main(String [] args) throws InterruptedException
	{
		CollegeLib l = new CollegeLib();
		Book1 m=new Book1();
		banner n= new banner();
		Thread t1 = new Thread(l);
		Thread t2 = new Thread(l);
		Thread t3 = new Thread(l);
		

		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		
		
		
		//l.data(m, n);
	}

}
