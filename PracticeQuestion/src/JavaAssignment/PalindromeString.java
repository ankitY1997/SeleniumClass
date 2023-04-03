package JavaAssignment;

public class PalindromeString {

	public static void main(String[] args) 
	{
		
		String a="aba";
		
		String x="";
		
		for(int i=a.length()-1;i>=0;i--) 
		   {
			
			char rev=a.charAt(i);
			
			x=x+rev;
			
		  }
		
		if(a.equals(x))
		  {
			System.out.println("this is palindrome string");
		   }
		else
		   {
			System.out.println("this is  not palindrome string");
		     }
		

	}

}
