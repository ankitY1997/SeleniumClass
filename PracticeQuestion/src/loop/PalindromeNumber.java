package loop;
import java.util.*;
public class PalindromeNumber 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int x=sc.nextInt();
		int value=x;
		int rev=0;

			while(x!=0)
			{
				int c=x%10;
				rev=rev*10+c;
				x=x/10;
			}
			if(value==rev)
			{
				System.out.println("this number is palindrome number :"+value);
			}
			else
			{
				System.out.println("this number is not a palindrome number :"+value);
			}
			
			
		}
		
	}
	

