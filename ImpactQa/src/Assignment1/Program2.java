package Assignment1;

public class Program2 {

	public static void main(String[] args) {


	
		String name = "abc123abcd1234ab12";
		int size=name.length();
		
		String m="";
		String [] arr=new String[5];
		arr[0]="";
		arr[1]="";
		arr[2]="";
		arr[3]="";
	int count=0;
		for(int i=0;i<size;i++)
		{
			char c=name.charAt(i);
			
			if(c==49)
			{
				count++;
			}
			
			if((c>=48&&c<=57)&&(count==1))
			{
				String l=Character.toString(c);
				
				arr[count]=arr[count]+l;
			}
			else if((c>=48&&c<=57)&&(count==2))
			{
                  String o=Character.toString(c);
				
				arr[count]=arr[count]+o;
			}
			else if(((c>=48&&c<=57)&&(count==3)))
			{
				  String h=Character.toString(c);
					
					arr[count]=arr[count]+h;
			}
			else if(!(c>=48&&c<=57))
			{
				String l=Character.toString(c);
				arr[0]=arr[0]+l;
				
				
			}
			
			
			
			
			
		}
		
	
	
		
		
		int  twoarr=((arr[1].length())>(arr[2].length())?arr[1].length():arr[2].length());
		String  bigarr=Integer.toString(twoarr>arr[3].length()?twoarr:arr[3].length());
         System.out.println(bigarr);
   
   
   
           int j=0;
           String bignum="";
                int count1=0;
    while(j<arr[2].length())
    {
	   count1++;
	   char u=arr[2].charAt(j);
	   
	   String g=Character.toString(u);
	   bignum=bignum+g;
	  j++; 
      }
//System.out.println("the count is :=>"+count1);
System.out.println("the bignum is :=>"+bignum);

	}

}
