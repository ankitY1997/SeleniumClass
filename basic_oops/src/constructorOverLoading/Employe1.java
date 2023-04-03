package constructorOverLoading;

public class Employe1 
{
	String name;
	//String  emp_id;
	int age;
	long codeNo; 
	double salary;
	
	/*here we can achieve   overloading by different parameter data type*/
	Employe1(String name)
	{
		this.name=name;
	}
	Employe1(int age)
	{
		this.age=age;
	}
	 Employe1(long codeNo)
	{
		 this.codeNo=codeNo;
	}
	 Employe1(double salary)
		{
		this.salary=salary;	
		}
	 public void Display() 
	 {
		 System.out.println("this is the employe name :"+name);
			System.out.println("this is the employe age :"+age);
			System.out.println("this is the employe salary :"+salary);
			System.out.println("this is the employe salary :"+codeNo);
			System.out.println("************************************************");
	 }
}
