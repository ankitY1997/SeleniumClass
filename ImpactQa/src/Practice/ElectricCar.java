package Practice;

public class ElectricCar extends Car{
	
	public String name="tesla";
	
	
	public ElectricCar()
	{
		System.out.println("this is child class");
		
	}
	
	public ElectricCar(int a)
	{
		this();
		System.out.println(a);
	}
	public ElectricCar(String name)
	{
		super();
		this.name=name;
		System.out.println("this is child class variable"+this.name);
		System.out.println("this is parent class variable  "+super.name);
	}
	
	public static void main(String []args)
	{
		ElectricCar v=new ElectricCar("xyz");
		
		
	}
	
}
