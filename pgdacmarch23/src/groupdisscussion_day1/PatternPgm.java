package groupdisscussion_day1;

import java.util.Scanner;

class pgm22{
	void pattern1()
	{
		for(int i=0;i<5;i++)
		{
			for(int k=5;k>i;k--)
				{
					System.out.print(" ");
				}
				for(int j=0;j<=i;j++)
				{
					System.out.print("* ");
				}
				
			System.out.println();
		}
	}
	void pattern2()
	{
		for(int i=0;i<5;i++)
		{
				for(int j=0;j<=i;j++)
				{
					System.out.print("*");
				}
				
			System.out.println();
		}
		
	}
	void pattern3()
	{
		for(int i=0;i<5;i++)
		{
			for(int k=5;k>i;k--)
			{
				System.out.print(" ");
				
			}
				for(int j=0;j<=i;j++)
				{
					System.out.print("*");
				}
				
			System.out.println();
		}
		
	}
	
	/*double dimond pattern*/
	  void pattern41()
	{
		int j=0;
		for(int i=0;i<5;i++)
		{
			for(int k=4;k>i;k--)
			{
				System.out.print(" ");
			}
			for(j=0;j<(i*2)+1;j++)
			{
				System.out.print("*");
			}
			//System.out.print(" ");
			for(int k=4;k>i;k--)
			{
				System.out.print("  ");
			}
			for(j=0;j<(i*2)+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<4;i++)
		{
			for(int k=0;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int m=j-1;m>(i*2)+1;m--)
			{
				System.out.print("*");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("  ");
			}
			for(int m=j-1;m>(i*2)+1;m--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void pattern4()
	{
		int j=0;
		for(int i=0;i<5;i++)
		{
			for(int k=4;k>i;k--)
			{
				System.out.print(" ");
			}
			for(j=0;j<(i*2)+1;j++)
			{
				System.out.print("*");
			}

			System.out.println();
		}
		for(int i=0;i<4;i++)
		{
			for(int k=0;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int m=j-1;m>(i*2)+1;m--)
			{
				System.out.print("*");
			}
		
			System.out.println();
		}
	}
	void pattern5()
	{
		for(int i=0;i<5;i++)
		{
			for(int k=5;k>i;k--)
			{
				System.out.print("*");
				
			}System.out.println();
		}
		
	}
	void pattern7()
	{
		for(int i=0;i<5;i++)
		{
			for(int k=0;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>i;j--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	void pattern8()
	{
		for(int i=0;i<5;i++)
		{
			for(int k=0;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void pattern9()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
				
			}System.out.println();
		}
		for(int i=0;i<4;i++)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print("*");
				
			}System.out.println();
		}
		
	}
	void pattern10()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=1;j<5-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=4;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
	//**********************
	void pattern11()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=5;j>i;j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=0;j<=4-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}
	//******************************************
	void pattern12()
	{
		int k=0;
		for(int i=0;i<5;i++)
		{
			for(int j=1;j<5-i;j++) {
				System.out.print(" ");
			}
			if(k==0)
			{
				System.out.print("*");
				k++;
			}
			else
			{
				System.out.print("*");
				for (int j = 2; j < (i * 2) + 1; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			
			}
			
		
			System.out.println();
		}
		int m=4;
		for(int i=0;i<4;i++)
		{
			
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
		
				if(m>1)
				{
					System.out.print("*");
					for(int j=m;j>=i;j--) {
						System.out.print(" ");
						}
					System.out.print("*");
			m= m-1;
			System.out.println();
			}
				else
				{
				System.out.print("*");
				}
			}
	}
//**************************************	
	void pattern13()
	{
		for(int i=0;i<5;i++)
		{int k=1;
				for(int j=0;j<=i;j++)
				{
					System.out.print(k);
					k++;
				}
				
			System.out.println();
		}
		
	}
	void pattern14()
	{int k=1;
		for(int i=0;i<5;i++)
		{
				for(int j=0;j<=i;j++)
				{
					System.out.print(k +" ");
					k++;
				}
				
			System.out.println();
		}
		
	}
	void pattern15()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{ System.out.print(" ");
				
			}
			int m=1;
			
			for(int k=1;k<=i;k++)
			{ System.out.print(m+" ");
			m= m*(i-k)/k;
			
			}
			System.out.println();
		}
	
	}
	void pattern16(){
		int m=0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{if(m==0)
			{
				System.out.print(++m);
				
			}
			else
			{
				System.out.print(--m);
			}
				
			}System.out.println();
		}
		
	}
	void pattern17()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k);
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print(l);
			}
			System.out.println();
		}
		
		
		for(int i=3;i>=1;i--)
		{
			for(int j=0;j<=3-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k);
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print(l);
			}
			System.out.println();
		}
		
		
		}
		
	
}
class Edureka
{
    void dimond()
{
    Scanner sc = new Scanner(System.in);
 
    System.out.println("Enter the number of rows: ");
 
    int rows = sc.nextInt();    
    	for (int i=1; i<= rows ; i++) 
    	{ 
    		for (int j = rows; j > i ; j--) 
    	{
            System.out.print(" ");
        }
        System.out.print("*");
        for(int k = 1; k < 2*(i -1);k++) 
        { System.out.print(" "); 
        	}
        if( i==1)
        { System.out.println(""); } 
        else { System.out.println("*"); } 
        }
    	for (int i=rows-1; i>= 1 ; i--)
        {
        for (int j = rows; j > i ; j--) {
            System.out.print(" ");
        }
        System.out.print("*");
        for (int k = 1; k < 2*(i -1) ;k++) {
            System.out.print(" ");
        }
        if( i==1)
            System.out.println("");
        else
            System.out.println("*");
    }
    sc.close();
}
    
}





public class PatternPgm {

	public static void main(String[] args) {
		pgm22 p2 = new pgm22();
		Edureka p = new Edureka();
		p2.pattern1();
		System.out.println("_______________________");
		p2.pattern2();
		System.out.println("_______________________");
		p2.pattern3();
		System.out.println("_______________________");
		p2.pattern4();
		System.out.println("_______________________");
		p2.pattern41();
		System.out.println("_______________________");
		p2.pattern5();
		System.out.println("_______________________");
		p2.pattern7();
		System.out.println("_______________________");
		p2.pattern8();
		System.out.println("_______________________");
		p2.pattern9();
		System.out.println("_______________________");
		p2.pattern10();
		System.out.println("_______________________");
		p2.pattern11();
		System.out.println("_______________________");
		p2.pattern12();
		//**************
	/*	System.out.println("_______________________");
		p.dimond();*/
		//****************
		System.out.println("\n_______________________");
		p2.pattern13();
		System.out.println("_______________________");
		p2.pattern14();
		System.out.println("_______________________");
		p2.pattern15();
		System.out.println("_______________________");
		p2.pattern16();
		System.out.println("_______________________");
		p2.pattern17();
		
	}

}

