package FileHandling;

import java.io.File;

public class CreateFile {

	
	//if you want to create a new file so we can use output stream
	//first you need to import java io package .
	//so let's see how we can do it 
	
	public static void main(String [] args) {
		File file = new File(".\\ankit.txt");

		//if you want to create a new file so we have to use createNewFile() method
		try {
			file.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(file.canRead());

		file.setWritable(true);// in this method we can restrict the writable option
	}
	
	
}
