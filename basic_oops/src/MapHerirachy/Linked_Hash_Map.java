package MapHerirachy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Linked_Hash_Map {
	
	
	
	/*LinkedHashMap =>it is a class which extends HashMap class here we will predict the output
	 * 
	 * Properties=>
	 * 
	 * insertion order will be maintained 
	 * 
	 * 
	 * 
	 */
	static LinkedHashMap<Integer,String> lp1=new LinkedHashMap<Integer,String>();
	public static void main(String[] args) {
		 method();
		 
		 method2();
	}
	
	public static void method()
	{
		LinkedHashMap<Integer,String> lp=new LinkedHashMap<Integer,String>();
		
		lp.put(124,"ankit");
		lp.put(1245,"girish");
		lp.put(789,"dumpy");
		
		for(Map.Entry<Integer,String> x :lp.entrySet())
		{
			if(x.getValue().equals("ankit"))
			{
			System.out.println(x.getKey());
			}
		}
	
	}
	
	/** get(ObjectKey)=>get its a method which returns the value of key
	 * 
	 */
	
	
	
	public static void method2()
	{
		LinkedHashMap<Integer,String> m1=new LinkedHashMap<Integer,String>();
		
		m1.put(124,"ankit");
		m1.put(1245,"girish");
		m1.put(789,"dumpy");
	      System.out.println(m1.get(789));
		System.out.println(Linked_Hash_Map.get1(m1, 124));
		
	}
	
	/**
	 * it  is used for knowing a values of collection with help of key
	 * @param c
	 * @param Key
	 * @return object
	 */
	public static Object get1(LinkedHashMap<Integer, String> c, Object Key) {

		LinkedHashMap<Integer, String> lp = new LinkedHashMap<Integer, String>(c);

		for (Map.Entry<Integer, String> x : lp.entrySet()) {
			String value = Key.toString();
			if (x.getKey().toString().equals(value)) {
				return x.getValue();
			}
		}
		return -1;
	}
	
	
	
}
