package _5day;

public class pattern6 {
	 public static void main(String[] args) {
		    int temp=0;
		    int temp1=0;
		    int a= 1;

		    for(int i =1;i<=5;i++) {


		        for(int ii =(7-temp);ii >=1;--ii) {
		            System.out.print(" ");
		        }temp=temp+1;


		        for(int k =1;k<=i+temp1;k++) {
		            System.out.print(a);
		        }
		        temp1=temp1+1;
		        a=a+1;
		        System.out.println();

		    }

		}

}
