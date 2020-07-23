package JavaDay8;

// read for particular range

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadParticularRange {
	
	public void readLine(int firstLine, int lastLine) throws IOException
	{
		File f = new File("../JavaAutomation/src/JavaDay8/fileforread.txt");
		FileReader fr = new FileReader(f);
		BufferedReader bf = new BufferedReader(fr);
		int line=0;
		String data;
		for(int i= firstLine; i<=lastLine; i++){
			while((data=bf.readLine())!=null){
				line++;
				if(line>=firstLine && line <=lastLine) {
					System.out.println(data);
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		ReadParticularRange rl = new ReadParticularRange();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first line");
		int f= sc.nextInt();
		System.out.println("enter last line");
		int l= sc.nextInt();
		if(f<l) {
			rl.readLine(f, l);
		}else {
			System.out.println("from should be less then to");
		}
	}

}
