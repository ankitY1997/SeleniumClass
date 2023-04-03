package JavaAssignment;

import java.util.*;

public class ArraylistDescend {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("css");
		list.add("html");
		list.add("javascript");
		
		System.out.println("Original List : " + list);
		
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println("Descending Order List " + list);
	}
	
}
