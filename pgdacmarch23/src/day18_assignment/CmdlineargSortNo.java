package day18_assignment;

import java.util.Arrays;

public class CmdlineargSortNo {

	public static void main(String[] args) {
		
		int arr[] =new int[5];
		arr[0] = Integer.parseInt(args[0]);
		arr[1] = Integer.parseInt(args[1]);
		 arr[2]= Integer.parseInt(args[2]);
		 arr[3]= Integer.parseInt(args[3]);
		 arr[4]= Integer.parseInt(args[4]);
		 System.out.println("array before sorting");
		 for(int i=0;i<5;i++) {
			 System.out.print(" " +arr[i] );
			 }System.out.println();
		 Arrays.sort(arr);
		 System.out.println("array after sorting");
		 for(int i=0;i<5;i++) {
			 System.out.print(" " +arr[i] );
			 
		 }
		

	
	}

}
