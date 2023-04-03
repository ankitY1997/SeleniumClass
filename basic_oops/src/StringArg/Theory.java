package StringArg;

public class Theory 
{

	/*why main method is String[] args  =>because String is a data which is able to store all 
	 * kind of data like character ,int ,double 
	 * 
	 * we can directly call the main if you dont have any value means it will also call when you
	 * Doesn't provide a value  null
	 * 
	 * but if you do a work through a command line so it wil treat all the argument as a string 
	 * 
	 * so we have to convert so lets see how we can doo that 
	 *  */
	
	
	public static void main(String[] args) 
	{
		
		con(null);//it will accept the value of null  so thats why its called command line  
	
	}
	
	
	public static  void con(String[] args)
	{
		args=new String[5];
		
		args[0]="ankit";
		args[1]="yadav";
		args[2]="xyz";
		
		System.out.println(args[0]);
		
		
	}
	
}
