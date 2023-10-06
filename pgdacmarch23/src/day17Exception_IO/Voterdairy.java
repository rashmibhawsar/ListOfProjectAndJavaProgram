package day17Exception_IO;


public class Voterdairy {
public static void main(String[] args) throws Exception
{
	Voterdairy v= new Voterdairy("kamal",11);
	v.check();

/*try {
	Voterdairy v= new Voterdairy("kamal",11);
	//Voterdairy v= new Voterdairy("kamal",19);
	v.check();
}
catch(VotingException f) {
	System.out.println(f);
}*/
	System.out.println("end of program");
	
}
int age;
String name;
Voterdairy(String a,int b)
{
	name=a;
	age=b;
}
	void check()throws VotingException
	
	
	{
		if(age>=18)
			System.out.println("welcome for voting");
		else
			throw new VotingException();
	}

}