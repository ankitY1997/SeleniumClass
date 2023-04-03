package StringHandling;

public class Array1 
{
public static void main(String[] args)
{
	int[] a=new int[3];/*this is called array of creation array creation with help of new key word
	beacuse array is also like an object*/
	String[] m=new String[3];
	// if you are creating an object than constructor will  start to give a value as default me ans
	//in int = 0 and string has a default value null lets take an example
	
	for(int i=0,j=0;i<a.length;i++,j++)
	{
		System.out.println(a[i]);
		System.out.println(m[j]);
	}
	for(int i:a)
	{
		System.out.println(i);
	}
	
	
	
}
}
