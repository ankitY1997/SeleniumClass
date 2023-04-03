package Inheritance;
import java.util.*;
public class Game 
{
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("the range is 400 to 1200");
	System.out.println("enter the point");
	int x=sc.nextInt();
	
	if(x<=400)
	{
		Weapon mc1=new Weapon3();
		mc1.gun();
	}
	else if(x>400&&x<=800)
	{
		Weapon mc2=new Weapon2();
		mc2.gun();
	}
	else if((x>800)&&(x<=1200))
			{
		Weapon mc3=new Weapon();
		mc3.gun();
		
			}
	}
}
