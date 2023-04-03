package CompileTImePolymorphisim;

public class Driver 
{
public static void main(String []args)
{
	//so here we can see it will only call reference member not an object variable 
	//it will also give the result in reference variable out put..it   will not implement or call object variable run time 
	//with child memeber ...so lets see
	
	Viechle v=new ElectricCar();
	System.out.println(v.x);
	
	//so se the result 
	
	//v.start();
	
	//so see it will not call object variable okk.if its not behave like over riding concept
	//it will only call reference member
	
	Car c=new ElectricCar();
	c.start();
	System.out.println(c.x);
	//System.out.println(Viechle.x);
	c.start();
	
	
	
	
	
	
	
	
}
}
