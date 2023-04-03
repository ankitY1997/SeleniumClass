import java.util.Scanner;
public class EvenNumber {
//print all even number 1 to100 and sum 	
//sum of the even number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
	int sum=1;
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				sum+=i;
				
			}
			
		}
		System.out.println("the sum of even number is :"+sum);
		
	}

}
