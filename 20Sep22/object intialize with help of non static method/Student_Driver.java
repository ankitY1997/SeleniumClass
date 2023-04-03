import java.util.Scanner;
class Student_Driver
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);

        Student s=new Student(); //here we are creating an aobject to student which is persent out side of the programme
        System.out.println("enter the name");
        String n=sc.nextLine();
        System.out.println("enter the age");
        int a=sc.nextInt();
        System.out.println("enter the id");
        int r=sc.nextInt();
        System.out.println();
        System.out.println();
        System.out.println();
         System.out.println("Student details");
        s.setValue(n,a,r); //here we intialize the non static variable through a method call method
        s.displayValue();

        Student v=new Student();
        v.setValue("shree",29,102);//here we intialise
        v.displayValue();

        Student d=new Student();
        d.setValue("anshu",1,104);// here we are intialising an object throw method
        d.displayValue();


    }
}