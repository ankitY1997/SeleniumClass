package JavaAssignment;

import java.util.LinkedHashSet;

public class DuplicateCharacters {

	
	public static void main(String[] args) {
		
		
	     String str = "ankita";
	       
	        LinkedHashSet<Character> set = new LinkedHashSet<>();   
	       
	        for(int i=0;i<str.length();i++)   
	            set.add(str.charAt(i));   
	            
	       
	        for(Character ch : set)   
	            System.out.print(ch);   
	       
		
		
	}
	
}
