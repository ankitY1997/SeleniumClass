package methodOverLoading;
import java.util.*;
public class Shoes_Driver 
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the shoes brand name :"+"Gold star");
	String n=sc.nextLine();
	System.out.println("enter the colour name");
	String c=sc.nextLine();
	System.out.println("enter the variety -"+"1.school shoes"+" "+"2.sports shoes");
	String v=sc.nextLine();
	System.out.println("enter the size :-"+"above 5 "+" "+"below 11");
	int size=sc.nextInt();
	System.out.println("enter the price :-"+"250 rupees to 650 rupees");
	int p=sc.nextInt();
	Shoes1.goldstarShoes(n,c,size,p,v);
	//System.out.println("shoes price "+Shoes.p);
}
}
