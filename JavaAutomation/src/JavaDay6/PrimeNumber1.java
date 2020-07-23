package JavaDay6;

import java.util.Scanner;

public class PrimeNumber1 {
	
	public static void main(String[] args) {
		
		System.out.println(" Enter any number");
		Scanner sc = new Scanner(System.in);
		
			int num = sc.nextInt();
			System.out.println();
			
			int i=2;
			if(num<2) {
				System.out.println(num + " is non prime");
				return;  // control return, if no return while loop will also execute
			}
			
			while(i<=num/2)
			{
				if(num%i==0)
				{
					System.out.println(num + " is non prime");
					return;
				}
					i++;
					
			}
			
			System.out.println(num+ " is prime number");
			}
		}
		
		



