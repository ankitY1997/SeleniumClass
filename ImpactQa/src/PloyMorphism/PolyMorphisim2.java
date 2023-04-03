package PloyMorphism;

public class PolyMorphisim2 
{
/*here we see the concept of method over riding 
 * we need to remember 1.same name and same argument in different class
 * inheritance concept */
	String name;
	int size;
	
	public  void shape()
	{
		System.out.println("this is the poly morphisim 2 method ");
		System.out.println("this is the default shape over riding ");
		System.out.println("====================================");
	}
	
	public  void shape(String name,int size)
	{
		this.name=name;
		this.size=size;
		System.out.println("this is the poly morphisim 2 method ");
		System.out.println("this is "+name+" of shape");
		System.out.println("this is "+size+" of shape");
		System.out.println("====================================");
	}
	public   void shape(int size,String name)
	{
		this.name=name;
		this.size=size;
		System.out.println("this is the poly morphisim 2 method ");
		System.out.println("this is "+name+" of shape");
		System.out.println("this is "+size+" of shape");
		System.out.println("====================================");
	}
	
	
}
