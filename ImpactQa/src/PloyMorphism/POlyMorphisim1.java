package PloyMorphism;

import java.nio.file.spi.FileSystemProvider;

public class POlyMorphisim1 
{
/*polymorphisim:-poly means many and morphisim means forms   
 *  polymorphisim categorized into two parts first is compile time polymorphisim and second one is run time polymorphisim
 * in compile time polymorphisim we can say static and there is a concept of method over loading 
 * and in run time polymorphisim we can say dynamic and there is a concept of method over riding
 * what is the difference between compile time  polymorphisim and run time poly morphisim
 * in compile time polymorphisim all method present in same class and in run time polymorphisim method present in different class
 * in compile time polymorphisim method name and signature of method or parameter or arguments  must be different but in run time polymorphisim method name and arguments must be same
 * in compile time polymorphisim  we can only access for creating an object and if its static then we can also directly call but in method over riding we can create an object 
 * because over riding must be non static method 
 * there is no concept of inheritance and here is concept of inheritance without in heritance method over riding not be happen
 * see the example of method over loading or compile time polymorphisim
 *  */
	
	// method over loading we will see the example of shape
	static String shape;
	static String color;
	static int size;
	public static void shape()
	{
		System.out.println("this is the shape method");
	}
	public static void shape(String shape)
	{
		POlyMorphisim1.shape=shape;
		System.out.println("this is the "+shape+" method");
		System.out.println("====================================");
	}
	public static void shape(String color,String shape)
	{
		POlyMorphisim1.shape=shape;
		POlyMorphisim1.color=color;
		System.out.println("this is the "+shape+" method");
		System.out.println("this is the "+color+" of shape");
		System.out.println("====================================");
	}
	public static void shape(String shape,int size)
	{POlyMorphisim1.shape=shape;
	POlyMorphisim1.size=size;
	System.out.println("this is the "+shape+" method");
	System.out.println("this is the "+color+" method");
	System.out.println("this is the "+size+" of"+shape);
	System.out.println("====================================");	
	}
	public static void shape(int size,String Shape)
	{
		POlyMorphisim1.shape=shape;
		POlyMorphisim1.size=size;
		System.out.println("this is the "+shape+" method");
		System.out.println("this is the "+color+" method");
		System.out.println("this is the "+size+" of"+shape);
		System.out.println("====================================");
	}
	
	//see the same name method how its work differently okk.
	//non static method
	
	
	
	public static void main(String []args)
	{
		shape("circle");
		shape("black","hexagane");
		shape("rectangle",360);
		shape(180,"triangle");
	}
	
	
}
