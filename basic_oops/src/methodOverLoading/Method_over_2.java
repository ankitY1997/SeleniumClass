package methodOverLoading;
import java.util.Scanner;
public class Method_over_2 
{
	public void mul(int a)
	{
		System.out.println("the result is :"+a);
	}
	public  void mul(int a,int b)
	{
		System.out.println("this is the first method ");
	System.out.println("the result is: "+(a*b));
	}
	public void mul(int a,long b,long c)
	{
		System.out.println("this is the second mathod ");
		System.out.println("the result is :"+(a*b*c));
		
	}
	
	public void mul(long a,int b,long c,long d)//
	{
		System.out.println("this is the third method ");
		System.out.println("the reult is :"+(a*b*c*d));
	}
	public void mul(long a,long b,long c,int d,int e )/*this is the example of method over loading by changing a sequence of method parameter
		please see the upper equation and compare it than you get an idea */
	{
		System.out.println("this is the fourth method ");
		System.out.println("the result is :"+(a*b*c*d*e));
	}
	public static void main(String []args)
	{
		Method_over_2 m=new Method_over_2();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value  of  a :");
		int a=sc.nextInt();
		System.out.println("enter the value of  b :");
		int b=sc.nextInt();
		System.out.println("enter the value of  c :");
		int c=sc.nextInt();
		System.out.println("enter the value of  d :");
		int d=sc.nextInt();
		/*System.out.println("enter the value of  z :");
		int z=sc.nextInt();*/
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
