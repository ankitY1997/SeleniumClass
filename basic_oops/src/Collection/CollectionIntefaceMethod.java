package Collection;

import java.util.*;

public class CollectionIntefaceMethod {
	
	protected static Collection c1;
	 protected static  Collection c2;
	 protected static  Collection c6;
//if i am talking about the collection interface so it has provide so many method 
//lets see one by one how its works
	
//first you need to remember one thing in  collection all are value store in the form of object 
	

//1)add(object)=>it's method available  in a collection interface its helps we can store the value.
	             //and its return type boolean
	             //here we can pass object type of argument
	
  public static void main(String[] args) {
	
	  //you know we are not able to create instance of any interface.so we can take help of 
	  //any class.
	  
	   c1 =new ArrayList() ;
	  
	  
	  //now we have to use add method and we can add the value 
	  c1.add(34);
	  c1.add("ankit");
	  c1.add(54.0256);
	  c1.add(36);
	  c1.add(16);
	  c1.add(58);
	  c1.add("daksh");
	  //now see i am able to add heterogeneous type of value
	  
	  //now i wan to show how all value stored in object form
	  
	//  System.out.println(20+c1);in this line we are not able to add any thing because 
	// + operator is used to add same type of value and concatenate with stirng
	  //if i am using so its says it is undefine 
	  
	  
	  System.out.println("c1 is :=>"+c1);
	  
	  System.out.println("this is addAll method ");
	  method2();
           
	  System.out.println("this is remove method  ");
	  method3();
	  
	  System.out.println("this is removeall method  ");
	  method4();

	  System.out.println("this is   retainall method  ");
	  method5();
	  
	  System.out.println("this is   for each  method  ");
	  method6();
	System.out.println("this is size method ");  
      method7();
      System.out.println("this is empty method ");
      method8();
      System.out.println("this is toArray method ");
      method9();
      System.out.println("this is hashCode method");
      method10();
	  
}
  
  //addAll(collection)=>add all method is used to add all the value of collection in to another collection
   // this is method you have to pass collection type of argument
  
  public static void method2()
  {
	 
//	  c1.add("ankit");
//	  c1.add("daksh");
//	  c1.add("vishnu");
	  
	  
	  c2=new ArrayList();
	  c2.add(34);
	  c2.add(46);
	  c2.add(49);
	  
	  c2.addAll(c1);// here we are adding one collection to another collection
	  
	  System.out.println(c2);
	  
	  
  }
	
/* remove(object)=>remove method is used to remove the duplicate  object of another collection
 * but remember one thing if one collection has a multiple duplicate object and you want to remove all the
 * a duplicate object from the collection using remove methods so it can't be possible 
 * by this method because its remove only first duplicate object so lets see..  
 * 
 * return type is boolean
 */

  public static void method3()
  {
	  
	 /*so in c2 collection  we have 34 object stored  in two time  but i will remove this object so we can use
	  * remove method  
	  */
	  //so lets see
	  
	  c2.remove(34);
	//c2=  [34, 46, 49, 34, ankit, 54.0256]
	  
	  System.out.println(c2);
// the reult is :=>	[46, 49, 34, ankit, 54.0256]  

  }
  
  /*removeAll(collection)=> return type is boolean 
   *                        
   *    and its remove all the duplicate object between both collection which object is 
   *    common to each other
   * 
   */
  
  public static void method4()
  {
	  c2.add(34);
	  //c1 is :=>[34, ankit, 54.0256]
	  //c2 is:=>[46, 49, 34, ankit, 54.0256, 34]
	  System.out.println(c2);
	  
	  c2.removeAll(c1);
	  System.out.println(c2);
	 
	  //so its remove all common elements 
	  
	  //the result is :=>[46, 49]
	  
  }
  
  /*4)retainAll(collection)=>retain all method is used to retain the collection when you have 
                               group of collection     
  */
  public static void method5()
  {
	
	  //so lets see
	  
	  
	  
	  System.out.println("these are c1 collections objects =>"+c1);
	  System.out.println("these are c2 collections objects =>"+c2);
	  
	  
	  
	  Collection c3=new ArrayList();
	    c3.add("daksh");
	    c3.add(45);
	    c3.add(59.64);
	   
	   
	   System.out.println("these are c3 collections objects=>"+c3);
	   
	   //in c3 we have a three collections object c1,c2 abd c3
	   
	   
	   c3.addAll(c1);
	   c3.addAll(c2);

       System.out.println("in c3 add c2,c1 collections objects=>"+c3);
       
         //now i want only c2 value in c3 and remaining all objects are removed.
	   
	   //so at that time i have to use retainAll() method 
	   
       c3.retainAll(c2);
       
       System.out.println("after retain all method =>"+c3);
       
       
	
	   
	   
	   
	  
  }
  /*how to get an object from the collections=>by using two ways 1.) is Iterable method
              2.) is for each loop
              3) is for loop but in collection interface we don't have support of indexing
               */
  
  public static void method6()
  {
	 c6=new ArrayList();
	  
	  for(Object c4:c1)
	  {
		  try
		  {
		 Integer c=(Integer)c4;
		 
		    if(c%2==0)
		    {
		     c6.add(c);	
		    }
		  }
		  catch(Exception e)
		  {
			
		  }
		 
		 
	  }
	  
	  System.out.println(c6);
  }
  
  //size()=>size is a method which is used to count the size of collection
  
  public static void method7()
  {
	  System.out.println("these are mislenious methods =>");
	
	  
	  Collection c8=new ArrayList();
	  c8.add("ankit");
	  c8.add(58);
	  c8.add("ankit");
	  
	  //now we have to fine size of the collection
	  
	  System.out.println("the size of collection  is =>"+c8.size());
	  
	  }
	  
  
  /*isEmpty()=>its a method which is used to check there is a object is present or not 
  and its return type is boolean */
    public static void method8()
    {
    	System.out.println("this is isEmpty method ");
    	
    	Collection c1=new ArrayList();
    	c1.add("ankit");
    	
    	System.out.println(c1.isEmpty());
    	
    	
    }
    /*toArray()=>its a method which is used  convert a collection to array 
     * 
     */
    
    public static void method9()
    {
    	System.out.println("this is toArray method");
    	Collection c7=new ArrayList();
    	
    	c2.addAll(c6);
    	c2.addAll(c1);
    	c2.add(33);
    	c2.add(43);
    	
    	System.out.println(c2);
    	Object[] a=c2.toArray();
    	
      	for(Object c:a)
    	{ try {
    		Integer c1=(Integer)c;
    		
    		if(c1%2==0)
    		{
    		c7.add(c1);
    		}
    	}
    	catch(Exception e)
    	{
    		
    	 }
    	}
      	System.out.println(c7);
    
    }
    
    /*hashCode() =>this is a hashCode method every collection is provide a unique number hashCode is a object class methods which is overridden by Collection interface
     * 
     */
    public static void method10()
    {
    	
    	Collection c1=new ArrayList();
    	
    	Collection c2=new ArrayList();
    	
      System.out.println(c1.hashCode());
      System.out.println(c2.hashCode());
    	
    }
    
    
    
    
	  
  }
  

