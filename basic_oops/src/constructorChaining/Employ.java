package constructorChaining;

public class Employ 
{
	String name;
	String  emp_id;
	int age;
	double salary;
	/*this call used to call another constructor inside the same class
	 * Syntax =this(var1,var2,var3........); 
	 * this call must be the  first statement of the constructor 
	 * this is called constructor chaining in this help we can give only one time 
	 * initialization and we dont need to initialize different constructor with  different 
	 * different   parameter .
	 */
	
	Employ()
	{
		System.out.println("company name :"+"Tcs");
	}
	Employ(String name)
	{
		this();
		this.name=name;
	System.out.println("here we can initialize only Employe name ");	
	}
	Employ(String name,String emp_id)
	{
		
		this(name);
		this.emp_id=emp_id;
		
	}
	Employ(String name,String emp_id,int age)
	{
		this(name,emp_id);
		this.age=age;
		

		
	}
	Employ(String name,String emp_id,int age,double salary)
	{
		this(name,emp_id,age);
		this.salary=salary;
	}
	public  void display()
	{
		System.out.println("this is the employe name :"+name);
		System.out.println("this is the employe id  :"+emp_id);
		System.out.println("this is the employe age :"+age);
		System.out.println("this is the employe salary :"+salary);
		System.out.println("************************************************");
	}
}
