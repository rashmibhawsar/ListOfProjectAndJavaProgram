package day10;

import javax.sound.sampled.DataLine;
// dbcol is singletonclass
// keypoint: need only 1 obj to create of the singleton class(dbcol)
class DbCol{
	
	static DbCol d = new DbCol();
	public static DbCol getcon() {
		return d;
	}
	String cong;
	private DbCol() { // if not private then u can create obj of Dbcol
		cong = " localhost:2589/6589";
		
	}
	 void show()
	{
		System.out.println(cong);
	}
}
public class Singleton {

	public static void main(String[] args) {
		Singleton a= new Singleton();
		//a.Dbcol();
		DbCol e = DbCol.getcon();// to call static method (ctor) we dont need any object ..so we declare it static
		                           // just by class name we can call but.. the method ur calling 
		                           // it should be public... like getcon
//		DbCol myObj = new DbCol();
	    e.show();
		
		
		

	}

}

