package StringHandling;

public class StringArray 
{
		public static void main(String []args)
		{
			String[] var=new String[5];
			var[0]="my";
			var[1]="name";
			var[2]="is";
			var[3]="ankit";
			var[4]="yadav";
			
			//System.out.println(var.length);
			int length = var.length;
			for(int i = 0;i<var.length;i++) {
				System.out.println( var[i]);
			}
			System.out.println("=========");
			for(int i=length-1;i>=0;i--) {
				System.out.println(var[i]);
			
			}
		
			
		}
}
