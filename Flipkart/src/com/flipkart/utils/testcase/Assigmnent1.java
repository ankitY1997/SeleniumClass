package com.flipkart.utils.testcase;

public class Assigmnent1 {
	
	
	public static int  totalstr;
	public static void main(String[] args) {
		String []a= {"ab","bc","ajnd",};
		totalstr=a.length-1;
		method2(a,totalstr);
		
	}
	
	public static void method2(String [] s,int totalstr)
	{
		
		
		
		if(totalstr>=0)
		{
			
			System.out.println(s[totalstr]);
			method2(s,totalstr-1);
			
		}
		
		 
		 

		
		
	}

}
