package Collection;

import java.util.Stack;

public class Stack_Theory {
	
	
	/** Stack=>Stack is a class in Collection framework which implements  a list interface in stack and also 
	 * extends a vector class.
	 * 
	 * Stack class works on LIFO(LAST IN FIRST OUT )CONCEPTS this is the most important point of this class.
	 *  
	 * that means whatever the last value you have added with help of concept  it will always remove first 
	 * 
	 * 
	 * in stack class has two methods one is push and another one is pop
	 * 
	 * push is used to add the object is dynamic array pop is used to remove the object.
	 * 
	 * if you used pop common so its remove the last object first so lets how its works
	 * 
	 * 
	 */
	
	
	
	/**here we will check LIFO(LAST IN FIRST OUT) PATTERN 
	 * 
	 * 
	 * @param args
	 */
	
	public static void main(String[] args)
	{
		Stack sc=new Stack();
		sc.push("ankit");
		sc.push("amay");
		sc.push("girish");
		sc.push("astha");
		System.out.println(sc);
		
	  	sc.pop();
	  	
	  //now last object will removed 
	
	  	
		System.out.println(sc);
		
		
		//peek() =>its a method of Stack class which is used to get a last object of collection.
		
		System.out.println(sc.peek());
		
	}

}
