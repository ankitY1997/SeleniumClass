package MultiThreading;

public class MyThread2Driver {
	
	public static void main(String[] args) {
		
		MyThread2 th=new MyThread2();
		
		Thread t=new Thread(th);
		
	
		//t.start();
		//now we can directly call run method 
		
		t.run();
		
		//now its run by main thread normal execution will happen it doesn't rin parallel
		for(int i=0;i<=10;i++)
		{
			System.out.println("main thread ");
		}
		
		
		
	
		
	
		
	}

}
