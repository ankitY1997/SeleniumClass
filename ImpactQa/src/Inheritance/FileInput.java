package Inheritance;
import java.io.*;

public class FileInput {

	//1.basically FileInputStream is child class  of input Stream and input stream is child of object
	//inside the object we have two stream on is input Stream and second one is output Stream
	//further input stream categorized into 9 parts we can also says subclasses of input stream 1.FIleInputStream 2.DataInputStream 3.ObjectInputStream
	//it used to read a data inside the input stream we have read() method and closed() method also
	//and all this method available in java io package and the syntax is :-import java.io.*;
	//so lets see how we can read the data from the file ;
	//and it will return a data in byte type dont stored or declare in string 
	// and it will always throw the chcked exception so pls handle it in two way one way is try catch another  way is closed
	public static void main(String []args) throws FileNotFoundException,IOException
	{
		
		FileInputStream fis=new FileInputStream("D:\\Gaurav\\cde.txt\\ankit.txt\\ankity.txt");//iam
		int data;
		/*int data1=fis.read();
		int data2=fis.read();
		int data3=fis.read();
		int data4=fis.read();*///this the only way to read the data here we will give output is -1 becuase there is no fourth character in side the program

		//char data=(char)fis.read();//why we are give type cast operator becuse this read method return type is byte so thats why it will give value as int type but inside this file
	//we store in char vlaue so how can we read
		//System.out.println(data4);
		//if you ant to read all data so youu can use while loop
		while((data=fis.read())!=-1)
	
		{
		System.out.println((char)(data));
			
		}
		
		
		
	}
}
