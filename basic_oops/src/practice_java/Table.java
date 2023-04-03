package practice_java;
import java.util.Scanner;
public class Table 
{
public static void main(String []args)
{
	/*Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
		int n=sc.nextInt();
	int i=n;
	int j=1;
	int k;
	if(n==n)
	{
	while(i<=n)
	{
		j=1;
		while(j<=10)
		{
			k=i*j;
		System.out.println(i+"*"+j+" = "+k);
		j++;
		}
		i++;
	}
	}*/
	main(0,0,1);
}
public static void main(int n,int a,int b)
{

	
	while(n<=50)
	{
		if(a==0)
		{
			System.out.print(a+" ");
		}
		int c=a+b;
	a=b;
		System.out.print(b+" ");
		b=c;
		n++;
	}
}
}
