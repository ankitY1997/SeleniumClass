package constructorOverLoading;

public class Employe1Driver 
{
	public static void main(String []args)
	{
	Employe1 n=new Employe1("ankit");
	n.Display();
	Employe1 v=new Employe1("mohan");
	v.Display();
	Employe1 x=new Employe1("xyz");
	x.Display();
	Employe1 r=new Employe1(54);
	v.Display();
	Employe1 k=new Employe1(123456789L);
	k.Display();
	}
}
