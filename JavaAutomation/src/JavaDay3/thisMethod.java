package JavaDay3;

public class thisMethod {
	
	public void method0()
	{   
		this.method3(1,2,3);
		System.out.println("Default paramiterized method");
	}
	
	public void method1(int a)
	{   this.method0();
		System.out.println("One paramiterized method");
	}
	public void method2(int a,int b)
	{
		System.out.println("Two paramiterized method");
	}
	public void method3(int a,int b, int c)
	{   this.method2(1,2);
		System.out.println("Three paramiterized method");
	}
	
	public static void main(String[] args) {
		thisMethod obj1 = new thisMethod();
		
		obj1.method1(5);
	}
	
	

}
