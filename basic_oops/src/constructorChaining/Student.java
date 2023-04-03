package constructorChaining;

public class Student 
{
String name;
String date_of_birth;
int class_name;
int age;

Student(String name,String date_of_birth,int class_name,int age)
{
/*this(); if i used this(); constructor call than it is perfectly fine than compiler directly go there Student() constructor and print what is  written inside  
student() constructor than again it will directly come back to the starting point and read next line	*/
	this(date_of_birth,class_name,age);
	this.name=name;
}
Student(String date_of_birth,int class_name,int age)
{
	this(class_name,age);
	this.date_of_birth=date_of_birth;
	
}
Student(int class_name,int age)
{
	this(age);
	this.class_name=class_name;
	
}
Student(int age)
{
	this();
	this.age=age;
}
Student()
{
	System.out.println("ADITYA BIRLA HIGHER SECONDARY SCHOOL");
	/*System.out.println("this is the name of student "+this.name);null because here we can not initialize name or compiler will start read here because we used  
	this call(this(0) or constructor chaining*/ 
	
}
public void showStudent()
{
	System.out.println("this is the student name :"+name);
	System.out.println("this is the student Date of birth :"+date_of_birth);
	System.out.println("this is the student class name  :"+class_name);
	System.out.println("this is the student age :"+age);
	System.out.println("***********************************************************");
	
}
}
