package JavaDay3;

public class thisConstructor {
	
	public thisConstructor()
	{   this(5,6,7);
		System.out.println("I am default paramitrized constructor");
	}
	public thisConstructor(int a)
	{   this();
		System.out.println("I am one paramitrized constructor");
	}
	public thisConstructor(int a, int b)
	{
		System.out.println("I am two paramitrized constructor");
	}
	public thisConstructor(int a, int b,int c)
	{   this(7,8);
		System.out.println("I am three paramitrized constructor");
	}
	
	public static void main(String[] args) {
		thisConstructor c1 = new thisConstructor(5);
	}
	
	
	

}
