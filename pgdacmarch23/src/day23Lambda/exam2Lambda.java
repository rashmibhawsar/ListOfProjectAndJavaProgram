package day23Lambda;


interface testing{	void show();}

//approach 1 
class abc implements testing
{	public void show() {}
}



public class exam2Lambda {

	public static void main(String[] args) {
		
          //approach 2  by making anonymous class
		
		      testing h= new testing()
				{
			     public void show() {}
				};
			
				h.show();
		
	           //approach 3 shortcut of line 17 to 22 
				testing h1 = ()-> { System.out.println("welcome");};//by creating annoymous class
				h1.show();
	}

}
