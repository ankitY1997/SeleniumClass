package Inheritance;

public class ParentDog 
{
String name="max";
String color="black";
int weight=4;

public  void show()
{
	System.out.println("this is the show method");
}
public void show(String name,String color,int weight)
{
	System.out.println(this.name);
	System.out.println(this.color);
	System.out.println(this.weight);

	this.name=name;
	this.color=color;
	this.weight=weight;
	System.out.println(this.name);
	System.out.println(this.color);
	System.out.println(this.weight);

	
	
}
public static void main(String []args)
{
	ParentDog m=new ParentDog();
	m.show("ankit","black",10);
}


}



