package JavaDay4;

public class Inheritance2 extends Inheritance1 {
	
        public Inheritance2() {
        	this(5);
		System.out.println("Child Class Default Constructor");
	}
	
    public Inheritance2(int a) {
		super(6,7);
		System.out.println("Child Class One parametrized Constructor");
	}
    public Inheritance2(int a,int b) {
		this(2,3,5);
		System.out.println("Child Class Two parametrized Constructor");
	}
    public Inheritance2(int a,int b,int c) {
		this();
		System.out.println("Child Class Three parametrized Constructor");
	}
    
    public static void main(String[] args) {
    	
    	Inheritance2 In = new Inheritance2 (5,7);
	}

}
