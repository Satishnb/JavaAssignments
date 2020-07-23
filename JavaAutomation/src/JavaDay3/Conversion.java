package JavaDay3;

public class Conversion {
	
	int a =5;
	int b;
	float f;
	float f1 = 17.5f;
	
	
	
	public void implicit()
	{
		f=a;
		System.out.println("Value of f is: "+ f);
	}
	
	public void explicit()
	{
		b= (int)f1;      //explicit conversion
		System.out.println("Value of b is: "+ b);
	}
	
	public static void main(String[] args) {
		
		Conversion c1 = new Conversion();
		c1.implicit();
		c1.explicit();
	}

}
