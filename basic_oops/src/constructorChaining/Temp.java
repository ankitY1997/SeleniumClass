package constructorChaining;

//Java program to illustrate Constructor Chaining
//within same class Using this() keyword
class Temp
{
	int x;
	int z;
	int y;
	// default constructor 1
	// default constructor will call another constructor
	// using this keyword from same class
	Temp()
	{
		// calls constructor 2
		this(5);
		System.out.println("The Default constructor");
	}

	// parameterized constructor 2
	Temp(int x)
	{
		// calls constructor 3
		this(5, 15);
	
		System.out.println(x);
		this.x=x;
		System.out.println(y);//
	}

	// parameterized constructor 3
	Temp(int x, int y)
	{
		System.out.println(x * y);
	}

	public static void main(String args[])
	{
		// invokes default constructor first
		Temp n=new Temp();
	}
}

