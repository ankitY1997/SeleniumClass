package Static_keyword;

public class StaticVariable_driver 
{
	static int k;
	static int m;
	static int l;
	static int j;
	public static void main(String []args)
	{
		System.out.println(l);//0
		System.out.println(j);//0
		System.out.println(StaticVariable.j);//this method for when u aces static global variable which persent in another class block 40
		StaticVariable v=new StaticVariable();//
		System.out.println(v.l); //u can also aces to create an object but suppose u do not want create an object and u want to aces than u have to use above mathod.//0
		System.out.println(v.j);//40
	}

}
