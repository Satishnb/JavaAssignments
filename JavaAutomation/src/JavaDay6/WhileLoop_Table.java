package JavaDay6;

import java.util.Scanner;

//Table of any number

public class WhileLoop_Table {
	
	public static void main(String[] args) {
		
		System.out.println("enter any number");
		Scanner sc5 = new Scanner(System.in);
		int num= sc5.nextInt();
		System.out.println();
		int i=1;
		while(i<=10) {
			System.out.println(num*i);
			
			i++;   // or i=i+1
		}
		
	}
}
