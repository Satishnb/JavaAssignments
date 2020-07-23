package JavaDay6;

import java.util.Scanner;

public class nestedIfElse {
	
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter any number");
	    for( int i=1; i<=3;i++) {
		int num = sn.nextInt();
		if(num>5)
		{           // if body
			if(num%2==0)
			{
				System.out.println("Entered number is even");
			}
			else
			{
				System.out.println("Entered number is odd");
			}
		}  
		      
		        else
			{
				System.out.println("enter correct number");
			}
	    }
		
	}
	
			
}		
	


