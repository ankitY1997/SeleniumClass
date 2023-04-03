import java.util.Scanner;
class Laptop
{
        char name;
        String colour;
        Laptop  id;
        public static void main(String []args)
        {
            Scanner sc =new Scanner(System.in);
            Laptop c=new Laptop();
            System.out.println("enter the string or character");
            c.name= sc.next().charAt(0);  //here we can intialize  non static variable throw  A user input
            c.colour="black";
            System.out.println(c.name);
            System.out.println(c.colour); 
            System.out.println(c);
        }
}