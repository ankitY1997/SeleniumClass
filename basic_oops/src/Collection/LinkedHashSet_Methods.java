package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class LinkedHashSet_Methods {
	
	
	/*Constructor of TreeSet
	 * 
	 * LinkedHashSet ls=new LinkedHashSet();
	 * 
	 * LinkedHashSet ls=new LinkedHashSet(Collection s);
	 * 
	 * by this constructor we can add another collections
	 */
	
	
	public static void main(String[] args) {

		LinkedHashSet<Integer> ls = new LinkedHashSet<Integer>();
		ls.add(14);
		ls.add(50);
		ls.add(60);
		ls.add(14);
		ls.add(23);

		// insertion order will be maintained and we can predict the output

		Iterator<Integer> ls1 = ls.iterator();

		while (ls1.hasNext()) {
			System.out.println(ls1.next());
		}
		
		/*second type of constructor
		 * 
		 */
		LinkedHashSet<Integer> ls2 = new LinkedHashSet<Integer>(ls);
		
		ls2.add(50);
		System.out.println(ls2);

	}

}
