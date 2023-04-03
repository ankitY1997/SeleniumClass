package Assignment;

import java.util.*;

public class Sorting {
	
	
	
	public static void main()
	{
		
		List<String>list=new ArrayList<String>();
		list.add("USD10000.00");
		list.add("USD5000478541");
		list.add("AUD 4587");
		list.add("AUD 64875");
		
		
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		
		List<String>list1=new ArrayList<String>();
		list1.add("USD10000.00");
		list1.add("USD5000478541");
		list1.add("AUD 4587");
		list1.add("AUD 64875");
		
		Comparator<String> com=new SortinComp();
		
		Collections.sort(list1,com);
		System.out.println(list1);
		
		
		
		
	}
    public static void main(String[] args) {
	
    	List<String> li=new ArrayList<String>();
    	
    	
    	System.out.println(li.add("ankit"));
    	
    	System.out.println(li.size());
    	li.remove("ankit");
    	System.out.println(li.size());
    	
    
    	
    	
	}

}
