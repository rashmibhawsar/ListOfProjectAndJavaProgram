package _6_recursion;


public class primeno {
	public static boolean prime(int n,int i)
	{
		

		    if(n==i)
		        return true;
		    else
		        if(n%i==0)
		            return false;
		    else{
		        return prime(n,i+1);
		    }
				
		}
		
	

	public static void main(String args[])
	{
		int n =5;
		int i=2;
		if(prime(n,i))
			System.out.println("prime no");
		else
			System.out.println("not a prime no");
	}
}
