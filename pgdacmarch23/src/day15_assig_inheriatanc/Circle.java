package day15_assig_inheriatanc;
import java.util.*;
public class Circle {
	public static void main(String[] args) {
		Circle c = new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius");
		int radius = sc.nextInt();
		c.areaCircle(radius);
		c.permiterCircle();
		c.checkPointsForCircle();

		}
	double radius;
	int x1,cx2;
	
	int y1,cy2;
	void areaCircle(int r){
		this.radius = r;
		System.out.println("area of circle :" +(Math.floor(Math.PI*this.radius*this.radius)));
	
		}
	void checkPointsForCircle()
	{ 
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter radius");
			radius = sc.nextInt();
			if(radius>0) {
				System.out.println("enter x1 y1 cordinates points");
				x1 = sc.nextInt();
				y1 = sc.nextInt();
				System.out.println("enter x2 y2 centre cordinates points");
				cx2 = sc.nextInt();
				cy2 = sc.nextInt();
				double check_circle = Math.sqrt(Math.pow((x1-cx2), 2)+Math.pow((y1-cy2), 2));
				 
				if(check_circle>radius)
				{
					System.out.println("points are outside circle");
				}
				else if(check_circle<radius)
				{
					System.out.println("points are inside circle");
				}
				else if(check_circle==radius)
				{
					System.out.println("on circle");
				}
			}
			else
				System.out.println("entered radius is negative");
			
			System.out.println("you want to check still cordinates points of circle? \n press 1..for yes \n press 0 ...for no");
			int choice = sc.nextInt();
			if(choice==0)
				break;
		}

	
		
	}

	void permiterCircle() {
		System.out.println("perimeter of circle is :" +(Math.floor(2*Math.PI*this.radius*this.radius)));
	}
}
