package Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	
	
	
	public void createDirectory()
	{
	
		String first="D:/ankit";
		
		
		File cd=new File(first);
		
		if(!cd.exists())
		{
			cd.mkdir();
			System.out.println("directory is  created");
		}
		else
		{
			System.out.println("directory is not created");
		}
		
	}
	
	public void multiDirectory()
	{
	
		String mul="D:/shristi/program";
		
		File cd =new File(mul);
		
		if(!cd.exists())
		{
			cd.mkdirs();
			System.out.println("multiple directory is created ");
		}
		else
		{
			System.out.println("multiple directory is  not created ");
			
			
		}
		

		
		
	}
	
	public void createFile() throws Exception
	{
		
		File cd=new File("D://shristi//program//file.text");
		
		if(!cd.exists())
		{
			cd.createNewFile();

		}
		
		
	}
	
	public void writeFile() throws Exception
	{
		
		
		
		FileWriter wrt=new FileWriter("D://shristi//program//file.text");
			
			wrt.write("good morning ");
			
			wrt.close();
			
			
		
		
	}
	
	
	public void readFile() throws Exception
	{
		FileReader rd=new FileReader("D://shristi//program//file.text");
		
		int read;
		
		while((read=rd.read())==-1)
		{
		
			char txt=(char)read;
			System.out.println(txt);
			
			
		}
		
		rd.close();
		
	}
	
	public void renameFile() throws Exception
	{
	
		File old=new File("D://shristi//program//file.text");
		
		File rename=new File("D://shristi//program//xyz.text");
		
		if(old.exists())
		{
			old.renameTo(rename);
		}
		
		
		
	}
	
	public void fileOutputStream() throws Exception
	{
		
		String a="my name is ankit";
		
		 FileOutputStream fos=new FileOutputStream("D://shristi//program//xyz.text");    
		
		
		
		for(int i=0;i<a.length();i++)
		{
		
			char z=a.charAt(i);
			
			
			fos.write(z);
			
			
		}
		
	
	}
	
	
	
	

	public void delete() throws Exception
	{
		File rename=new File("D://shristi//program//xyz.text");
		
		rename.delete();
		

		
	}
	
	
	public static void main(String []args) throws Exception
	{
		FileHandling ft=new FileHandling();
		ft.createDirectory();
		ft.multiDirectory();
		ft.createFile();
		ft.writeFile();
		ft.readFile();
		ft.readFile();
		ft.delete();
	}
	
}