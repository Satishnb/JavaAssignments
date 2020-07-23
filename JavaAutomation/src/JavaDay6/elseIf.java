package JavaDay6;

import java.util.Scanner;

public class elseIf {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("To see the result enter marks first");
		for(int f=1; f<=5;f++) {
		int marks = s.nextInt();
		if((marks>0)&&(marks<35))
		{
		 System.out.println("fail");
		}
		else if((marks>35)&&(marks<60))
		{
			System.out.println("Second division");
		}
		else if((marks>60)&&(marks<80))
		{
			System.out.println("First division");
		}
		else if((marks>80)&&(marks<100))
		{
			System.out.println("Merit");
		}
		
		else
		{
			System.out.println("Enter correct marks first");
		}
		}
		
	}

}
