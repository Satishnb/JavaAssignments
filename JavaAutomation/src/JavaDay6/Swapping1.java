package JavaDay6;

// swapping two number using third variable

public class Swapping1 {
	
	public static void main(String[] args) {
		
		int temp;
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("Value of num1 before swapping: " + num1);
		System.out.println("Value of num2 before swapping: " + num2);
		
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println();
		System.out.println("Value of num1 after swapping: " + num1);
		System.out.println("Value of num1 after swapping: " + num2);
		
		
		
	}

}
