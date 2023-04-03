package Inheritance;

public class ChildDog extends ParentDog
{


		
		static String name="max";
	  String color="black";
	     int weight=4;
		
		public void show()
		{
			super.show("ankit","white",45);
			System.out.println("this is child show method");	
		}
		public void show(String name,String color,int weight)
		{
			this.show();
			this.name=name;
			this.color=color;
			this.weight=weight;
			super.name=name;
			super.color=color;
			super.weight=weight;
			
			
		}
		
		
		public static void main(String []args)
		{
			ChildDog tc=new ChildDog();
	
		
	}
}
