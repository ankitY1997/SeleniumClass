package MultiThreading;

public class MyThread2 implements Runnable{

	//creating a thread BY IMPLEMENTING RUNNABLE INTERFACE
	
	@Override
	public void run() {
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("child thread");
		}
		
	}

}
