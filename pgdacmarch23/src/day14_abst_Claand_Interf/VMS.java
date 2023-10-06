package day14_abst_Claand_Interf;


public class VMS {

	public static void main(String[] args) {

//abstract class reference can be created 
  Vehical v;
  
  
  // storing child class object to parenet class reference 
  v= new Car() ;
  
  //v object can access only methods that it has inherited to child class 
  v.speed();
  //v.print();// vehicle reference cannot acess child class method 
	}

}