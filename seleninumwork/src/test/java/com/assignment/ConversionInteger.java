package com.assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConversionInteger {
	
	
	
	
	
	public static void main(String[] args) {
		
		List<String> arr = new ArrayList<String>();
		arr.add("€3,001.00");
		arr.add("Lek0.00");
		arr.add("$500.00");

		LinkedList<Integer> addInt = new LinkedList<Integer>();
		boolean flag=true;
		Integer tempInt=0;
		//System.out.println((int)('.'));
		for (String str : arr) {
			tempInt =0;
			flag=true;
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
			  if(c==46)
			  {
				  flag=false;
			  }
				if (((c >= 48) && (c <= 57))&&(flag==true)) {
					String tempStr=String.valueOf(c);
					Integer newInt=Integer.parseInt(tempStr);
					tempInt=tempInt*10+newInt;	
			  }
			}
			addInt.add(tempInt);
		}
		for (Integer actInt : addInt) {
                 
			System.out.println(actInt);
             
		}
		
		
	}
	
	
	

}
