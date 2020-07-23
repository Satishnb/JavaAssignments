package JavaDay8;

// txt file write with new line

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class FileWrite1 {
	
	public static void main(String[] args) throws IOException {
		// it will create new file at desktop with name write.txt
				File f = new File("/Users/Satish/Desktop/write.txt");
				FileWriter fw = new FileWriter(f);
				BufferedWriter bf = new BufferedWriter(fw);
				bf.write("My name is satish");
				bf.newLine();  // for new line
				bf.write("and I am working with nearbuy.com");
				bf.close();
		
	}

}
