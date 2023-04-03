package Assignment1;
import java.util.Scanner;
public class Program1 
{

	public static Scanner sc;
	
	
	public static void main(String[] args) {
		 sc=new Scanner(System.in);
		//System.out.println("enter the number");
		//int num=sc.nextInt();
		
		
		
		//primeNumb(num);
		
		//reverseNum(num);
		
		
		rid();
		
		
	}
	//program for prime number
	
	public static void  primeNumb(int num)
	{
		
		
		int i=1;
		int count=0;
		while(i<=num/2)
		 {
			
			if((num%i==0)&&(num>1))
			{
				count++;
				
			}
		i++;
			
		}
		if(count==1)
		{
			System.out.println("this number is prime number :"+num);
		}
		else
		{
			System.out.println("this is not prime number :"+num);
		}
		System.out.println("************************************");
	}
	
	//reverse number
	
	public static void reverseNum(int num)
	{
		int rev;
		int revnum = 0;
		while(num!=0)
		{
			
			rev=num%10;
			revnum=revnum*10+rev;
			
			num=num/10;
			
		}
		
		System.out.println("reverse number is =>"+revnum);
		
	}
	
	public static void rid() 
	{
		System.out.println("enter the word ");
		String word=sc.nextLine();
		int i=0;
		String newword="";
		while(i<word.length())
		{
			char c=word.charAt(i);
			int z=c;
			
			//System.out.println(z);
			if(z!=32)
			{
				newword=newword+c;			
			
		    }
		
		
		  i++;
	       }
System.out.println(newword);

    }
	
}




