package day16_innerClas_exception;


import java.util.Scanner;
public class Training {
	    class OfflineTraining {
	        int offlineMarks;
	        boolean systemAllocation;

	        public void display() {
	            System.out.println("System Allocation Required? " + systemAllocation);
	            System.out.println("Offline Marks: " + offlineMarks);
	            System.out.println("Student ID: " + studentid);
		        System.out.println("Student Name: " + name);
		        System.out.println("Student Address: " + address);
		        System.out.println("Student Phone: " + phone);
	        }

	        public void input() {
	            Scanner s = new Scanner(System.in);

	            System.out.print("System Allocation Required? (true/false): ");
	            systemAllocation = s.nextBoolean();

	            System.out.print("Enter offline marks: ");
	            offlineMarks = s.nextInt();
	        }
	    }
	    class OnlineTraining {
	        int duration;
	        int onlineMarks;

	        public void getData() {
	            Scanner sc = new Scanner(System.in);

	            System.out.print("Enter training duration (in days): ");
	            duration = sc.nextInt();

	            System.out.print("Enter online marks: ");
	            onlineMarks = sc.nextInt();
	        }

	        public void showData() {
	            System.out.println("Training Duration: " + duration + " days");
	            System.out.println("Online Marks: " + onlineMarks);
	            System.out.println("Student ID: " + studentid);
		        System.out.println("Student Name: " + name);
		        System.out.println("Student Address: " + address);
		        System.out.println("Student Phone: " + phone);
	        }
	    }
	    public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			 while (true) {
		            System.out.println("Please select the training type:");
		            System.out.println("1. Offline Training");
		            System.out.println("2. Online Training");

		            int choice = s.nextInt();
		            switch (choice) {
		            case 1:
		                Training.OfflineTraining o = new Training(23456,"rashmi","pune",123456789).new OfflineTraining();
		                System.out.println("Offline Training Selected");
		                o.input();
		                o.display();
		                break;
		            case 2:
		                Training.OnlineTraining k = new Training(1234,"rashmi","pune",123456789).new OnlineTraining();
		                System.out.println("Online Training Selected");
		                k.getData();
		                k.showData();
		                break;
		            default:
		                System.out.println("Invalid choice!");
		                break;
		        }
			 }


		}
	    String address;

	    String name;
	    long phone;
	    int studentid;

	    public Training(int a, String b, String c, long d) {
	        this.studentid = a;
	        this.name = b;
	        this.address = c;
	        this.phone = d;
	    }

	public void getData() {
	    Scanner s = new Scanner(System.in);

	    System.out.print("Enter student ID: \t name\t address\t phone");
	    studentid = s.nextInt();
	    name = s.next();
	    address = s.next();
	    phone = s.nextLong();
	}

}