import java.util.Scanner;
class Student
{ // here we are making an blueprint in this class and object we are creating in Student driver
    String name;
    int age;
    int id;
    public void setValue(String n,int a, int r)
    {
        name=n;
        age=a;
        id=r;
    }
    public void displayValue()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(id);
        System.out.println("==============================");
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        String n=sc.nextLine();
        System.out.println("enter the age");
        int a=sc.nextInt();
        System.out.println("enter the id");
        int r=sc.nextInt();

    }

}