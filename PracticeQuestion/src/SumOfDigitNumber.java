import java.util.Scanner;
public class SumOfDigitNumber {
//Java program to print the sum of digits of a given number using recursion
	public static int sum=0;
	public static int add=0;
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int digit=sc.nextInt();
		sum(digit,0);
	}
	public static void sum(int digit,int count)
	{
		sum=sum+add;
		if(digit!=0)
		{
			add=digit%10;
			sum((digit=digit/10),0);
		}
		else if(digit==0)
		{
			System.out.println("sum of digit is :"+sum);
		}
	}

}
