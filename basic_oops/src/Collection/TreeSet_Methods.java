package Collection;

import java.util.TreeSet;

public class TreeSet_Methods {
	
	/*Constructor of TreeSet
	 * 
	 * TreeSet ts=new TreeSet();
	 * 
	 * TreeSet ts1=new TresSet(Collection c);
	 * 
	 * by this constructor we can add another collections
	 */
	
	
	public static void main(String[] args)
	{
		TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("Ankit");
		ts.add("Barki");
		ts.add("Monkey");
		ts.add("Jackin");
		ts.add("Mn");
		//it will compare the string lexicographically 
		
		System.out.println(ts);
		
		TreeSet<Integer> ts1=new TreeSet<Integer>();
		
		ts1.add(15);
		ts1.add(30);
		ts1.add(40);
		ts1.add(60);
		ts1.add(58);
		System.out.println(ts1);
		
		
		//by this constructor we can add another collection
		TreeSet<Integer> ts2=new TreeSet<Integer>(ts1);
		
		ts2.add(20);
		System.out.println(ts2);
		
		
		
		
	}

}
