package JavaDay8;

// txt file read particular line and input from user
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class readParticularLine {
	
	public String readLine(int num) throws IOException {
		
		File f = new File("../JavaAutomation/src/JavaDay8/fileforread.txt");
		FileReader fr = new FileReader(f);
		BufferedReader bf = new BufferedReader(fr);
		String data;
		int line=0;
		while((data=bf.readLine())!=null)
		{
			line++;
			if(line==num) {
				break;
			}
		}
		return data;
		
	}
	
	public static void main(String[] args) throws IOException {
		readParticularLine rp =new readParticularLine();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		String output=rp.readLine(sc.nextInt());
		System.out.println(output);
		
	}

}
