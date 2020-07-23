package JavaDay4;

public class ChildClass extends ParentClass {
	
	public void sub( int a, int b)
	{
		int c= a-b;
		System.out.println("sub of two number is: "+ c);
	}
	
	public static void main(String[] args) {
		
		ChildClass cc = new ChildClass();   //calling object of child class
		cc.sub(10, 5);
		cc.sum(5, 5);
		
		ParentClass pc = new ParentClass();  // calling object of parent class
		pc.sum(10, 10);
	}

}
