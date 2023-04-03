import java.util.*;
public class Multification 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the multificatin value");
		int x=sc.nextInt();
		mul(0,1,1,x);

	}
	public static void mul(int count,int numb,int y,int value)
	{
		if(count==10)
		{
			count=0;
			y=1;
			numb++;
			System.out.println("**********************");
		}
		//System.out.println(numb+"*"+y+" = "+numb*y);
		if(numb<=value)
		{
			System.out.println(numb+"*"+y+" = "+numb*y);
		mul(count+1,numb,y+1,value);
		}
	
	}
}
