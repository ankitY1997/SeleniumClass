package object_intialization_by_using_constructor;

public class Student_driver 
{
	 public static void main(String []ankit)
	 {
		 Student s=new Student("ankit","12th","24jan1997",21,12345789L);
		 s.showValue();
		 Student v=new Student("rajiv","12th","24jan1996",22,8978944588l);
		 v.showValue();
		 Student p=new Student("jitesh","b.tech","4july1997",24,9931502767l);
		 p.showValue();
		 
}
}