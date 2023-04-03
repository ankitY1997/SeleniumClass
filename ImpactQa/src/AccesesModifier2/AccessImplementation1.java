package AccesesModifier2;

import AccesesModifier.Access1;

public class AccessImplementation1 
{

	public static void main(String []args)
	{
		Access1 cc=new Access1();
		//now lets see public and by default accesses modifer variable name
		
		System.out.println(cc.name);
		System.out.println(cc.age);
		System.out.println(cc.color);
		System.out.println("+++++++++++++++++++");
		//default accesses  we also can't access  in another package 
		/*System.out.println(cc.name4);
		System.out.println(cc.age4);
		System.out.println(cc.color4);
		System.out.println("+++++++++++++++++++");*/
		
		//protected  accesses modifier  see here  we can not be fetch  in another package because its protected access modifier 
		 /* System.out.println(cc.name1);
		System.out.println(cc.age1);
		System.out.println(cc.color1);
		System.out.println("+++++++++++++++++++");
		//
		//private obviously we can't fetch in another package or class
		System.out.println(cc.name2);
		System.out.println(cc.age2);
		System.out.println(cc.color2);
		System.out.println("+++++++++++++++++++"); */
		
		
	}
	
}
