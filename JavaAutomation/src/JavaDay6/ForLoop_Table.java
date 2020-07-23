package JavaDay6;

import java.util.Scanner;

public class ForLoop_Table {
	
	// table of any number
	
	public static void main(String[] args) {
	
	
	System.out.println("enter any number");
	Scanner sc = new Scanner(System.in);
	int num= sc.nextInt();
	System.out.println();
	for(int i=1; i<=10;i++)
	{
		//System.out.print(num*i + "\t");
		System.out.print(num*i + "\t");  // for tab
		System.out.println();   // for next line
	}
	
	}

}
