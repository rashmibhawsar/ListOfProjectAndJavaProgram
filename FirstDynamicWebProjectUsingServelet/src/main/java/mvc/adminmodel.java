package mvc;

//getter &setter
//model class |bean class |Pojo class

//bean class private fields ,public getter,setter 
public class adminmodel {

	private String email,pass;
	
	public void setEmail(String email)

	{
		this.email=email;
	}
	
	public void setPass(String pass)


	{
		this.pass=pass;
	}
	
	public String getEmail()


	{
		return email.toUpperCase();
		
	}
	public String getPass()


	{
		return pass;
		
	}
	
}
