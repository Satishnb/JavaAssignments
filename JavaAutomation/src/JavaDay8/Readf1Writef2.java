package JavaDay8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Readf1Writef2 {
	
	
	public static void main(String[] args) throws IOException {
		File f = new File("..//JavaAutomation//src//JavaDay8//fileforread.txt");
		File f2 = new File("/Users/Satish/Desktop/writef2fromf1.txt");
		FileReader fr = new FileReader(f);
		FileWriter fw = new FileWriter(f2);
		int data;
		while((data=fr.read())!=-1)
		{
			fw.write(data);
		}
		fw.close();
	}
	   

}
