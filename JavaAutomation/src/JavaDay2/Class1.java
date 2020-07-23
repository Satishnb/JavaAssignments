package JavaDay2;

//((((10+2)-2)+2)*2)/2)

public class Class1 {
	
	public int sum(int a, int b)
	{
		int c;
		c= a+b;
		return c;
	}
	public int sub(int a, int b)
	{
		int c;
		c= a-b;
		return c;
	}
	public int mul(int a, int b)
	{
		int c;
	    c= a*b;
	    return c;	
	}
	public void div(int a, int b)
	{
		int c;
		c= a/b;
		System.out.println("final output is: " + c);
	}
	public static void main(String[] args) {
		Class1 obj = new Class1();
		
		int sum_output = obj.sum(10, 2);
		System.out.println("addition result is "+ sum_output);
		
		int sub_output = obj.sub(sum_output, 2);
		System.out.println("substration result is "+ sub_output);
		
		int sum_output1 = obj.sum(sub_output, 2);
		System.out.println("another addition result is "+ sum_output1);
		
		int mul_output = obj.mul(sum_output1, 2);
		System.out.println("multiplication result is "+ mul_output);
		
		obj.div(mul_output, 2);


	}

}
