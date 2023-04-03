package Encapsulation;

public class Program1Driver {

	public static void main(String[] args) 
	{
		//now first we see we can access or initialize directly or not 
		
		Program1 e1=new Program1();
		//	e1.name="ankit";so we can see we cant directly initialize this private key word so how we can initialize 
		// so here we can use setter method 
		e1.setName("ankit");//so see its perfectly fine
		
		//now we are going to a printing method so we can directly print variable or not so lets see
		
		//System.out.println(e1.name);soo see its showing an error.so how we can doo we can use get method okk 
		
		System.out.println(e1.getName());
		
		//now we take age variavle 
		
		e1.setAge(24);
		System.out.println(e1.getAge());
		
		//in next program we are giving validation also okk
	
		
	}

}
