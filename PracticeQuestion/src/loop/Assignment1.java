package loop;

public class Assignment1 
{
public static void main(String []args)
{
	int count=0;
	for(int i=1;i<=10;i++)
	{
		count++;
		
		if(count<=5)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		}
		/*if(count>5)
		{
			if(count==5)
			{
				i++;
			}
			for(int j=10;j>i;j--)
			{
				System.out.print("*");	
			}
			System.out.println();
		}*/
	}
}
}
