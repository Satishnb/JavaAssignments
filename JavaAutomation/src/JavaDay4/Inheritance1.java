package JavaDay4;

public class Inheritance1 {
	
	public Inheritance1() {
		this(3,4,5);
		System.out.println("Parent Class Default Constructor");
	}
	
    public Inheritance1(int a) {
		this();
		System.out.println("Parent Class One parametrized Constructor");
	}
    public Inheritance1(int a,int b) {
		this(10);
		System.out.println("Parent Class Two parametrized Constructor");
	}
    public Inheritance1(int a,int b,int c) {
		System.out.println("Parent Class Three parametrized Constructor");
	}
}
