package JavaAssignment;

public class AccessModifier {

	public int i=20;
	private  int j=50;
	protected  int k=60;
	 int m=80;
	
	/*there are the four type of access modifier  
	 * so basically its shows the visibility of states and behavior
	 
	 *private -this access modifier visibility in inside the class
	 *we can t access out side the class.
	 
	 2)
	 public access modifier -this  modifier we can use any where like ouside the class and package
	 *  
	 3)
	 
	 protected access modifier -this  modifier we can use only outside  and inside the class don't use  outside the package 
	 *  
	 4)
	 Default access modifier -this modifier visibility only inside the package we can use any class but remember which is present inside the same package
	    
	 */
	
	public void create()
	{
		System.out.println("this is the public method ");
	}
	
	private void read()
	{
		System.out.println("this is the private mehtod ");
	}
	
	protected void add()
	{
		System.out.println("this is the protected method ");
	}
	
	void post()
	{
		System.out.println("this is the default method ");
	}
	
	//now we will see the use in next programm Accessobject 
	
}
