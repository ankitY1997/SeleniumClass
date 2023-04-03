package StringHandling;

public class StringMethod 
{
public static void main(String []args)
{
	String name="ankit";
	String dateofbirth="24 jan 1997";
	String father_name="kamalakant yadav";
	String mother_name="indravati devi";
	String name1="Ankit";
	String text="my name is ankit";
	int x=10;
	String y = String.valueOf(x); 
	
	
	//first we will convert in upper case
	//System.out.println(name.toUpperCase());//here it will become ANKIT
	//System.out.println(name1.toLowerCase());//here it will become ankit
	//System.out.println(mother_name.length());//string has 14
//	System.out.println(father_name.length());// if you are talking about string than it will calculate 
	System.out.println(name.equals(name1));//if you are comparing directly so we can name=name1 here two string are  miss match that time it will give result false
	
	
	//if you want to  check it will only check string not lower case or upper cases  so you have to use 
	System.out.println(name.equalsIgnoreCase("chrome"));//so her it will give true
    //it you want to calculate the character so it will counting always 
	System.out.println(mother_name.charAt(12));//v
	// if you want to check string is present or not 
	System.out.println(text.contains("ankit"));//so here result will be true
	System.out.println(text.substring(2, 6));//(2,5)
	System.out.println(text.substring(2));
	
	
}


}
