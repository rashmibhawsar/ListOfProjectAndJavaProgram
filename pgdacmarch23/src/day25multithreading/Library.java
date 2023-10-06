package day25multithreading;


//association 
// composition 
// Aggregation 


class book
{
//synchronized static  void show()throws Exception  //class level locking 
	synchronized    void show()throws Exception  //object level locking 
	{   for(int i=0;i<10;i++)
		{
		System.out.println("in book class show method");
		Thread.sleep(1000);
		}
	
	}}

public class Library extends Thread
{
	book b;
	
	Library(book b)

	{
		this.b= b;
	
	}
	public void run()

	{
		try {
		b.show();
	}catch(Exception d) {}
	}

	public static void main(String[] args) {
		 
		book b= new book();

		Library l= new Library(b);
		l.start();
		Library l1= new Library(b);
		l1.start();
		Library l2= new Library(b);
		l2.start();
		Library l3= new Library(b);
		l3.start();
		Library l4= new Library(b);
		l4.start();
		
	}

}