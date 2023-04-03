package StringHandling;

public class Program1 {

	public static void main(String[] args) {
		
	String first="aba";
		String check=first;
		
		int j=first.length();
		
	String m = "";
		for(int i=first.length()-1;i>=0;i--)
		{
			char z=first.charAt(i);
			
			m=m+z;
			
		}
		if(first.equals(m))
		{
		System.out.println("this is palindrome");
		}
		else
		{
			System.out.println("this is not palindrome");
		}
		System.out.println(m);
	}

}
