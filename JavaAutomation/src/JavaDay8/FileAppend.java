package JavaDay8;

// txt file append

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileAppend {
	
	public static void main(String[] args) throws IOException {
		// it will create new file at desktop with name write.txt
				File f = new File("/Users/Satish/Desktop/write.txt");
				
				// true means append. previously data will be there
				FileWriter fw = new FileWriter(f,true);
				BufferedWriter bf = new BufferedWriter(fw);
				// first add a new line then write
				bf.newLine();
				bf.write("I am from fatehabad");
				bf.newLine();
				bf.write("State Haryana");
				bf.close();
		
	}

}
