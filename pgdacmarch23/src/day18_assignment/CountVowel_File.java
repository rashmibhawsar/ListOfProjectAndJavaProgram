package day18_assignment;

import java.io.FileReader;
public class CountVowel_File  {
	public static void main(String args[])throws Exception


	{
		int count=0;
		FileReader f = new FileReader("abc.txt");
	
	try {
		int r;
		
	
		do
		{
			r = f.read();
			
			if(r=='a'||r=='e'||r=='i'||r=='o'||r=='u')
				count++;
			System.out.print((char)r);
			
		}
		while(r!=-1);
	}
		finally
		{
			System.out.println();
			System.out.println("count of vowels are" +count);
			f.close();
			//w.close();
	}

	}
	

}