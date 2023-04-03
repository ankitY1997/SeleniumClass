package Collection;

import java.util.HashSet;
import java.util.Set;

public class HashSet_methods {
	

	/*Constructor of TreeSet
	 * 
	 * HashSet ls=new LinkedHashSet();
	 * 
	 * HashSet ls=new LinkedHashSet(Collection s);
	 * 
	 * by this constructor we can add another collections
	 */
	
	
	public static void main(String[] args)
	{
	
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(20);
		s1.add(40);
		s1.add(60);
		s1.add(20);
		s1.add(80);
		s1.add(14);
		s1.add(80);
		
		//see here we can not predict the output in which order it comes  and it will remove the duplicate values as well
		
		System.out.println(s1);
		
		
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("ankit");
		hs1.add("girish");
		hs1.add("ankit");
		
		System.out.println(hs1);
		
		/**
		 * second type of constructor
		 */
		
		HashSet<String> hs2=new HashSet<String>(hs1);
		
		hs2.add("mukesh");
		System.out.println(hs2);
		
	}
	
    
}
