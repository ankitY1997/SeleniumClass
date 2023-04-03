package constructor26sep;

public class Employ 
{
		static String comp_name="tcs";
		 String emp_name="ankit";
		 int age=24;
		 double salary=24000;
		 
		 public Employ(String emp_name,int age,double salary)
		 {
			this. emp_name=emp_name;
			this. age=age;
			 this.salary=salary;
			 System.out.println(emp_name);//mohan
			 System.out.println(age); //24
			 System.out.println(salary);//5000
		 }
		 public void display()
		 {
			 System.out.println("this is the "+emp_name); 
			 System.out.println("this is the "+age);
			 System.out.println("this is the "+salary);
			 Employ.ankit();/*its perfectly fine because this displaymethod present in heap area
			so if you want to runt this method so we have to use class name */
			 System.out.println(Employ.comp_name);
			 
			 
			 
		 }
		 public static void ankit()
		 {
			 System.out.println(comp_name);
			 
		 }
		 public static void main(String []args)
		 {
			 Employ e=new Employ("rakesh",24,30000);
			 comp_name ="wipro";/*why we  are able to initialize this variable with out using reference name because this variable is static so its already present in class 
			 area no need to be use class name ok if our main method is another program so you have to be use in class name as reference or if same local variable present in main
			 method so that compiler hide a  global variable so at that time if you want to initialize or print global variable so we can use class name as reference     */
			 e.display();
			 
		 }
}
