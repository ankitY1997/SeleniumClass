package FileHandling;

import java.io.FileWriter;

public class WriteFile {
	
	
	//if you want to write a file so we can use File Writer class which is provided by 
	//file io package 
	
	//if you writ e the file so you should be close the file otherwise you will not able to see 
	//the result
	//so lets see how we can do this 
	
	// \n this is for changing a line
	public static void main(String[] args) {
		try {
		FileWriter fr=new FileWriter(".\\ankit.txt");
		
		fr.write("hello today is new year \n	so how will you enjoy this moment an whats goona do in this year  ");
		fr.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
	

}
