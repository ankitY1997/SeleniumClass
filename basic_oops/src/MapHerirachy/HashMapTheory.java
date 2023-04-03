package MapHerirachy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTheory {
	
	
	/**HashMap=>HashMap is class which implements Map interface in HashMap we can store a object in the form
	 * of key and value pair.values are stored in the form of objects
	 * 
	 * properties of HashMap=>
	 * 
	 * 1)HashMap we can't add duplicate keys because it will override the previous key .and we can't
	 * predict the output of HashMap.
	 * 
	 * number of keys called keySet.
	 * 
	 * number of value called values.
	 * 
	 * number of key and value pair called entry set
	 * 
	 * so lets see how we can implements 
	 * 
	 * Constructor of HashMap=>
	 * 
	 * HashMap m1=new HashMap();
	 * 
	 * 2)
	 * 
	 * HashMap m1=new HashMap(Collection c)
	 * 
	 * this kind of HashMap we can add another collection 
	 * 
	 */
	
	public static void main(String[] args) {
	
		hashMapMethod();
		System.out.println("this is Key set method of HashMap=>");
		hashMapMethod1();
		System.out.println("this is values  method of HashMap=>");
		hashMapMethod2();
		System.out.println("this is enterySet  method of HashMap=>");
		hashMapMethod3();
		System.out.println("this is TreeMap class =>");
		hashMapMethod();
		
		
		
		
		
		
		
	}
	/**
	 * put(key,value)=>in this method helps we can add the objects in the form of key and value pair
	 */

	public static void hashMapMethod()
	{
		HashMap<Integer,String> m1=new HashMap<Integer,String>();
		
		m1.put(1201,"ankit");
		m1.put(25410,"girish");
		m1.put(2807,"dumpy");
		m1.put(1658,"jitesh");
	    System.out.println(m1);
		
	}
	/**
	 * keySet()=>its a method which returns whole key set which is available in the memory
	 * see how its used
	 */
	
	public static void hashMapMethod1()
	{
		HashMap<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1201,"ankit");
		m1.put(25410,"girish");
		m1.put(2807,"dumpy");
		m1.put(1658,"jitesh");
		System.out.println(m1.keySet());
	}
	
	
	/**
	 * values()=its a method of HashMap it returns whole values which available in the memory
	 * 
	 */
	public static void hashMapMethod2() {
		HashMap<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(1201, "ankit");
		m1.put(25410, "girish");
		m1.put(2807, "dumpy");
		m1.put(1658, "jitesh");

		System.out.println(m1.values());

	}
	
	/**
	 * entrySet()=>its a method which return whole keys and values pair which is avail in the memory
	 */
	
	public static void hashMapMethod3()
	{
		HashMap<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(1201, "ankit");
		m1.put(25410, "girish");
		m1.put(2807, "dumpy");
		m1.put(1658, "jitesh");
		System.out.println(m1.entrySet());

	}
	
}
