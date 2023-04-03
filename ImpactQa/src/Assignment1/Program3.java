package Assignment1;



public class Program3 
{

	public static void main(String[] args)
	{
		
int a[] []=new int[5][5];

	int k=1; int sum=0;
	//int k=0;
	
	for(int i=0;i<=a.length-1;i++)
	{
		int j=0;
		while(j<=a.length-1) {
			
	
			a[i][j]=k++;
			
			
			System.out.print(" "+a[i][j]);
			
			
			if((i>=3)&&(j!=2))
			{
				sum=sum+a[i][j];
			}
			
			j++;
			
		}
		
		System.out.println("");
		}
		
	
		//System.out.print("");
	
	System.out.println("sum is :"+sum);
	
	System.out.println("**********************************************");
	revrseNumber();
}
	
	
	public static  void revrseNumber()
	{
		int a[] []=new int[5][5];

		int k=1; int sum=0;
		//int k=0;
		
		for(int i=a.length-1;i>=0;i--)
		{
			int j=a.length-1;
			while(j>=0) {
				
		
				a[i][j]=++k;
				
				
				System.out.print(" "+a[i][j]);
				
				
					if(i==j)
					{
					sum=sum+a[i][j];
				}
				
				j--;
				
			}
			
			System.out.println("");
			}
			
		
			//System.out.print("");
		
		System.out.println("sum is :"+sum);
		
		
	}

}