package JavaDay6;

import java.util.Scanner;

public class If_else {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number");
		 for(int i=1; i<3;i++) {
			 
		 int a= sc.nextInt();
		 if(a%2==0)
		 {
			 System.out.println("Given number is even");
		 }
		 else
		 {
			 System.out.println("Given number is odd");
		 }
		 }
		 
	}

}
