package day12_assignments;



class demo{
	int id;
	String name;
	demo()
	{
		id= 10;name="rashmi";
	}
	demo(int id,String name){
		this.id= id;
		this.name= name;}
	

	
	public void show(){
		System.out.println("id : "+id);
		System.out.println("name :" +name);
	}
}

public class Parameter_Ctor {
	public static void main(String args[]) {
		demo obj1 = new demo();
		demo obj2 = new demo(55,"siya");
	
		obj1.show();
		obj2.show();
	
	}

}
