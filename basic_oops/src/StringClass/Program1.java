package StringClass;

public class Program1 
{

	
	public static void main(String[] args) {
		
		
	//	creating a string by String literals
		
		String c="ankit";// =>one object is created in scp area
		
/*when you create a string by literals so it can be stored by in s.c.p area 
*and if you create String and its lierals and values are same so at that time new object 
*is not created while both are variable refer in same object
*and its value is also not change until program will never end .okk
*thats why in scp area garbage collector is not works because at a same time this value is 
*refer multiple variable if one variable is change or null so it will be big problem of another
*variable so thats why value will not be change 
*we can change the reference but value we can't change it.if change the refrence so at that time
*j.v.m will provide automatically reference 
*
*so see the example
*	
		
		just like example */
		
		String m="ankit";//=>no object is created in scp area
		
		String f="Ankit";//=>one object is created in scp area
		
		 c=null;//so at that time it will create new object in scp area and that value
		 //is null but main value  doesn't change and jvm will provide automatically reference
		 //thats why in scp area main value we can't change because it creates big problem for m
		 
		 
		
	System.out.println(c);//those variable refer at same variable
							//see here c value is change and m value is not change =null
	System.out.println(m);//ankit
	
	
	//now we create a String By creating a instance 
	
	//see
	System.out.println("*******************************************************************");
	String s=new String("Mohan");//=>two objects is created and one is heap area
								//and second one is scp area
	//now  here two things happened
	//first is one object s created in heap area and that reference we have s
	//and another is object is created in heap area but that reference we doesn't have
	//because this reference is given by jvm automatically
	
	//but main thing is here garbage collector is works only for heap area 
	//because here jvm will not provided any reference 
	//so its deleted 
	
	String s1="Mohan";//no objects is created in scp area because its already peresent inside 
	                  //there 
	
	String s2=new String("Sohan");//=>two objects are created one is heap area and another 
									//another one is scp area 
	
	String s3=new String("Sohan");//=>one objects is created in heap area 
	                              //scp ara any objects is not created 
	
	s3=null;//here garbage collector delete heap area object but scp area it doesnot delete 
			//the object
	
	System.out.println(s2);
	System.out.println(s3);
	
	
	
	//***********************************************************************************//
	
	//*********now we create a string by using character array***************************//
	
	char[] a= {'a','n','k','i','t'};
	
	String ps=new String(a);//here two objects is created one is heap area and another one is 
							//scp area 
	
	System.out.println(ps);
	
	
	//so this is the creation of String
	
	
	//now we learn string methods  
	
	
	
	
		
	}
	
}
