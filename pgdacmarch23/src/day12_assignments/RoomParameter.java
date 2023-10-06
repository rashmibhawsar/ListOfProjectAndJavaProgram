/*//Q 3 Write a program to create a room class, the attributes of this class is roomno,
roomtype, roomarea and ACmachine.
In this class the member functions are setdata and displaydata.*/
package day12_assignments;

import java.util.Scanner;

class Room{
	String acmachine;
	int roomarea;
	int roomno;
	String roomtype;
	Scanner sc = new Scanner(System.in);
	 void displaydata()
	 {
		 System.out.println(" ur room no : " +roomno);
		 System.out.println(" ur room type : " +roomtype);
		 System.out.println(" ur room area : " +roomarea);
		 System.out.println(" ur room ac machine : " +acmachine);

		 
	 }
	 void setdata(){

		System.out.println("enter ur roomno ");
		roomno = sc.nextInt();
		System.out.println("enter ur room type ");
		roomtype = sc.next();
		System.out.println("enter ur roomarea ");
		roomarea = sc.nextInt();
		System.out.println("enter ur room type ac -non ac");
		acmachine = sc.next();
		
		}
	
}
public class RoomParameter {

	public static void main(String[] args) {
		Room e = new Room();
		e.setdata();
		e.displaydata();
	

	}

}
