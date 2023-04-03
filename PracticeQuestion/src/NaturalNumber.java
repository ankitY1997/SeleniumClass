import java.util.Scanner;
public class NaturalNumber {
// print the natural number
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int numb=sc.nextInt();
		int i=1;
		int sum=0;
		
		while(i<=numb)
		{
			sum+=i;//sum=sum+i;
			i++;
		}
		System.out.println("the sum of the natural number is : "+sum);
	
		
	}

}
