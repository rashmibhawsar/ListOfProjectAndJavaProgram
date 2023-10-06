/*Q 5 Write a java program that define a sorted array of size N and an integer K, find the position at which K is

present in the array using binary search.

Example 1:

Input:
N = 5
arr[] = {1 2 3 4 5}
K = 4
Output: 3
Explanation: 4 appears at index 3.*/package day13;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of elements");
		int n = sc.nextInt();
		int arr[]= new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		Arrays.sort(arr);
		System.out.println("enter element to search");
		int search = sc.nextInt();
		int index = Arrays.binarySearch(arr, search);
		System.out.println("the element " +search +" found at position : " +(index+1));
		
		
		
	}

}
