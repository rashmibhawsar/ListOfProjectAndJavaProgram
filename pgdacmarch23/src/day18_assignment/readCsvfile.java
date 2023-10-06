package day18_assignment;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Q 3 wap to read csv file and display in formatted way 
//hint use scaner class split method  


//solution 
/*
 * 1 create comman seperate file --> save --> filename.csv 
 * 2) write code below
 */
public class readCsvfile {

	public static void main(String[] args) throws FileNotFoundException {
//line 20 reading data from file using scanner class method 
		Scanner s= new Scanner(new File("data.csv"));
//here we have mention delimiter 		
		s.useDelimiter(",");

		
	while(s.hasNext()) //check if file has some data or not 
			
		{
			System.out.print("  "+ s.next());// print data from file 
		}
		
		
	}

}

