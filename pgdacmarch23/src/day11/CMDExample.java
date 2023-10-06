package day11;


//command line argument 
//passing input to main 


//_____first way __> code is in notepad _________________________
//compile --> javac CMDExample.java
//run --> java CMDExample 
//run --> java CMDExample  neha 33 455 6667 78 87 8 98  9009  &*((^*)*)*   333.333 


//second way ----------to run program from eclipse---------------
//run program 
//run--> run configuration -->choose file from left hand side --> select argument tab 
//write argument you to pass



public class CMDExample {

	public static void main(String[] args) {

		
		
	
		System.out.println(args[0] +"  "+ args[1]+"  "+ args[2]);
		
		
		/*for(String l:args)
		{
			System.out.println(l);
		}*/

	}

}

