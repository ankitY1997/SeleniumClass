package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	
public static	File filepath;
	
	//if you want to read a file we can use Scanner class
	// so lets how we can do it .
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		try {
			filepath=new File(".\\ankit.txt");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner sc=new Scanner(filepath);
		
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
	hiddenFile();
		sc.close();

		
		//and if you want to know the list sowe can use list method 
		
	}
 
	public static void hiddenFile()
	{
	
		File file=new File("D:\\");
		String [] list=file.list();
		
		for(String hiddenfile:list)
		{
		System.out.println(hiddenfile);
		}
	}
	
}
