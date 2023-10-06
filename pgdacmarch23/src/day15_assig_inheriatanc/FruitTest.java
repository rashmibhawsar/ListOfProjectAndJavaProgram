/*Q 4  Define a class called fruit with the following attributes:1.
 *  Name of the fruit.
2. Single fruit or bunch fruit.
3. Price.
Define a suitable constructor and displayFruit() method
 that displays values of all the
attributes. Write a program that creates 2 objects of fruit class and 
display their attributes.*/
package day15_assig_inheriatanc;
class Fruit{
	String fruitName;
	String fruitType;
	int price;
	}

public class FruitTest {
	public static void main(String[] args) {
		Grapes g = new Grapes();
		Orange o = new Orange(); 
		g.display();
		o.display();

		

	}

}
class Grapes extends Fruit
{	public Grapes() {
	fruitName = "Grapes";
	fruitType= "bunch fruit";
	price = 150;
	}
void display() {
	System.out.println("name of fruit: "+fruitName);
	System.out.println("type of fruit: "+fruitType);
	System.out.println("price of fruit: "+price);
}
	
}

class Orange extends Fruit
{
	public Orange() {
		fruitName = "ORANGE";
		fruitType= "SINGLEFRUIT";
		price = 100;
		}
	void display() {
		System.out.println("name of fruit: "+fruitName);
		System.out.println("type of fruit: "+fruitType);
		System.out.println("price of fruit: "+price);
	}
}
