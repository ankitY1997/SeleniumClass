package MapHerirachy;

import java.util.HashMap;
import java.util.Map;

public class MapHerirachyPractice {
	
	
	
	
	/**map hierarchy we have Iterable interface and it extends by Map interface and further Map interface 
	implementation avail in three class 1)HashMap extends Linked HasMap 2)TreeMap  
	
	*In Map hierarchy we can store a value in the form of key and value 
	* we can store the duplicate value but we can't store a duplicate key
	* 
	**/
	
	public static void ap()
	{
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"ankit");
		map.put(2, "rajiv");
		
		for(Map.Entry<Integer,String> x:map.entrySet())
		{
		        if(x.getKey()%2==0)
		        {
		        	System.out.println(x.getValue());
		        }
		}
		
	}
	
	public static void main(String[] args) {
		ap();
	}


}
