package StringArg;

public class Program2 {

	public static void main(String[] args) {
		
		
		int num=Integer.parseInt(args[0]);
		int i=1;
		int count=0;
		while(i<=num/2)
		{
			if(num%i==0)
			{
			count++;	
			}
			i++;
		}
		if(count==1)
		{
			System.out.println("this is the prime number");
		}
		else
		{
			System.out.println("this is not a prime number");
		}
	}

}
