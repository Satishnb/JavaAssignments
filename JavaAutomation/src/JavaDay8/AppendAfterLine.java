package JavaDay8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendAfterLine {
	
	public void appendAfterLine() throws IOException {
		File f2 = new File("/Users/Satish/Desktop/write.txt");
		FileWriter fw = new FileWriter(f2,true);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.newLine();
		bw.write("Be happy always");
		
		
	}
	
	public static void main(String[] args) throws IOException {
		AppendAfterLine al = new AppendAfterLine();
		al.appendAfterLine();
		
	}

}
