package Assignment1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Program6 
{

	
	public static void main(String[] args) {
		
		
		String word="ankiy124356";
		
	 for(int i=0;i<word.length();i++)
		{
			char first=word.charAt(i);
			int ch=(int)first;
			if((ch>=65&&ch<=90)||(ch>=97&&ch<=122))
			{
				System.out.print((char)ch);
			}
			
		}
	 
	 System.out.println(" ");
	 minMax();
	}
	
	
	public static void minMax()
	{
		int []a= {200,20,5,40,57,57,68,89,100,40};
		
		int min=a[0];
		int max=a[0];
		for(int i=0,j=1;i<a.length;i++,j++)
		{
			
			if(j<a.length)
			{
				
				if(a[i]>max)
				{
					max=a[i];
					//System.out.println(a[i]);
					
				}
				
			}
			
		}
		System.out.println("the maximum number is =>"+max);
		
		
		for(int i=0;i<a.length;i++) 
		{
		
			if(a[i]<min)
			{
				min=a[i];
				
			}
		}
		System.out.println("minimum number is :"+min);
	}
}
