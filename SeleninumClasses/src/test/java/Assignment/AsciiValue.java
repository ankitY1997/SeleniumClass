package Assignment;
import java.util.*;
public class AsciiValue {
	
	
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	int i=0;
	while(i<=100)
	{
		System.out.println("please enter the character");
		char c=sc.nextLine().charAt(0);
		
		int num=(int)c;
		
		System.out.println(num);
	}
	
	}

}
