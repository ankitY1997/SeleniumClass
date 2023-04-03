package Collection;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;

public class QueueTheory {
	
	/*Queue=>Queue is an interface which implemented by LinkedList and 
	 *       PriorityQueue and BlokingQueue class and its available java utill
	 *       package
	 *       
	 *  
	 *  Queue Properties=>
	 *  
	 *  Queue works on FIFO pattern where we can add the object from tail
	 *  and remove the object from head 
	 *  
	 * In  Queue we can add a objects inside  dynamic array 
	 * 
	 * Priority Queue is also gives a output in sorting order as like TreeSet but there is an one difference TreeSet does not allowed the 
	 * duplicate value but ProrityQueue allowed a duplicate values
	 * 
	 */
	


	
	public static void main(String[] args) {
		Queue q1=new PriorityQueue();
		
		q1.add("ankit");
		q1.add("girish");
		q1.add("gaurav");
		
		q1.remove();
		System.out.println(q1);
		
		//now we are talking about the stack which works on LIFO concepts
		
		Stack s1=new Stack();
		s1.add("ankit");
		s1.add("girish");
		s1.add("gaurav");
		
		s1.pop();
		System.out.println(s1);
		
		System.out.println("Prority queue and TreeSet comparison");
		main();
	}
	
	
	public static  void main()
	{
		TreeSet<String> t=new TreeSet<String>();
		
		t.add("ankit");
		t.add("girish");
		t.add("gaurav");
		t.add("ankit");
		System.out.println("this is tree set output"+t);	
		PriorityQueue<String> p =new PriorityQueue<String>(t);
		p.add("ankit");
		System.out.println("thisis priority queue output "+p);
		System.out.println("this is equals"+p.equals(t));/**result is same but set stored a data in hashtable where hashing algorithm works
		but in Queue we are following linear  data structure to stored the objects  */
		TreeSet<String> t1=new TreeSet<String>(p);
		
		System.out.println(t.equals(t1));
		
		

	}
}
