package JavaDay8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteParticularRange {
	
	
		
		public void writeLine() throws IOException {
			File f = new File("/Users/Satish/Desktop/writenew.txt");
			FileWriter fw = new FileWriter(f);
			BufferedWriter bf = new BufferedWriter(fw);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter any string value");
			Scanner sc1 = new Scanner(System.in);
			int val = sc1.nextInt();
			for(int i =1;i<=val;i++) {
			String s1=sc.nextLine();
			if(i>=3 && i<=5) {    // write from line 3 to line 5
				bf.write(s1);		
			}
			
			bf.newLine();  
			}
			bf.close();	// file close is mandatory
		}
		
		public static void main(String[] args) throws IOException {
			
			WriteParticularRange wl = new WriteParticularRange();
			wl.writeLine();
		}

}
