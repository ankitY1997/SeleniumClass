package ArrayPractice;

public class Question4 
{
//wajp to print the sum  of the elements of array
	
	public static void main(String []args)
	{
		int a[]= {20,30,40,50,605,98};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			int c=a[i];
			sum=sum+c;
		
		}
		System.out.println("the sum of total array :"+sum);
	}
}
