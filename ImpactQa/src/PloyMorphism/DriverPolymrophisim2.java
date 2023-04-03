package PloyMorphism;

public class DriverPolymrophisim2 extends PolyMorphisim2
{
	/*here we will in herit the properties of poly2 and same name and same name 
	 *or same  method we will made in this class. so its concept of method overriding */
	String name;
	int size;
	
	public void shape()
	{
		System.out.println("this is the driver poly morphisim");
		System.out.println("this is the default shape over riding ");
		System.out.println("====================================");
	}
	
	public void shape(String name,int size)
	{
		this.name=name;
		this.size=size;
		System.out.println("this is the driver poly morphisim");
		System.out.println("this is "+name+" of shape");
		System.out.println("this is "+size+" of shape");
		System.out.println("====================================");
	}
	public void shape(int size,String name)
	{
		this.name=name;
		this.size=size;
		System.out.println("this is the driver poly morphisim");
		System.out.println("this is "+name+" of shape");
		System.out.println("this is "+size+" of shape");
		System.out.println("====================================");
	}
	
	public static void main(String []args)
	{
		PolyMorphisim2 pc=new PolyMorphisim2();
		pc.shape();
		pc.shape("rectangle",360);
		pc.shape(180,"trinagle");
		
		DriverPolymrophisim2 dc=new DriverPolymrophisim2();
		dc.shape();
		dc.shape("circle",360);
		dc.shape(180,"triangle2");
		
	}
}
