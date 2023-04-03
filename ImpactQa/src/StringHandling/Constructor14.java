package StringHandling;

public class Constructor14 
{
	String name="gaurav";
	//we have a two type of constructor 
	//1.default constructor
	//2.parameterized constructor
public static void main(String []args)
{
	Constructor14 s=new Constructor14("ankit");
	Constructor14 v=new Constructor14(45+20);
	Constructor14 g=new Constructor14("girish",45+20);
}

 public Constructor14(String name)
 {
	 
	System.out.println("this is parametrized constructor :"+name); 
	System.out.println("this is parametrized constructor :"+this.name); 
 }
 //what is constructor overloading
// when we are using a same name constructor in different type constructor overloading we can achieved with help of //different arguments and different data type 
 //or changing a sequence of data type
 
  //1.achieving constructor overloading using a   different types of data type lets see how 
 Constructor14(int num)
 {
	System.out.println("this is second constructor "+num); 
 }
 //2.achieved overloading throw a we can increase a data type length 
 Constructor14(int num,String name )
 {
	 System.out.println("this is third  constructor "+num+name);	 
 }
 //3.by changing of sequence we can achieved overloading

 Constructor14(String name,int num)
 {
	 System.out.println("this is fourth  constructor "+name+num); 	
 }
 
}
