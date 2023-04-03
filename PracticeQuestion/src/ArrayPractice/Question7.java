package ArrayPractice;

public class Question7 
{
//wajp to print the array element only if its prime number
	public static void main(String []args)
	{
		int a[]= {20,35,31,13,17,21,45,79};
		int count=0;
		int i=1;
		int j=0;
		while(j<a.length)
		{
			int c=a[j];
			//System.out.println(c);
			while(i<c)
			{
				//System.out.println(i);
				if(c%i==0)
				{
					count++;
					//System.out.println(c);
					//System.out.println("=="+count);
					
				}
				
			i++;	
			}
			i=1;
			
			j++;
			if(count==1)
			{
				System.out.println("this is the prime number :"+c);
			}
			
			count=0;
		}
	}
}
