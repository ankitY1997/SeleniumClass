package practice_of_oops;

public class Program1 
{
/*here we will understand about the non static block or  non static static initialization
	so non static block is not a non static method ok .so if u want to run non static block than u create an 
	object when u create an object than constructor will put a non static block inside the object 
	at same time  execution will start.here we can also initialize non static variable without using object reference variable.
	note-if its a non static method so that time execution will start only on main method and u have to use  object reference variable.so let see.*/
	String name="mohan";
			//name="ankit";  we can not be initialize like that non static variable 0k if u want to Intel's than you have to use non static variable
	int x=50;
	int z=20;
	//now we are creating a non static block not a method. OK
	{
		name="ankit";//here we are initializing the non static block. OK
		System.out.println("this is first non static block 1");
		System.out.println("the name is :"+name);
		ankit();
	}
	/*here we are creating  an object in main method because objects is only created in main method and execution will always  starts first in main method in non static variable and
	  non static because where we will  
	 */
	public static void main(String []args)
	{
		System.out.println("this is main method and execution starts");//execution will start always main method if inside all variable is non static and non static block
		Program1 m=new Program1();/*now at that time when you create an object this time new keyword create an object and than constructor start to put a non static block and variable
		
		 one by one inside the object but what happens non static variable and non static block is executed at a time but if u want to executed non static method than u
		 have to use refrence variable         */
		System.out.println("this is also main method ofter constructor");
		System.out.println(m.x);//because here we are in  main method  so we we have to use object reference variable to display non static variable 
	//m.ankit();
		
	}
	{
		x=40;
		z=65;//initializing a non static variable
		System.out.println("this is non static second block");
		System.out.println(x);
		System.out.println(z);
		
	}
	public void ankit()
	{
		x=70;
		System.out.println("this is the non static method block");
		System.out.println(x);//here we don't use to reference variable because its also already loaded and its visible
	}
	
}
/*output-
   1.this is main method and execution starts
   2. this is the first non static block 1
   3.ankit
   4.this is the non static second block
   5.40
   6.65
   7.this is also main method after constructor
   8.40
   9.this is the non static method block
   10.40
    */
