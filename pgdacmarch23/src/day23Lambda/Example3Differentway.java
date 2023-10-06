package day23Lambda;



interface order
{
	void cancel();
  
}

interface addition
{
	int add(int a,int b,int c);
}
public class Example3Differentway {

	public static void main(String[] args) {
		 
			order o=()->System.out.println("cancelled ");
			o.cancel();
			
			//-------------------------------------
			addition a1= (int a,int b,int c)->{ return a+ b+c;};
			
			System.out.println(a1.add(10, 20, 20));
			
			//-----------------multiple line of return keyword need curly braces--------------------
			addition a2= (a,b, c)->  {return a+ b+c;} ;
			
			System.out.println(a2.add(10, 20, 20));
			//----------------without return keyword---------------------
			addition a3= (a,b,c)->  a+ b+c  ;
			
			System.out.println(a3.add(100,200,300));
			//------------multiple line of code in lambda-------------------------
			
         addition a4= (a,b,c)->{
                        System.out.println("welcome to lambda expression");
                        if(a>b && a>c)
                        	 return 1;
                        else
                        	return 0;
                       };
		
		System.out.println(a4.add(100,200,300));
		
		
		
	}

}
