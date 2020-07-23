package JavaDay6;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		System.out.println("enter any number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println();
		boolean flag = false;
		
		int i=2;
		
		while(i<=num/2)
		{
			
			if(num%i==0)
			{
				flag=true;
				break;
				
			}
			i++;
		}
			if(flag == false)
			{
				System.out.println(num + " is prime number");
			}
			else
			{
				System.out.println(num + " is  non prime");
			}
			
		}
		
	}


