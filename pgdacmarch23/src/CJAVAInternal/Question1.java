package CJAVAInternal;

import java.io.BufferedReader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question1 {
	public static void main(String args[]) throws IOException { 

		  String str;
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		 System.out.println("Enter ur name");
		 str = (String) br.readLine();//input name
		 System.out.println("my name is..."+str); //output name
		 System.out.println("the length of my name "+str +" is ... "+str.length());//length of name
		 try (FileWriter w = new FileWriter("person.txt")) {
			w.write(str);
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}
}
