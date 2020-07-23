package JavaDay6;
import java.util.Scanner;
public class Palindrome {
	public int[] Reverse(int a, int l) {                 //reverse the number  
		int num = a;
		int length = l;
		int rem;
		int array[];
		array = new int[length];

		for (int i = 1; i <= length; i++) {              // store into an array
			rem = num % 10;                              // will give the last digit
			array[i - 1] = rem;
			num = num / 10;                              
		}
		for (int f = 0; f <= array.length - 1; f++) {    // print element of an aaray
			System.out.println(array[f]);
		}
		return array;                                    // return an array to main method
	}

	private boolean checkIfPalindrome(int[] array) {     // check palindrome
		boolean isPalindrome = true;
		for (int i = 0, j = array.length - 1; i <= j; i++, j--) {
			if (array[i] != array[j]) {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		int l = Integer.toString(a).length();
		Palindrome p = new Palindrome();
		
		int[] reversedArray = p.Reverse(a, l);
		boolean isPalindrome = p.checkIfPalindrome(reversedArray);
		if (isPalindrome) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}
