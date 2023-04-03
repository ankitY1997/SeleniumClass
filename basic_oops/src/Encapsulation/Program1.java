package Encapsulation;

public class Program1 {

/*encapsulation is used to hide a data..and also provide validate and indirect here we can 
 *  used to a private keyword ok
 *  and there is no concept of abstract class   
 *  so lets see the concept
 * and getter and setter method always be public
 */
	private String name;/*so these are the private key word so we can not access those member 
	outside the class only you can access same class*/
	private int age;
	//so lets see how we can provde accessiblity in out side the class  
	//so here we can use getter and setter
	//so lets see
	
	public  String  getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public int getAge()
	{
		return age;
	}
		public void setAge(int age)
		{
			this.age=age;
		}
		//so here we can use those methods
}

