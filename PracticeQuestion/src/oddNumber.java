import java.util.*;
public class oddNumber 
{
	static int sum;
		public static void main(String []args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int value=sc.nextInt();
			int numb=1;
			oddNumber(numb,value);
			System.out.println("the sum of odd number is :"+sum);
			
			
		}
		public static void  oddNumber(int numb,int value)
		{
		
		
			if((numb%2)!=0)
			{
				sum+=numb;
				System.out.println(numb);
			
			}
			if(numb<value)
			{
				oddNumber(numb+1,value);
			}
		}
}
