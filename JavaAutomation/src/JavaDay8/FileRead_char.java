package JavaDay8;

// file read char by char

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead_char {
	
	public static void main(String[] args) throws IOException {
		File f = new File("..//JavaAutomation//src//JavaDay8//fileforread.txt");
		FileReader fr = new FileReader(f);
		
		// read method return int value thats why we store return value in int
		// check condition if int fr.read() is not -1
		// if -1 then stop and out of loop
		int data;
		while((data=fr.read())!=-1)
		{
			System.out.println((char)data);
		}
	}

}
