package Encapsulation;

public class Encapsulation1 
{
	//we have use to  provide visibility for private keyword in another class because you know we will not be fetch private keyword in another class.
	//Encapsulation -how to initialized private key word and how to get private keyword.
	/*so we have to use get an set method get method is used to reterview a data but if you want to set data then you have to use 
	 * set method
	 */
	
	private String name="tiger";
	private String color="black";

	
	public  String skyName()
	{
	 return name;
	 
	}
	
	public void resetName(String name)
	{
		this.name=name;
		//this.color=color;
	}
	
}
