package Assignment1;

import java.util.HashSet;

public class Program5 
{

	
	public static void main(String [] args)
	{
		
		int a[]= {20,14,15,15};
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		boolean flag=false;
		for(int b:a)
		{
			
			
			if(hs.add(Integer.valueOf(b))==false)
			{
			System.out.println(b);	
			
			flag=true;
			}
		}
		
	}
}
