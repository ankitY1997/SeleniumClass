import java.util.*;

public class CountDigit {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int x=sc.nextInt();
		//count(x,0);
		count(x,0);
		//System.out.println(y);
	}
		public static int count(int n,int count)
		{
			
			
			//count++;
			
			if(n!=0)
			{
				count++;
			count((n=n/10),count);
		
			
			}
			else if(n==0)
			{
				System.out.println("number of digit is :"+count);
			}
			return count;
		}
		
		

	

}
