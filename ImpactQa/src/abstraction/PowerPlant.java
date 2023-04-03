package abstraction;

public class PowerPlant implements RELIANCE,OPGC
{
	public void coal()
	{
	System.out.println("coal is mandatory to genrate a electricity");	
	}
	public void boiler()
	{
		System.out.println("boiler is mandatory to genrate a electricity");
	}
	public void employ()
	{
		System.out.println("employe  is also  mandatory to run the plant ");
	}
	public void turbine()
	{
		System.out.println("turbine  is mandatory to genrate a electricity");
	}
	
	public void place()
	{
		System.out.println("place   is also  mandatory to run the plant ");	
		
	}
	public void railwayTrack()
	{
		System.out.println("railway track  is also  mandatory to transport the plant ");	
	}
	
	public static void main(String []args)
	{
		PowerPlant mc=new PowerPlant();
		
			mc.coal();
			mc.boiler();
			System.out.println(mc);
			
		
	}
	
	
}
