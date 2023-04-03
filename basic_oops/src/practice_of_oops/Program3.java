package practice_of_oops;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program3 {
	
	public static void main(String[] args) {
		
		/*File file=new File("E:\\html");
		try
		{
		Scanner sc=new Scanner(file);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		
		}*/
		
		try {
			File file=new File("E:\\ankit1.txt");
			FileWriter fws=new FileWriter(file);
			
			fws.write("hello how are you");
			fws.close();
			file.setWritable(true);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
