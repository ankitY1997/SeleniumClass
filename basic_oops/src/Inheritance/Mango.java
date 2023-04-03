package Inheritance;

public class Mango extends Fruit
{
  String qual="mango is king of all fruit";
  String colour="mango is yellow colour";
  
  //now we have four variable  member  because two is mango and two  is fruit class because we
  //inherit the property of Fruit class now see how we can easily call Fruit class member without 
  //creating a object of Fruit class we call with help of creating a instance of mango or child we can say
  
  public static void main(String []args)
  {
	  Mango e1=new Mango();
	 System.out.println(e1.colour);
	 System.out.println(e1.qual);
	 
	 //now we call parent method 
	 
	 System.out.println(e1.colour_1);
	 System.out.println(e1.qual_1);
	 System.out.println(e1.qualFruit());
	 
	 //so we can see how we call fruit properties without creating instance of fruit class
	 //because mango or we can say child inherit he property of mango or parent
  }
}
