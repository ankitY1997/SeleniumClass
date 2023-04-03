package JavaAssignment;

public class AccessObject {

	public static void main(String[] args) {
		
		AccessModifier obj=new AccessModifier();
		
		//now we will call  method 
		
		//so first we will call public  method 
	
		obj.create();
		
		//we will call private  method  which name is read()
		
	//	obj.read();//soo see we cant able to call it 
		
		//now we will call protected  method 
		
		obj.add();
		
		//now we will call this is default method 
		
		obj.post();
		
		
		//now intilaization
		
		obj.i=20;  // this is the public variable 
		obj.k=40;  // this is protected variable 
		obj.m=60;  // this is default variable 
		//obj.j=40;  // this is private variable we able to initialize

	}

}
