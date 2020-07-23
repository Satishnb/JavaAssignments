package JavaDay6;

import java.util.Scanner;

public class doWhile_Table {
	
	public static void main(String[] args) {
		
		System.out.println("enter any number");
		Scanner s6 = new Scanner(System.in);
		int num = s6.nextInt();
		System.out.println();
		
		int i=1;
		
		do
		{
			System.out.println(num*i);
			i++;
		} while(i<=10);
		
	}

}
