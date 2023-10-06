package day14_abst_Claand_Interf;


//abstract method  are unimplemented method 
//they are just declared with out body
//abstract methods must be  implemented in child class 

//all abstract methods are created in abstract classes 
//abstract class is super class 
//abstract class can have abstract and non abstract method 
//abstarct class can have variable, methods ,constructor
//abstract class cannot be instantiated - means object of this clas cannot be created 
//abstract class reference can be created 
public  abstract class Vehical {

	int cost;
	String name;
	Vehical(){



		System.out.println("vehicle constructor ");
	}
	void show()
	{
		System.out.println("non abstract method ");
	}
	abstract void speed();
}