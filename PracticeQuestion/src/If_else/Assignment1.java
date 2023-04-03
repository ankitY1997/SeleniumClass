package If_else;

public class Assignment1 
{
	public static void main(String []args)
	{
int x=80;
int y=70;
int z=65;

if((x>y)&&(x>z))
{
	System.out.println("the big number is :"+x);
	
}
else if((y>x)&&(y>z))
{
	System.out.println("the big number is :"+y);
}
else if((z>y)&&(z>x))
{
	System.out.println("the big number is :"+z);
}
	}

}
