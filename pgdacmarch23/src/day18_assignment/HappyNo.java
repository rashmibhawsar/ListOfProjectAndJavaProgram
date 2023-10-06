package day18_assignment;
import java.util.Scanner;
public class HappyNo {
	public static void main(String[] args) {

		HappyNo h = new HappyNo();
		boolean result = h.checkHappy();
		if(result)
			System.out.println("happy number");
		else
			System.out.println("not happy number");
		}
		
	public boolean checkHappy() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 number ");
		int num = sc.nextInt();
		double sum_sqrt_no =0;
		while(num>0)
		{
			double r = num%10;
			sum_sqrt_no = sum_sqrt_no+Math.sqrt(r);
			num = num/10;
			}
		if(sum_sqrt_no ==1)
			return true;
		else {
			while(num>0)
			{
				double r = num%10;
				if(r==1)
					return false;
				num = num/10;
			}
		}
			return true;
}
}
