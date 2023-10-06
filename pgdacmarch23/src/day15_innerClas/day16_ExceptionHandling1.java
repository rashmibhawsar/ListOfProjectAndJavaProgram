/*Q 1 Create a class Training having fields like studentid
 name ,address,phone.
create two inner classes online training and offline training

In online training define fields like duration, online marks.
*/package day15_innerClas;

import java.util.Scanner;

import day15_assig_inheriatanc.CurrentAccount;
import day15_assig_inheriatanc.SavingAccount;

public class day16_ExceptionHandling1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter ONLINE/OFFLINE enter 1 or 2 \n 1...OFFLINE \n2...ONLINE");
		 int choice = sc.nextInt();
		 switch(choice)
		 {
		 case 1:Training t = new Training();
				Training.OfflineTraining  m = t.new OfflineTraining();
				m.input_data();
		 		m.display();
		 	
		 		break;
		 case 2:Training t1 = new Training();
			Training.onlineTraining  o = t1.new onlineTraining();
			o.get_data();
	 		o.display();
	 		break;
		 default:System.out.println("invalid input");
		 break;
		 }
	}
	

}


class Training{
	class OfflineTraining{
	int offline_marks =89;
	boolean	sys_allocation ;

	void display() {
		System.out.println("student_attend_online :"+sys_allocation);
		System.out.println("student_online_marks :"+offline_marks);
	}
	void input_data() {
		
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("enter online");
		sys_allocation = sc.nextBoolean();
		}catch (Exception e) {
			System.out.println("enter true or false");
		}
		System.out.println("end of program");

	
	}
		
	}
	class onlineTraining{
		int duration;
		int online_marks = 95;
		void display() {
			System.out.println("student_attend_online :"+duration);
			System.out.println("student_online_marks :"+online_marks);
		}
		void get_data() {
			
			Scanner sc = new Scanner(System.in);
			try {
			System.out.println("enter duration");
			duration = sc.nextInt();
			}catch (Exception e) {
				System.out.println("enter int value");
			}
			System.out.println("end of program");

		
		}
		
	}
	String address;
	String name;
	long phone_no;
	int studentid;
	void get_data() {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter student_id");
		studentid = sc.nextInt();
		System.out.println("enter studentname");
		name = sc.next();
		System.out.println("enter student_address");
		address = sc.next();
		System.out.println("enter student_phno");
		phone_no = sc.nextLong();
	
	}
	void showData() {
		System.out.println("student_id :"+studentid);
		System.out.println("student_name :"+name);
		System.out.println("student_add :"+address);
		System.out.println("student_pho :"+phone_no);
		//System.out.println("student_duration  :"+duration);
		//System.out.println("student_duration  :"+online_marks);
		
	}
}

	
