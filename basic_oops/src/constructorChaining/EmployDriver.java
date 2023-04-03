package constructorChaining;

public class EmployDriver 
{
public static void main(String []args)
{
	Employ m=new Employ("ankit","4160cdef",24,50000);
	m.display();
	Employ n=new Employ("mohan","2160edf",25,40000);
	n.display();
	Employ k=new Employ("mohan","2160edf");
	k.display();
}
}
