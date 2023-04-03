package Assignment;

import java.util.Comparator;

public class SortinComp implements Comparator<String> {

	public int compare(String o1, String o2) {
		
		int num=o1.compareTo(o2);
		int num1=o2.compareTo(o1);
		
		if(num<num1)
		{
		 
		   
		  return 1; 
		}
		
			
		
			
			
		
		
		return -1;
	}

	

}
