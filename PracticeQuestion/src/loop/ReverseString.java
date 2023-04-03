package loop;

//extracting each word
public class ReverseString 
{
	public static void main(String []args)
	{
String s="hello world";
int length1=s.length();
//System.out.println(length1);
for(int i=0;i<length1;i++)
{
	System.out.println(s.charAt(i));

}
System.out.println("**********************************");
		//method call
System.out.println("this is program for reverse string");
		main(length1,s);
	}
	// reverse string 
	public static void main(int  n,String s)
	{
		for(int i=n-1;i>=0;i--)
		{
		System.out.println(s.charAt(i))	;
		}
	}
	
}

