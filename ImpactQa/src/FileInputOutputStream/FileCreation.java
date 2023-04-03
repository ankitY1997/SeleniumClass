package FileInputOutputStream;
import java.io.*;
public class FileCreation 
{
//lets se how we can create a file
	public static void main(String []args) throws IOException
	{
	File fl=new File("D:\\Gaurav\\cde.txt\\ankit.txt\\ncy.txt");
	boolean f2=fl.createNewFile();
	
	if(f2==true)
	{
		System.out.println("file is created ");
	}
	else
	{
		System.out.println("file is not created ");
	}
	}

}
