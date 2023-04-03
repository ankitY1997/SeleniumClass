package StringArg;

public class Program1 {

	public static void main(String[] args) {
		
		
	
		
		System.out.println(args[0]+100);//so here it concatenate beacuse we can pass the vlaue
		//int but it will automatically covert in string  convert in 
		System.out.println(args[1]+200);
		
		
		//now we have to conver the value 
		
		int z=Integer.parseInt(args[0]);//
		int m=Integer.parseInt(args[1]);
		
		System.out.println(z+100);//120
		
		System.out.println(m+200);//230
	}
	
	//now we can see the next program

}