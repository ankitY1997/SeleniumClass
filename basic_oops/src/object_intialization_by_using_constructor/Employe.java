package object_intialization_by_using_constructor;

 class Employe 
 {
	 /* here we are making constructor body because we are intializing an object
			with help of constructor*/
		 static String t="ULTRATECH CEMENT";
			String name;
			String post;
			String dept;
			String date_of_birth;
			String blood_Group;
			int id;
			int age;
			int salary;
			
			Employe(String n,String p,String d,String b,String g,int i,int a,int s)
			{
				name=n;
				post=p;
				dept=d;
				date_of_birth=b;
				blood_Group=g;
				id=i;
				age=a;
				salary=s;
				
				
			}
			public void showValue()
			{
				System.out.println("employe name is: "+name);
				System.out.println("employe post is: "+post);
				System.out.println("employe dept is: "+dept);
				System.out.println("employe date of birth is: "+date_of_birth);
				System.out.println("employe blood group is: "+blood_Group);
				System.out.println("employe id is: "+id);
				System.out.println("employe age is: "+age);
				System.out.println("employe salary is: "+salary);
				System.out.println("***************************************** ");
				
			}
			

}
