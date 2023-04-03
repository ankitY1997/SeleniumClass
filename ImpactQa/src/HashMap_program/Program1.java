package HashMap_program;
import java.util.*;
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map=new HashMap<String,String>();
		//this is the adding method
		map.put("name","ankit");
		map.put("country","india");
		map.put("place","delhi");
		
	//if you want to fetch the data so you have to use key value;
		
		System.out.println(map.get("name"));
		System.out.println(map.get("country"));
		System.out.println(map.get("place"));
		System.out.println("========================");
		
		integer();
		
		
	}
	
	public static void integer()
	{
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1, "ankit");
		map.put(2,"grish");
		map.put(3, "gauarav");
		
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
	}

}
