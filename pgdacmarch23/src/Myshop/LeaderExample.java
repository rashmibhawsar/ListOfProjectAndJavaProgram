/* Q 6 write a java program and define an array, print all the elements 
 * which are leaders. A Leader is an element that is greater than all of the elements
 *  on its right side in the array.

Examples:

Example 1:
Input:
 arr = [5]
Output:
 7 1 0
Explanation:
 Rightmost element is always a leader. 7 and 1 are 
 greater than the elements in their right side.*/
package Myshop;
public class LeaderExample {

	public static void main(String[] args) {


		int arr[]= {4,7,1,0};
		boolean leader = false;
		
		for(int i = 0 ; i < arr.length ; i ++) {
			leader = true;
			for(int j = i+1 ; j < arr.length ; j++) {
				if(arr[i] > arr[j]) {
					continue;
				}else {
					leader = false;
					break;
				}
			}
			if(leader) {
				System.out.print(" " +arr[i]);
			}
			
		}
	}
		
}

