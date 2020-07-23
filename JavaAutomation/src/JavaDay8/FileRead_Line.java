package JavaDay8;

// txt file read line by line

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead_Line {
	
	public static void main(String[] args) throws IOException {
		File f = new File("..//JavaAutomation//src//JavaDay8//fileforread.txt");
		FileReader fr = new FileReader(f);
		BufferedReader bf = new  BufferedReader(fr);
		
		// readLine method will return line or null value
		// if return null means file reach at last
		String data;
		while((data=bf.readLine())!=null)
		{
			System.out.println(data);
		}
		
	}

}
