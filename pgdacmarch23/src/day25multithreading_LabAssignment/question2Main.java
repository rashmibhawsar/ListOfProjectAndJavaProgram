package day25multithreading_LabAssignment;

public class question2Main {
	
	public static void main(String args[]) throws InterruptedException



	{
		ReadFileQ2 f1= new ReadFileQ2();
		ReadFileQ2 f2= new ReadFileQ2();
		try {
			Question2ReadFile  n= new Question2ReadFile(f1,"f3.txt");
			Question2ReadFile n1= new Question2ReadFile(f2 ,"f4.txt");
			n.start();
			n.join();
			
			n1.start();
			
		}catch(ArrayIndexOutOfBoundsException a) {
			
		}

		
	}

}
