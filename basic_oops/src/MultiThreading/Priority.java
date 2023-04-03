package MultiThreading;

public class Priority extends Thread{
	
	
     /* thread scheduler valid priority is 1 to 10
      1 means is least priority 10 means is highest priority

	that means if you set  a high priority  then it means first high priority thread will be executed and then after less
	priority will be executed 
	main thread has a default priority 5 and   child thread is always follow the parent thread priority so therefore all child 
	has default priority 5 */
	
    @Override 
	public void run()
	{
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("child thread ");
		}
		
	}
	
	
	

}
