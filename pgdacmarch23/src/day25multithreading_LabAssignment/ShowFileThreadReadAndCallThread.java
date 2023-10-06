package day25multithreading_LabAssignment;

public class ShowFileThreadReadAndCallThread {

	
	public static void main(String args[])



	{
		FileReading f1= new FileReading();
		FileReading f2= new FileReading();
		try {
			ShowFileThread  n= new ShowFileThread (f1,args[0]);//arg[0[ contains f1.txt
			n.start();
			
			ShowFileThread n1= new ShowFileThread (f2 ,args[1]);//arg[1] contains file2.txt
			n1.start();
			
		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("you have not given the filename");
		}

		
	}
}