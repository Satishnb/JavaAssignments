package JavaDay5;

public class InterfaceChildClass implements ParentInterface{
	
	public void abstractMethod1()
	{
		System.out.println("body given to abstarctmethod1");
	}
	
	public void abstractMethod2()
	{
		System.out.println("body given to abstarctmethod2");
	}
	
	public static void main(String[] args) {
		InterfaceChildClass inter1 = new InterfaceChildClass();
        inter1.abstractMethod1();
        inter1.abstractMethod2();

	}
	
}
