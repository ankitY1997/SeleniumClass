package StringHandling;

public class StringHandling1 
{
public static void main(String []args)
{
	String y="ankit";
	String z="ankit";

System.out.println(y.equalsIgnoreCase(z));
System.out.println(y.toUpperCase());
y=z.toUpperCase();
System.out.println(y.equals(z));
}
}
