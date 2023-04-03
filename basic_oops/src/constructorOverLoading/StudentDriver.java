package constructorOverLoading;

public class StudentDriver 
{
public static void main(String []args)
{
	Student n=new Student("ankit","123abcdef");
	n.display();
	Student m=new Student(24,"ankit");
	m.display();
	Student k=new Student(1234567890,50000);
	n.display();
}
}
