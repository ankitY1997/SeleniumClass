package MultiThreading;

public class MyThread extends Thread{
	
	//CREATING A THREAD BY EXTENDING THREAD CLASS
	
	@Override
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("child thread ");
		}
	}

}