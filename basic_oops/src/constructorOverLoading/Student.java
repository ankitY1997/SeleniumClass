package constructorOverLoading;

public class Student 
{
	String name;
	String  emp_id;
	int age;
	long codeNo; 
	double salary; 
	//here we can achieve overloading by changing a sequence of parameter
	
	Student(String name,String emp_id)
	{
		this.name=name;
		this.emp_id=emp_id;
	}
	Student(int age,String emp_id)
	{
		this.age=age;
		this.emp_id=emp_id;
	}
	Student(long codeNo,double salary)
	{
		this.codeNo=codeNo;
		this.salary=salary;
	}

	public   void display()
	{
		System.out.println("this is the employe name :"+this.name);
		System.out.println("this is the employe id  :"+this.emp_id);
		System.out.println("this is the employe age  :"+this.age);
		System.out.println("this is the employe code no  :"+this.codeNo);
		System.out.println("this is the employe salary  :"+this.salary);
		
		System.out.println("*************************************");
	}
}
