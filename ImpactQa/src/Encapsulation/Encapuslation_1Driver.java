package Encapsulation;

public class Encapuslation_1Driver 
{
		public static void main(String []args)
		{
			
			Encapsulation_1 mc=new Encapsulation_1();
			
			mc.setName("tysen");
			System.out.println(mc.getName());
			System.out.println(mc.getColor());
			System.out.println(mc.getAge());
			
			//if you want only person access the data.he does not change the data then you have to comment set method  
			//then that after comment user only access the data but they didnt able to cange the data 
		// lets see
			
			System.out.println(mc.getDog());//here we dont give error because we are not hiding get method so thats why we can easily access
			//the data 
			
			
			//mc.setDog("124Ed");//but here we will get error because in another method we can comment set method okk
			
		// so that kind of problem you have to l	
			
		}
}
