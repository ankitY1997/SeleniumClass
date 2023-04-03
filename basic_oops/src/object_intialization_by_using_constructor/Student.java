package object_intialization_by_using_constructor;

class Student
{
	 String name;
	 String class_;
	 String date_of_birth;
	 int age;
	 long mobno;
	 
	 
	 Student(String n,String c,String d,int a,long m)
	 {
		 name=n;
		 class_=c;
		 date_of_birth=d;
		 age=a;
		 mobno=m;
	 }
	 public void showValue()
	 {
		 System.out.println("*************student Details******** ");
		System.out.println("student name is: "+name);
		System.out.println("student class is: "+class_);
		System.out.println("student date of birth is: "+date_of_birth);
		System.out.println("student age  is: "+age);
		System.out.println("student mobile number is: "+mobno);
		System.out.println("***********************************");
		
		
	 }
	 

}
