package _8day;

public class calculate_switch_class {
	public static void main(String[] args) {
		calculate_switch_class a= new calculate_switch_class();
		int choice=1;
		switch (choice) {
		case 1:
			a.add();
			break;
		case 2:
			a.sub();
			break;
		case 3:
			a.mul();
			break;
		default:
				System.out.println("input invalue");
		
		}
		
		// TODO Auto-generated method stub

	}
	int a=10; 
	
	int b=20;
	void add(){

		System.out.println("add =: "+(a+b));
	}
	void mul(){

		System.out.println("mul =: "+(a*b));
	}

	void sub(){
	
		System.out.println("sub =: "+(a-b));
	}

}
