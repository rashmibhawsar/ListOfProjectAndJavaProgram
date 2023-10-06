package _9day;

//with argument  2) without argument 

//Method Overloading - creating two or more methods with same name but different argument
public class MethodExample {

	public static void main(String[] args) {
		
		MethodExample r= new MethodExample();
		
		r.sum(22,33,66);
	    r.sum("hello","welcome",23);
	    
	}
	//return type =datatype int char float string void 
	//without argument
	void sum()
	{
		System.out.println("this is no argument method ");
	}
	
	
	//with argument
	void sum(int a,int b)	{	
		System.out.println(a+b);	
		}
	
	 
	
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	void sum(int a,int b,int c,int d)
	{
		System.out.println(a+b+c+d);
	}
	
	void sum(String a,String b,int c) { System.out.println(a+b+c );}

}



