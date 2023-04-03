package practice.lambookPractice;

import java.net.StandardSocketOptions;
import java.utill.*;
public class Driver {


    public static void main(String []args)
    {
        Lambook lm=new Lambook();
      System.out.println(lm.getUsername());


      Scanner sc=new Scanner(System.in);
      String user=sc.nextLine();


      System.out.println(user);
    }
}
