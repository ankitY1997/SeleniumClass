package AccesesModifier;

public class AcessesImplementation 
{
//see the example of public,private ,protected,default
	
	public static void main(String []args)
	{
		Access1 vc=new Access1();
		//now we are accessing these keyword which we made different class
		//lets see first public keyword see we are able to fetch or not
		
		System.out.println(vc.name);
		System.out.println(vc.age);
		System.out.println(vc.color);
		System.out.println("+++++++++++++++++++");
		
		//2.we can see protected keyword which we made different class see we are able to fetch or not
		System.out.println(vc.name1);
		System.out.println(vc.age1);
		System.out.println(vc.color1);
		System.out.println("+++++++++++++++++++");
		
		//3.we can see private modifier which we made different class see we are able to fetch or not 
		
		/*System.out.println(vc.name2);     //see this line gives error because private keyword we can access only same class dont accesses another acesses 
		System.out.println(vc.age2);
		System.out.println(vc.color2);*/
		
		//4.we can see default accesses modifier
		
		System.out.println(vc.name4);
		System.out.println(vc.age4);
		System.out.println(vc.color4);
		System.out.println("+++++++++++++++++++");
		
		
		//now we go another package 
		
		
		
	}
}
