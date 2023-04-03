package MultiThreading;

public class PriorityDriver {
	
	
	
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName());//main thread 
		System.out.println(Thread.currentThread().getPriority());//5
		/* so  the priority of main thread is 5 on the basis threading concept  
		child thread always inherit the parent thread priority 
		so it means child thread priority depends on main thread priority 
		but we can also change the thread priority  by setPriority() method */
		
	    Thread.currentThread().setPriority(8);
	    /*but in this line we can change the main  thread priority so at that time */
	    
		Priority p=new Priority();
		//lets see how it will change our thread priority or not 
		// if i am commenting line no 16 so then again child thread change his priority 
		System.out.println(p.currentThread().getPriority());//8
		p.setPriority(10);
		p.start();
	
		for(int i=0;i<=10;i++)
		{
		System.out.println("main thread -1");	
		}
		
		
		
	}

}
