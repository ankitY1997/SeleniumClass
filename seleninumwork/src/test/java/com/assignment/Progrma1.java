package com.assignment;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Progrma1 {
	
	static int value;
	
	public static void main(String [] args)
	{
		
		List<String> list=new ArrayList<String>();
		
		list.add("ankit");
		list.add("girish ankit");
		list.add("shubham grish  ");
		list.add("ankit girish ankit girish");
		list.add("ankit girish gaurav ankit ");
	     list.add("ankit kundan ankit"); 
	     list.add("daksh ankit dubey");
		String expString="ankit";
		String sr="ankit girish ankitgirisih ";
		 

		for(int i=0;i<list.size();i++)
		{
			String newString=list.get(i).trim();
			int totalLength=newString.length()-1;
			
			int totalexplength=expString.length()-1;
			
			int findLength=newString.lastIndexOf("ankit");
			
			if(totalLength==findLength+totalexplength)
			{
				System.out.println("this is last string");
			}
			else
			{
		       System.out.println("this is not last string");
			}
			
			
			
			
			
	      
		}
		
		
	}

}
