package _7day;

import java.util.Scanner;

public class index_ofArrayElement {
	
		public static void main(String[] args) 
		{
			int a[] = new int[5];
		
			Scanner sc = new Scanner(System.in);
			
			for(int i=0;i<5;i++)
			{
				System.out.println("entre array [" +i +"]");
				a[i] = sc.nextInt();}
	
			
			for(int j = 0;j<(a.length);j++) {
				if(a[j]==5) {
					System.out.println("the index value of found element is : "+j);
					break;
					}
				
				}	sc.close();
				
					
				
		}

}
