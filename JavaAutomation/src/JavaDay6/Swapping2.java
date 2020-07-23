package JavaDay6;

//swapping two number without using third variable


public class Swapping2 {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("Value of num1 before swapping: " + num1);
		System.out.println("Value of num2 before swapping: " + num2);
		
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		
		System.out.println();
		System.out.println("Value of num1 after swapping: " + num1);
		System.out.println("Value of num1 after swapping: " + num2);
		
		
	}

}
