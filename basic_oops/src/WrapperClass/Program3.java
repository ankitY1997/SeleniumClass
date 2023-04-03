package WrapperClass;

public class Program3 
{

	
	//every integer data we can convert into a string  so lets see how
	
	
public static void main(String[] args) 
{
	
	int num=20;
	//boxing
	Integer x=num;

	
	//here is  method to convert any type of data in to string so lets see
	
	String s=Integer.toString(num);//here we will convert  in string 
	//now if you perform the adding operatio then this time it will concatinate
	
	
	System.out.println(s+100);//20100  becuase now s is a string 
	
	System.out.println(num+100);//here it will give 120 because it will not a string 
	
	
	double z=500.124547;
	
	Double m=z;
	
	String l=Double.toString(z);
	
	//now z is converted into string 
	
	
	System.out.println(l+250);//here it will concatenate
	
	System.out.println(z+140);//640.124547
	
	convertInt();
}

   public static void  convertInt()
   {
	   //here we will see how we can convert string vlaue to integer So here we have method 
	   //lets see
	   
	   
	   String s="123456";
	   
	   //now we have convert into integer so there is a method its called parseInt
	   
	   
	   int con=Integer.parseInt(s);
	   
	   //either we can store primitive data type or Integer 
	   
	   
	   Integer can=Integer.parseInt(s);
	   
	   System.out.println(s+1000);//result is string 1234561000
	   
	   System.out.println(con+1000);//124456  //here we are using int data which we are already converted
	   
	   
	   
	   
	   //supposed if you are stored a data Object and we can directly add so it will give error
	   //becuase we can add two same type of data or object doesnt have any kind of data or its a parent of every class 
	   
	   //lets see
	   
	   int x=500;
	   
	   Object p=x;
	  //so thats why we can't be used directly 
	 //  System.out.println(p+100);//sos here it will show a error so how we can use 
	   
	//so here we can down cast or type cast 
	   
	   
	   int m=(int)p;
	   
	   System.out.println(m+100);
	   
	   
	   
   }
	
}
