package JavaAssignment;
import java.util.*;

public class ReamoveCharacter {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		
		char rem=sc.next().charAt(0);
		
		String name="my name is ankit";
		
		
		for(int i=0;i<name.length();i++)
		{
			
			char c=name.charAt(i);
			
			if(c==rem)
			{
				
			}
			else
			{
				System.out.print(c);
			}
			
		}
		
		
		

	}

}
