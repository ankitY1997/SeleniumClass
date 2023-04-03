package ArrayPractice;

public class Question6 
{
//wajp print the those array which sum is greater than 5
	
	public static void main(String []args)
	{
		int a[]= {20,502,1202,1202,123,458639};
		int digit;
		int sum=0;
		int n=0;
		for(int i=0;i<a.length;i++)
		{
			int c=a[i];
		      n=c;
			while(c!=0)
			{  
				 digit=c%10;
				 sum=sum+digit;
				c=c/10;	
				
			}
			if(sum>5)
			{
				System.out.println(n);
			}
			
			
			sum=0;
		
	}
}
}