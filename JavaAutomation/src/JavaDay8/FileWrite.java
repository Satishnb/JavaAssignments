package JavaDay8;

// txt file write without new line

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	
	public static void main(String[] args) throws IOException {
		// it will create new file at desktop with name write.txt
		File f = new File("/Users/Satish/Desktop/write.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("My name is satish and I am working with nearbuy.com");
		fw.close();
		
	}

}
