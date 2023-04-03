package ArrayPractice;

public class Question3
{
//wajp program and print the number which has a 3 digit
	
	public static void main(String []args)
	{
		int []a= {20,256,45,45445,522,5897,100};
		
		for(int i=0;i<a.length;i++)
		{
			int c=a[i];
			
			if((c>99)&&(c<999))
			{
				System.out.println(c);
			}
		}
	}
}
