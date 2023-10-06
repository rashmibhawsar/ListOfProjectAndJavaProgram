package day17Exception_IO;

//wap to create user defined exception 
//checked Exception
public class VotingException extends Exception
{
	
	public VotingException()
	{
	System.out.println("check voter guidelines");
	}
	public  VotingException(String m)
	
	{
	System.out.println( m);
	}
	
}

