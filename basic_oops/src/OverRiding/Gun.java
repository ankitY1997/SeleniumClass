package OverRiding;

public class Gun extends Game
{
	@Override
	public void use()
	{
		System.out.println("you got the gun");
		System.out.println("load the barrel and pull the the trigger");
		System.out.println("you shot him ==>");
	}
}
