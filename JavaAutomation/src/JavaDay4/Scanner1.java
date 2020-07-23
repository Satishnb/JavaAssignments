package JavaDay4;

import java.util.Scanner;

public class Scanner1 {
	int a;
	float f;
	
	public int display1(int a)
	{
		this.a=a;
		return a;
		
		
	}
	public float display2(float f)
	{
		this.f= f;
		return f;
	}
	
	
	public static void main(String[] args) {
		
		Scanner1 sc1 = new Scanner1();
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("enter value of a");
		int i = sc1.display1(sc.nextInt());
		System.out.println("enter value of f");
		float f1= sc1.display2(sc.nextFloat());
		
		System.out.println("Value of a is "+ i);
		System.out.println("Value of f is "+ f1);
		
	}
	

}
