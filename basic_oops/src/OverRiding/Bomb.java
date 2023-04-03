package OverRiding;

public class Bomb extends Game
{
	@Override
	public void use()
	{
		System.out.println("you got the bomb");
		System.out.println("unpin the bomb");
		System.out.println("and throw it =======>");
		System.out.println("BOOOOOM");
	}
}
