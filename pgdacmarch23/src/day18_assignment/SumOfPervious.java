package day18_assignment;


public class SumOfPervious {

	public static void main(String[] args) {

		
		int nums[] = {1,2,3,4};

		int[] ans = new int[nums.length];
	    ans[0] = nums[0];
	    for (int i = 1; i < nums.length; i++)
	        ans[i] = ans[i-1] + nums[i];
	    
		 System.out.println("array elements ");
		 for(int i=0;i<nums.length;i++) {
			 System.out.print(" " +ans[i] );
			 }
		 }
}
