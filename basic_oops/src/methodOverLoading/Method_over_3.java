package methodOverLoading;
import java.util.Scanner;
public class Method_over_3 
{
	//this the example of one class has a multiple main method but you need to remember method parameter will not be same if its same than method overloading will not be there
	//and jvm always read first main(String []args)method
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the operation");
		char opt=sc.next().charAt(0);
		
		if(opt=='/')
		{
			System.out.println("this is divison block");
			
			System.out.println("enter the operator for divide block");
			char o=sc.next().charAt(0);
			
		if(o=='+')
		{
			System.out.println("you are performing division with help of addition ");
			System.out.println("enter the first number a:");
			double a=sc.nextDouble();
			System.out.println("enter the second number b:");
			double b=sc.nextDouble();
			System.out.println("enter the third number d:");
			double d=sc.nextDouble();
			System.out.println("enter the fourth number e:");
			double e=sc.nextDouble();
			System.out.println("enter the denominator number c:");
			double  c=sc.nextDouble();
			
		if((a!=0)&&(b==0)&&(c==0)&&(d==0)&&(e==0))	
				{
			main(a);
				}
		else if((a!=0)&&(b!=0)&&(c!=0)&&(d==0)&&(e==0))
		{
			main(a,b,c);
		}
		else if((a!=0)&&(b!=0)&&(c!=0)&&(d!=0)&&(e==0))
		{
			main(a,b,d,c);
		}
		else if((a!=0)&&(b!=0)&&(c!=0)&&(d!=0)&&(e!=0))
		{
			main(a,b,d,e,c);
		}
	
		}
		else if(o=='*')
		{
			System.out.println("you are perfoming divide operation but you take a operator ");
			System.out.println(" ");
			System.out.println("enter the first number");
			double a=sc.nextDouble();
			System.out.println("enter the second number");
			double b=sc.nextDouble();
			System.out.println("enter the third number");
			double d=sc.nextDouble();
			System.out.println("enter the fourth number");
			double e=sc.nextDouble();
			System.out.println("enter the denominator number");
			int  c=sc.nextInt();
			
		if((a!=0)&&(b==0)&&(c==0)&&(d==0)&&(e==0))	
			{
			Method4.main((int)a);
				}
		else if((a!=0)&&(b!=0)&&(c!=0)&&(d==0)&&(e==0))
		{
			Method4.main(a,b,c);
		}
		else if((a!=0)&&(b!=0)&&(c!=0)&&(d!=0)&&(e==0))
		{
			Method4.main(a,b,d,c);
		}
		else if((a!=0)&&(b!=0)&&(c!=0)&&(d!=0)&&(e!=0))
		{
			Method4.main(a,b,e,d,c);
		}	
		
		}
		}
		if(opt=='+')
		{
			System.out.println("this is the sum block");
			System.out.println(" ");
			System.out.println("enter the  first number");
			long a=sc.nextLong();
			System.out.println("enter the  second number");
			long b=sc.nextLong();
			System.out.println("enter the third number");
			long c=sc.nextLong();
			System.out.println("enter the fourth number");
			long d=sc.nextLong();
			if((a!=0)&&(b==0)&&(c==0)&&(d==0))
			{
				Metod_over1.sum(a);
			}
	else if((a!=0)&&(b!=0)&&(c==0)&&(d==0))
	{
		Metod_over1.sum(a,b);	
	}
	else if((a!=0)&&(b!=0)&&(c!=0)&&(d==0))
	{
		Metod_over1.sum(a,b,c);
	}
	else if((a!=0)&&(b!=0)&&(c!=0)&&(d!=0))
	{
		Metod_over1.sum(a,b,c,d);
	}
	else
	{
		System.out.println("default");
	}
		}
		
		if(opt=='*')
		{
			System.out.println("this is the multification block");
			System.out.println(" ");
			Method_over_2 m=new Method_over_2();
			System.out.println("enter the value  of  a :");
			int a=sc.nextInt();
			System.out.println("enter the value of  b :");
			int b=sc.nextInt();
			System.out.println("enter the value of  c :");
			int c=sc.nextInt();
			System.out.println("enter the value of  d :");
			int d=sc.nextInt();
		
			System.out.println("enter the value of  e :");
			int e=sc.nextInt();
			if((a!=0)&&(b==0)&&(c==0)&&(d==0)&&(e==0))
			{
				m.mul(a);
			}
			else if((a!=0)&&(b!=0)&&(c==0)&&(d==0)&&(e==0))
			{
			m.mul(a,b);	
			}
			else if((a!=0)&&(b!=0)&&(c!=0)&&(d==0)&&(e==0))
			{
				m.mul(a,b,c);
			}
			else if((a!=0)&&(b!=0)&&(c!=0)&&(d!=0)&&(e==0))
			{
			m.mul(a,b,c,d);
			
			}
			else if((a!=0)&&(b!=0)&&(c!=0)&&(d!=0)&&e!=0)
			{
			m.mul(a,b,c,d,e);
			
			}
			
		}
		
		
	}
	public static void main(double a)
	{
		System.out.println("the result is :"+(a/1));
	}
	public static void main(double a,double b,double c)
	{
		System.out.println("the result is :"+((a+b)/c));
	}
	public static void main(double a,double b,double d,double c)
{
		System.out.println("the result is :"+((a+b+d)/c));
	}

	public static void main(double a,double b,double e,double d,double c)
	{
			
			System.out.println("the result is :"+((a+b+e+d)/c));
	}
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	