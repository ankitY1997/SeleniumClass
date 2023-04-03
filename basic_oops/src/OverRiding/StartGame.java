package OverRiding;
import java.util.*;
public class StartGame 
{

	public  Game pressButton()
	{
		
		System.out.println("enter the score ");
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		
		if(score>100&&score<=400)
		{
			Knife v=new Knife();
			return v;
		}
		else if(score>400&&score<=800)
		{
			Gun k=new Gun();
			return k;
		}
		else if(score>800&&score<=1000)
		{
			Bomb c=new Bomb();
			return c;
		}
		else
		{
			System.out.println("you got nothing ");
			return null;
		}
		
		
		
	}
	
}
