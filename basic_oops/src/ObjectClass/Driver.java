package ObjectClass;

public class Driver {
	
	String compname;
	String empname;
	int empid;
	
	Driver(String compname,String empname ,int empid)
	{
		this.compname=compname;
		this.empname=empname;
		this.empid=empid;
	}

	public static void main(String[] args) {
		
		Driver v=new Driver("tcs","ankit",4160);
		
		Equals_Method m=new Equals_Method("tcs","ankit",4160);
		
		
		
		//specially for string class its works 
		String k=new String("Mohan");
		String j=new String("Mohan");
	
     	System.out.println(k.equals(j));//true
	
	
	//but when you compare our object directly so its not working because equals method 
    //specially design for String class our class is not a string class
    
     //	let see the result
     	
     	System.out.println(m.equals(v));//so at that time it prints false mean its not working 
     	/*why but our object datas are same so at that time it automatically comparing address
     	so how will you do that ?
     	
     	so we have to design or we have to override object class methods  */
     	
     	
     	
     //now we have override equlas methods so now if both are same so it will print true 
     	//see
     	
     	System.out.println("this is override method :=>"+m.equals(v));
     	
	
     	//at that time it will store only one place and the same address so it will print true
     	
     	
     	//eventally its says like you are comparing a data but it will not comapre a data 
     	//it will compare same address
     	String name="tcs";
     	String name1="tcs";
     System.out.println(name==name1);
		
	}

}
