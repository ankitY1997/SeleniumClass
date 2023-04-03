package FinalKeyword;

public class Final_variable 
{
public  final  int i=40;


public static void main(String[] args) 
{
	final int i=60;
//	i=40;//so see it will show the error 
	
	Final_variable fv=new Final_variable();
	
	//fv.i=40;//we can't be initialize again  so lets see here it will throw the error 
	System.out.println(fv.i); //see we will only able to print it  
	
}

}
