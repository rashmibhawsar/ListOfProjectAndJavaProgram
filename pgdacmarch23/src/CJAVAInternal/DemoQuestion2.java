package CJAVAInternal;


//********************parent class vehical****************************
	class Vehical {

	int cost ;
	int no_ofWheels =4;
	String bodyType ;
	String Vehicaltype;
	
	Vehical(String bodyType, String Vehicaltype){
		this.bodyType = bodyType;
		this.Vehicaltype = Vehicaltype;
		System.out.println("vehicle constructor ");
	}
	void display()
	{
		System.out.println(" No of wheels is... "+no_ofWheels);
	}
	
	
}

//*****************************(child class )Automobile of Vehical**********************************

class Automobiles extends Vehical
{
	boolean speedDisplay ;
	boolean containsMotor ;
	int no_of_seats;
	
	Automobiles(int no_of_seats)
	{
		super("metalbody","automobile");
		this.no_of_seats = no_of_seats;
		speedDisplay =true;
		 containsMotor =true;
		 
		}
	
	
	void printAutomobile(){
		System.out.println("Automobile contrains vehical type  "+Vehicaltype);
		System.out.println(" No of wheels is... "+no_ofWheels);
		System.out.println(" automobile body type is... "+bodyType);
		System.out.println("Automobile conatains speeddisplay  " +speedDisplay);
		System.out.println("Automobile conatains motor  " +containsMotor);
		
	}


	void speed(){
		System.out.println("Inside AUTOMOBILE class");
	}
}

class Car extends Automobiles
{ 
	Car(){
		super(5);
	}

	void display(){
		
	    System.out.println(" automobile body type is... "+bodyType);
		System.out.println("car is the type of .."+Vehicaltype);
		System.out.println("CAR conatains speeddisplay  " +speedDisplay);
		System.out.println("CAR conatains motor  " +containsMotor);
		System.out.println("No of seats in car  " +no_of_seats);
	}


	void speed(){
		System.out.println("speed of car class is 90-100");
	}
}


class Bus extends Automobiles
{
	Bus(){
		super(45);
	}
	
	void display(){
	    System.out.println(" automobile body type is... "+bodyType);
		System.out.println("bus is the type of .."+Vehicaltype);
		System.out.println("bus conatains speeddisplay " +speedDisplay);
		System.out.println("bus conatains motor  " +containsMotor);
		System.out.println("No of seats in bus  " +no_of_seats);
	}


	void speed(){
		System.out.println("speed of bus class is 60-90");
	}
}


//********************************(child class )pulledVehical of Vehical*********************************
class PulledVehicals extends Vehical
{	int no_of_seats;
	
	public PulledVehicals() {
		super("wooden","motorless");
		
	}
	
	void display(){
		//System.out.println("Automobile contrains vehical type"+Vehicaltype);
		System.out.println(" No of wheels is... "+no_ofWheels);
		System.out.println(" pulledvehical body type is... "+bodyType);
	
		
	}


	void speedOfPulledVehical(){
		System.out.println("Inside PULLEDVehical class");
	}
}


class Cart extends PulledVehicals
{

	
	public Cart() {
		no_of_seats =6;
		Vehicaltype ="cart";
		
	}
	
	void display(){
		System.out.println("pulledvehical contrains vehical type  "+Vehicaltype);
		System.out.println(" No of wheels is...  "+no_ofWheels);
		System.out.println(" cart body type is...  "+bodyType);
		System.out.println("No of seats in cart  " +no_of_seats);
	
		
	}


	void speedOfPulledVehical(){
		System.out.println("speed of cart is 10-20");
	}
}
class Rikshaw extends PulledVehicals
{
	void display(){
		System.out.println("rikshaw contrains vehical type  "+Vehicaltype);
		System.out.println(" No of wheels is... "+no_ofWheels);
		System.out.println(" rikshaw body type is... "+bodyType);
		
		
	}

	void speedOfPulledVehical(){
		System.out.println("speed of Rikshaw is 10-20");
	}
}


//**************************************main function**********************

public class DemoQuestion2 {

	public static void main(String[] args) {
		Vehical v = new Vehical("Default","Default");
		v.display();
		System.out.println("***************************");
		Automobiles a = new Automobiles(10);
		a.display();
		a.speed();
		System.out.println("***************************");
		Car c = new Car();
		c.display();
		c.speed();
		System.out.println("***************************");
		Bus b = new Bus();
		b.display();
		b.speed();
		System.out.println("***************************");
		PulledVehicals p = new PulledVehicals();
		p.display();
		p.speedOfPulledVehical();
		System.out.println("***************************");
		Cart c1 = new Cart();
		c1.display();
		c1.speedOfPulledVehical();
		System.out.println("***************************");
		Rikshaw r = new Rikshaw();
		r.display();
		r.speedOfPulledVehical();
		
		



	}

}
