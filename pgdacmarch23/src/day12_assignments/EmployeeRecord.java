package day12_assignments;

import java.util.Arrays;
import java.util.Scanner;

/*Q 7 wap to ask 6 employee record from  user using get and display method 
 * show record on console after performing sorting on record on basis ofemployee id.*/
 class Employee_Info1 {
	 int empId;
	 String empName;
	 String empDob;
	Scanner sc = new Scanner(System.in);
	 void getinfo(){


		System.out.println("enter employee Id , name,D.O.B");
		empId = sc.nextInt();
		empName = sc.next();
		empDob = sc.next();
		
		}
	 


		 Employee_Info1 temp = new Employee_Info1();
		 
		 
		 for(int i=0;i<6;i++) 
		 {
			 for(int j=0;j<5-i;j++)
				{
					if((k[j].empId)>(k[j+1].empId)){
					 temp = k[j];
						k[j] = k[j+1];
						k[j+1] = temp;
				
					}
					//Arrays.sort(j[i].empId);
					//if(j[i].pname.equals(name))
						//System.out.println(j[i].pname +"   "+ j[i].price);
				}
		 }
	}
}

public class EmployeeRecord {

	public static void main(String[] args) {

		Employee_Info1 e[] = new Employee_Info1[6];
		for(int i=0;i<6;i++)
		{
			e[i]=new Employee_Info1();
			e[i].getinfo();
		}
		
		Employee_Info1 s = new Employee_Info1();
		s.sort(e);

		
		for(int i=0;i<6;i++)
		{
			System.out.println(e[i].empId +"   "+ e[i].empName + " " +e[i].empDob);
			}

		//Employee_Info s = new Employee_Info();
		//s.sort(e);
		//e[].sort(e);
		

	}

}
