package day13;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {


		
		String arrStr1="ciddacnoa";
		String arrStr2="cdacnoida";
		int arr;
		//char arr1[]= {'c','i','d','d','a','c','n','o','a'};
		//char arr2[]= {'c','d','a','c','n','o','i','d','a'};

		char arrChar1[] = arrStr1.toCharArray(); //convert string into array
		char arrChar2[] = arrStr2.toCharArray();
		Arrays.sort(arrChar1);
		Arrays.sort(arrChar2);
		/*if(arrChar1.equals(arrChar2))
			System.out.println("string is anagram");
		else
			System.out.println("not anagram");*/
		int flag=0;
		for(int i =0;i<3;i++) {
			if(arrChar1[i]==arrChar2[i]) {
				flag =1;
				continue; 
				}
			else {System.out.println("its not anagram");
			break;
			}
		}if(flag==1)
			System.out.println("string is anagram");

	}

}
