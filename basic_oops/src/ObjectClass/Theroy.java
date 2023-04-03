package ObjectClass;

public class Theroy 
{

	/*Object class=>object class is super most class of every class.
	 * whenever we design the class then by default it will inherited by class 
	 * in object class we have a 11 method .which is very important some of important 
	 * methods we have discuss like
	 * 
	 *1)=> getClass();=>its a final method so we can't be over ride this method and this method use 
	 *to track the address of class
	 *
	 *design
	 *
	 *public final Class getClass()
	 *{
	 *
	 *
	 * return Class;
	 *}
	 *
	 *       imp=>its is used to find out the instance of class name in which class instance is where its arrived
	 *
	 *so let see how we can use the program1
	 *
	 **************************************************************************************
	 *
	 *2)=>toString();=> to string is a method which return type is string and its bascially
	 *give the address of object 
	 *
	 * we can over ride the method so let see how we can use 
	 * 
	 * design=>
	 * 
	 * public String toString()
	 * {
	 * 
	 * 
	 * return getClass().getName()+"@"+Integer.toHexString(Integer.hashCode)
	 * }
	 *  
	 * 3)=>hashCode()=>hashCode() is method which is provided by object class and its return type is int and it s provide hascCode;
	 * 
	 * and we can override this method also
	 * 
	 * so lets see how we can use
	 * 
	 *  
	 *  so lets see the hashCode() 
	 * 
	 * 
	 * 
	 * 4.)=>equals()=> equals method is used to compare a object member which is present inside 
	 * the object 
	 * other wise we can compare two string in that way (String i==String v) so it will compare the address of twos tring 
	 * because when you write like this 
	 * 
	 * String v="Mohan";,String v="Mohan";=>in heap area there is string constant pool so due to memory saving Specially for string class has one area if you write
	 * like this that mean Both are Stored  in same address.
	 * 
	 * 
	 * if you want to compare two object member so that time you will use .equals method
	 * 
	 * 
	 * otherwise you can use(String v==String g) so it will compare to address
	 * 
	 * So let's see the design
	 * 
	 * 
	 *  equals()=>
	 *  
	 *  public boolean equals()
	 *  {
	 *  
	 *  
	 *  return true;
	 *  }
	 * 
	 * 
	 * 
	 * 
	 * 
	 *  */
	
	
	



}
