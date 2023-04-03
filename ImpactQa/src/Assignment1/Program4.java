package Assignment1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Program4 
{

	//1. Find a peak element which is not smaller than its neighboursInput: array[]= {5, 10, 20, 15}Output: 20
	
	
	public static void main(String [] args)
	{
		
		
		int[] a= {5,10,20,15};
		int []k=a;
		//int j=0;
		//shSystem.out.println(a.length);
		
		for(int i=0,j=1;i<a.length;i++,j++)
		{
			
			if(j<=3)
			{
				if(a[i]>a[j])
				{
					System.out.println("first Question output =>"+a[i]);	
				}
			
			}
		}
		
		question2();
		question3();
		
	}
	
	//Input: array[] = {10, 20, 15, 2, 23, 90, 67}
	//Output: 20 or 90Explanation: 
	//The element 20 has neighbors 10 and 15, both of them are
	//less than 20, similarly 90 has neighbors 23 and 67.
	
	
	public static void question2()
	{
		
		int [] a= {10,20,15,2,23,90,67};
		
	
		
		int count=0;
		for(int i=0,j=1;i<a.length;i++,j++)
		{
		
			
			
			if((j<a.length)&&(a[i]!=2)&&(a[j]!=2))
			{
			
			  if(a[i]>a[j]) 
			  {
			  System.out.println("the second Question output =>"+a[i]);
			   }
			}
		}
		
		
		
	}
	
	public static void question3()
	{
		//2.Find minimum and maximum element in an array.Your task is to find the minimum and maximum elements in the array.
		//N = 6A[] = {3, 2, 1, 56, 10000, 167}Output:min = 1, max =    10000
		
		
		int []a= {3, 2, 1, 56, 10000, 167};
		
		int min=a[0];
		int count=0;
		
		int max=0;
		
		for(int i=0,j=1;i<a.length;i++,j++)
		{
			
			if(j<a.length)
			{
			
			if((a[i]>a[j]))
			{

				max=a[i];
			}	
			
	    }
			
			for(int k=0;k<a.length;k++)
			{
				
				if(a[k]<min) 
				{
					min=a[k];		
				}
					
			}
			
			
			
	
		}
		System.out.println(min);
		System.out.println(max);
		
	
	}
	
	
}
