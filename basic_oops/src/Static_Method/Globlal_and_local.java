package Static_Method;

public class Globlal_and_local 
{
/*global variable name present  with  in the form of local variable both are exist in one block
	but if u put local variable at same name as global variable so at that time compiler read 
	local variable first at that time global variable become a hidden.*/
	static int i=20;
	 static int j=40;
	public static void main(String[]args)
	{
	
		int i=40;
		ankit();
		System.out.println(i);//here compiler give local variable preference//40//
		//now if u want show a global static variable than u use class name.globalvariable name
			j=60;
		System.out.println(j);//if u  want to access non static variable j//90
	}
	public static int ankit()
	{
		int j=20;//
		int c=0;
		Globlal_and_local .j=90;//if u want to intialize a global static variable than u have to use class name.static variable name;
		System.out.println(j);//20
		return c;
	}
}
