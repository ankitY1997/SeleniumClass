package Collection;

import java.util.*;

public class ListInetrfaceMethod {
	
	public static List lst;
	
/*  Add the element/elements method  =>
 * 
 * a)add(int index,Object) =>this is list methods same as collection method [add(Object)] but collection does not have any index support here is a index support
 *                                     
 * 
 * 2)addAll(int,Collection)=> list addAll method is a method which also has a index support so you can add a collection at any index but
 * in collection interface we dont have any index support.
 * 
 * 3)remove(index)=>this is list method becuse in this helps we can remove the object with help of index .
 * 
 * 4)get(index)=>
 */
	
	
	
public static void main(String[] args) 
{
	

	method1();
	System.out.println("this is list addAll method ");
	method2();
	System.out.println("this is list remove method ");
	method3();
	System.out.println("this is list get method ");
	method4();
	System.out.println("this is list sort method ");
	method5();
	System.out.println("this is the add a prime number program");
	method6();
	
	
}

   public static void method1()
   {
	   
	   
		 lst=new ArrayList();
		
		lst.add(0, 34);
		lst.add(1, 35);
		lst.add(2, 36);
		lst.add(3, 37);
		lst.add(4, 38);
		lst.add(5,23);
		lst.add(6,17);
	 //now i will add an Object in index number 1
		
	   lst.add(1, 44);
	   
	   lst.remove(3);
	   
	   System.out.println(lst);
	   
	  
		
	   
	   
	   
   } 
   
   
   /*2)addAll(int,Collection)=> list addAll method is a method which also has a index support so you can add a collection at any index but
    *                           in collection interface we dont have any index support.
    * 
    */
   
   public static void method2()
   {
	   List lst2=new ArrayList();
	   lst2.add(0,"ankit");
	   lst2.add(1,"girish");
	   lst2.add(2,"shubham");
	  
	   System.out.println(lst2);
	   //now i want to add all collections  so we have to use 
	 lst2.addAll(1, lst);
	 
	 System.out.println(lst2);
	
	   
	  
   }
   
   /*3)remove(index)=>this is list method becuse in this helps we can remove the object with help of index 
    * 
    */
   public  static void method3()
   {
	   List lst3=new ArrayList();
	   
	   lst3.addAll(0,lst);
	   System.out.println(lst3);
	   
	   //now i want to remove 44 with help of index 
	   lst3.remove(1);
	   
	   System.out.println(lst3);
	   
	   
	   
	   
   }
   
   /*get(index)=>it is method of List interface which is used to get an object with help  of index.here we can use for loop for accessing 
    * a object 
    * 
    */
   
   public synchronized static  void method4()
   {
	  
	for(int i=0;i<lst.size();i++)
	{
		System.out.println(lst.get(i));
	}
	   

	   
   }
   
   /*sort(Comparator) =>this is list sort method where we sort out the method acording to your implementation see
    * 
    */
   
   public static  void method5()
   {
	   
	   Comparator com =new SortIn();
	   
	   lst.sort(com);
	   
	   System.out.println(lst);
   }
   
       public static void method6()
     {
    	   
    	   //now i want only add prime number
    	   List lst3=new ArrayList();
    	    int k=0;
    	   
    	   for(int i=0;i<lst.size();i++)
    	   {
    		   int count=0;
    		   int j=1;
    		   while( j<(Integer)lst.get(i)/2)
    		   {
    			   if((Integer)lst.get(i)%j==0)
    			   {
    				   
    			     count++; 
    			 
    			   }
    			   j++;
    		   }
    		   
    		   if(count==1)
    		   {
    			 lst3.add((Integer)lst.get(i)) ; 
    			 
    		   }
    		   
    	   }
    	   
    	   System.out.println(lst3); 
	   
      }

}
