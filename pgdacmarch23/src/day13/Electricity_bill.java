/*Q 4 Given an integer U denoting the amount of KWh units of electricity consumed,
the task is to calculate the electricity bill with the help of the below charges:
 

1 to 100 units – Rs. 10/unit
100 to 200 units – Rs. 15/unit
200 to 300 units – Rs. 20/unit
above 300 units – Rs. 25/unit
Examples:
 

Input: U = 250
Output: 3500
Explanation:
Charge for the first 100 units – 10*100 = 1000
Charge for the 100 to 200 units – 15*100 = 1500
Charge for the 200 to 250 units – 20*50 = 1000
Total Electricity Bill = 1000 + 1500 + 1000 = 3500
Input: U = 95
Output: 950
Explanation:
Charge for the first 100 units – 10*95 = 950
Total Electricity Bill = 950*/
package day13;

import java.util.Scanner;

public class Electricity_bill {
	

	public static void main(String[] args) {
		electricityTest t = new electricityTest();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("how many units");
		int units = sc.nextInt();
		int bill =t.billGenerator(units);
		System.out.println("  bill : " +bill);

		// TODO Auto-generated method stub

	}

}

class electricityTest{
	public int billGenerator(int units)
	{
		int sum=0;
		if(units <=100 && units >0) {
			
			return (100*10);
		}
			
		else if(units >100 && units <=200){
			units =units-100;
			sum = (100*10)+(units*15);
			
			
		}
		else if(units >200 && units <=300){
			units = units-200;
			sum = (100*10)+(100*15)+(units *20);
	
			
		}
		else if(units >300){
			units = units-300;
			sum = 100*10 +100*15+100*20+units *25;
			
		}
			
		

		return sum;	
		
	}
}
