package constructorOverLoading;

public class EmployeDriver 
{
public static void main(String[]args)

{
	Employe n=new Employe("ankit",24);//the value goes or initialization  only that  constructor which have a same parameter or data type;
	n.display();
	Employe v=new Employe("ankit");
	v.display();
	Employe g=new Employe("ankit","24cde",24,153);
	g.display();
	Employe f=new Employe("ankit","148@45",24);
	f.display();

}
}
