package MultiThreading;

public class MyThreadDriver {
	
	
	public static void main(String[] args) {
		
		MyThread t=new MyThread();
		t.start();
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("main thread");
		}
		
	//we can't predict the order of multi threading so thats why we can use this concept when 
	// features are independent they doesnt depend to each other
	}

}
