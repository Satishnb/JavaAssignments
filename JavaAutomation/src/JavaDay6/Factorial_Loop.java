package JavaDay6;

import java.util.Scanner;

public class Factorial_Loop {
	
	public void factorial(int a)
	{
		int num =a;
		long fact=1;
		for(int i=num;i>=1;i--)
		{
		fact= fact*i;
		}
		System.out.println("factorail of entered number " + num + " is " + fact);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Factorial_Loop fac = new Factorial_Loop();
		System.out.println("enter a number to find the factorial value");
		fac.factorial(sc.nextInt());
	}

}
