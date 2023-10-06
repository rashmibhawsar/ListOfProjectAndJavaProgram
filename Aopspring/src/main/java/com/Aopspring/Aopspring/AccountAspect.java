package com.Aopspring.Aopspring;

public class AccountAspect {
	
	public void authentication()
	{
		System.out.println("are u trying to do transition(authenication)");
	}
	public void update()

	{
		System.out.println("ur transition is done successfully(update)");
	}
}
