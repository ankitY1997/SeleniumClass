package constructorOverLoading;

public class Employe {

/*constructor over loading:-constructor over loading means when you create multiple constructor with different parameter in same class 
 * its main use to initialize  independently which member are you initialize
 * Don't use same data type  in different parenthesis because that time compiler will confused so it will give error
 * here we can do constructor over loading throw a no.of parameter */
	String name;
	String  emp_id;
	int age;
	double salary;
	Employe(String name)
	{
		this.name=name;
	System.out.println("here we can initialize only Employe name ");	
	}
	Employe(String emp_id,int age)
	{
		this.emp_id=emp_id;
		this.age=age;
	}
	Employe(String name,String emp_id,int age)
	{
		this.name=name;
		this.emp_id=emp_id;
		
	}
	Employe(String name,String emp_id,int age,double salary)
	{
		this.name=name;
		this.emp_id=emp_id;
		this.age=age;
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
