package Collection;

import java.util.Stack;
import java.util.Vector;

public class Vector_Theory {

	/*
	 * Vector=>vector is a class which implements a list interface vector used
	 * dynamic array data structure to store an object
	 * 
	 * 
	 * constructor of vector=>
	 * 
	 * 
	 * Vector vc=new Vector();
	 * 
	 * by this constructor we can created a by default dynamic array and its initial
	 * size is 10 but when 70% size is occupied then its increase our size 100%
	 * 
	 * Vector vc=new Vector(intialCapacity);
	 * 
	 * by this constructor we can change its initial capacity from 10 to 9 or 20 etc
	 * 
	 * 
	 * Vector vc=new Vector(Collection c);
	 * 
	 * By this constructor we can add a collection and it will automatically
	 * converted in to vector
	 * 
	 * Vector vc =new Vector(intialCapacity,int size);
	 * 
	 * By this constructor we can give initial capacity as well as we can also give
	 * it's size
	 * 
	 * 
	 * Difference between ArrayList and Vector
	 * 
	 * 1) vector is a legacy class of java but Arraylist not a legacy class
	 * 
	 * 2)vector is synchronized but ArrayList is non synchronized so therefore
	 * vector is a thread safe but Arraylist is not thread safe
	 * 
	 * 3)vector performance is slower then array list
	 * 
	 * 4)in arraylist when 70% size is occupied then it's increase its size up to 50
	 * percentage but in case of vector its size increases 100 percentage other
	 * words we can say double.
	 *
	 * 5)insertion order will be maintained 
	 * 
	 */
	
	public static void main(String []args)
	{
		Vector vc =new Vector();
		
		vc.add("ankit");
		vc.add("54");
		vc.add(54);
		vc.add("640");
		vc.add("640");
		vc.add("640");
		vc.add("640");
		vc.add("640");
		System.out.println(vc);
		
	}

}
