/*Q 5 Write a program to check all the three number entered by command
line argument are greater than 10 , then print sum of those numbers . If any
number is less then 10 then throw user defined exception “MyException”
which print message number iis lesser then 10 “*/
package day17Exception_IO;
public class ExceptionCMD {

	public static void main(String[] args) throws MyException {


		try{
			int firstNo = Integer.parseInt(args[0]);
			int secondNo = Integer.parseInt(args[1]);
			int thirdNo = Integer.parseInt(args[2]);
			if((firstNo>10)&&(secondNo>10)&&(thirdNo>10))
			{
				System.out.println("sum of 3 numbers " +(firstNo+secondNo+thirdNo));
			}
			else
				throw new MyException();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("end of pgm");

	}
	

}
class MyException extends Exception{
	public MyException() {

		System.out.println("nmber is less than 10");
	}
}
