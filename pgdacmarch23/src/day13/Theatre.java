/*Q 3 Rajan went to a movie with his friends in a multiplex theatre and during  break time he
 *  bought pizzas, puffs and cool drinks. Consider  the following prices :

Rs.100/pizza
Rs.20/puffs
Rs.10/cooldrink
Generate a bill for What Rajan has bought.


Sample Input 1:

Enter the no of pizzas bought:10
Enter the no of puffs bought:12
Enter the no of cool drinks bought:5

Sample Output 1:

Bill Details
No of pizzas:10
No of puffs:12
No of cooldrinks:5
Total price=1290*/
package day13;

import java.util.Scanner;


public class Theatre {
	public static void main(String[] args) {
		
		Theatre t = new Theatre();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("how many pizza u want");
		int no_pizza = sc.nextInt();
		System.out.println("how many puff u want");
		int no_puff = sc.nextInt();
		System.out.println("how many colddrink u want");
		int no_colddrink = sc.nextInt();
		int bill =t.bill(no_pizza, no_puff, no_colddrink);
		System.out.println("the bill for selected items u purched is : "+bill);
		
		

	}
	int colddrinks;
	int pizza;
	int puff;
	public Theatre() {
		pizza = 100;
		puff =20;
		colddrinks=10;
	}
	public int bill(int no_pizza,int no_puff,int no_colddrink) {
		return( no_pizza*this.pizza+no_puff*this.puff+no_colddrink*this.colddrinks);
		 
	}


}
