package Collection;
import java.util.*;
public class ArrayList1 
{
	//array list is class and its inherit list inetface
	//array list is used to store heterogeneous type of data and it always increase and decrease
	//Array List is class which is available on utill package 
	//Array list follow assertion concept
	//array list have method and constructor
	//see how to add a value in array list
	//default constructor have  10 block
	//array list follow index concept
	//so here we store the value 
	//and we have one method
	
	public static void main(String []args) 
	{
		ArrayList mn=new ArrayList();
		//if you want to to give a value
		mn.add("ankit");
		mn.add(10);//this method is used to adding a value 
		mn.add(14);
		mn.add(15);
		mn.add(20);
		mn.add(60);
		mn.add("deepak");
		mn.add("grish");
		//System.out.println(mn);
		ArrayList nm=new ArrayList();
		//nm.indexOf(10);
		//mn.remove(3);//this method is hused to removing a value 
		//System.out.println(mn);
		
		//mn.indexOf(10);//this method is used to finding index vaue 
		
		//nm.remove(5);
		
		try
		{
		for(int i=0; ;i++)
		{
			Object c=mn.get(i);
			int d=mn.indexOf(c);
			if(d==-1)
			{
				break ;
			}
			
			System.out.println(mn.get(i));
		
			
		}
		}
		catch(Exception e)
		{
		//	
		}
		finally
		{
			mn.removeAll(mn);//this is removing method 
			System.out.println(mn);
		}
			
		
		
	}
	
	}