package StringBufferClass;

public class Program1 
{

	
	public static void main(String[] args) {
		System.out.println("=======its rev method========== ");
		rev();
		System.out.println("============its append method for adding purpose========= ");
		appen();
		System.out.println("==============this is capacity method=====================");
		cap();
		System.out.println("========this is delete method ==========");
		delete();
		
	}
	
	/*reverse()=>reverse() method is used to reverse character which is present inside string
	 *and its return type is StringBuffer  */
	
	public static void rev()
	{
		
		StringBuffer sb=new StringBuffer("ankit yadav");
		
		sb.reverse();//see here it will modified sb instance so that means it will change 
		             //modfied so hence proof StringBuffer class cant create an object in scp area
		
		
		
		System.out.println(sb);
		
		
	}
	
	//append(String)=>its method is used to add a String with another string 
	public static void appen()
	{
	  StringBuffer sb=new StringBuffer("mohan is very happy ");
	  
	  sb.append("today");
	  
	  System.out.println(sb);//so see the result we can directly modified 
	}
	
	
	/*capacity()=>its method provided by StringBufferClass to know the capcity of StringBuffer
	by default StringBuffer has 16 memory block or byte because one block 
	represents one byte  and its return type is int*/
	
	public static void cap()
	{
		StringBuffer sb=new StringBuffer();
		Integer defaultvalue=sb.capacity();
		
		System.out.println("By deafult StringBuffer value =>"+defaultvalue);
		
		StringBuffer sv=new StringBuffer("mohan");
		
		System.out.println(sv.capacity());//now its shows because 16+5=  21 value becuase mohan has a five character
		//or one character is represents one byte 
		
	}
	
	
	public static void delete()
	{
		StringBuffer sb=new StringBuffer("mohan is very happy today");
		
		sb.deleteCharAt(4);
		System.out.println(sb);
	}
	
	
	
	
}
