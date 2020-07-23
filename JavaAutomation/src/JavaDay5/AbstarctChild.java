package JavaDay5;

import java.util.Scanner;

public class AbstarctChild extends AbstarctParent {
	
	public void withoutbody(){
		
		int a= 17;
		int b= 8;
		int c = a-b;
		System.out.println("Output of abstarct method is: "+ c);
	}
	
	public static void main(String[] args) {
		AbstarctChild child = new AbstarctChild();
		child.withbody();
		child.withoutbody();
		
	}

}
