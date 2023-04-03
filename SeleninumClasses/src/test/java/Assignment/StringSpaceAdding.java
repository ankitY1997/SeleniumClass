package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSpaceAdding {

	
	public static void main(String[] args) {
		
		
		
		
		
		
		List<String> tempList=new ArrayList<String>();
		tempList.add(" USD 10000.00");
		tempList.add(" USD 5000.00");
		tempList.add(" USD 5000.00");
		tempList.add(" USD 4561.33");
		tempList.add(" USD 2306.47");
		tempList.add(" USD 2306.47");
		tempList.add(" AUD 1754.00");
		tempList.add(" USD 1700.0");
		tempList.add(" USD 1400.00");
		tempList.add(" USD 1000.00");
		
		/*Comparator<String>com=new SortinComp();
		Collections.sort(tempList,com);
		System.out.println(tempList);
		
		
		Collections.reverse(tempList);
		System.out.println(tempList);
			Collections.sort(tempList,String.CASE_INSENSITIVE_ORDER);
		System.out.println(tempList);
		
		Collections.reverse(tempList);
		System.out.println(tempList);*/
		
		boolean flag=false;
		List<String> tempList1=new ArrayList<String>();
		List<String> tempName=new ArrayList<String>();
	
		List<Double> tempList2= new ArrayList<Double>();
		
		
		Object[] c1=tempList.toArray();
		
		
	   
		
		for(int i=0;i<c1.length;i++)
		{
			String ss=c1[i].toString();
			  String  ss1=ss.trim();
			    flag=false;
			    String s4="";
			    String s3="";
			    for(int j=0;j<ss1.length();j++)
			    {
			    	
			    	int c=ss1.charAt(j);
			    	
			    	 if(j<=3)
				    	{
				    		
				    	s4=s4+(char)c;
				    	
				    	}
	                  
			    	
			    	if(flag==true)
					{
			    		
						s3=s3+(char)c;
					}
			    	else if(c==32)
					{
					 flag=true;	
					}
			    	
			    }
			    
			    tempList1.add(s3);
			    tempName.add(s4);
			    
		}
	
		
		//System.out.println("tempList1 =>"+tempList1);
		//System.out.println(tempName);
		
		
		for(int i=0;i<tempList1.size();i++)
		{
			String ss=tempList1.get(i);
			Double newInt=Double.parseDouble(ss);
			tempList2.add(newInt);
	
		}
		
	   Collections.sort(tempList2);
	        
	   System.out.println(tempList2);
	  
	   List<String> newString=new ArrayList<String>();
	   for(int i=0;i<tempList2.size();i++)
	   {
		  String ss=tempList2.get(i).toString();
		  
		     String s=" USD "+ss;
		    newString.add(s);
		   
	   }
	   
	   System.out.println(newString);
	
	   
	   
	}
	
	
	{    /* //changes done in that point no cases is persent 
	      Comparator<String> com=new SortinCompPage();
	    //problem no 2 (this class  SortinComp) 
	      Collections.sort(tempList,com);
	   
     System.out.println("Descending order =>"+tempList);// changes done*/
	/*List<String> tempList1=new ArrayList<String>();
	
	  while(tempList.size()!=1)
	  {
      Object [] c1=tempList.toArray();
      String c2=c1[1].toString();
      int j=0;
      for(int i=0;i<c1.length;i++)
      {
      	String s1=c1[i].toString();
      	
      	if(s1.length()>c2.length())
      	{
      	  c2=c1[i].toString();
      	  j=i;
      	  
      	}
      	
      	
      }
      tempList1.add(c2);
      System.out.println(tempList1);
      tempList.remove(j);
    
	  }
	  System.out.println("temp list size =>"+tempList.size());
      
		sortStatus = OriginalList.equals(tempList);
		
		*/
		
	}
	
  
	
	
}
