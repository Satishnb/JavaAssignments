package JavaDay2;

//((((10-2)+2)-2)*2)/2)

public class Class3 {
	
	public int sub (int a, int b)
	{
		int c;
		c=a-b;
		return c;
	}
	public int add (int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int mul (int a, int b)
	{
		int c;
		c=a*b;
		return c;
	}
	public int div (int a, int b)
	{
		int c;
		c=a/b;
		return c;
	}
	
	public static void main(String[] args) {
		Class3 obj = new Class3();
		
		int sub_result1= obj.sub(10, 2);
		System.out.println("Result of substraction1 is "+ sub_result1);
		
		int add_result= obj.add(sub_result1, 2);
		System.out.println("Result of addition is "+ add_result);
		
		int sub_result2= obj.sub(add_result, 2);
		System.out.println("Result of substraction2 is "+ sub_result2);
		
		int sub_mul= obj.mul(sub_result2, 2);
		System.out.println("Result of multiplication is "+ sub_mul);
		
		int div_result= obj.div(sub_mul, 2);
		System.out.println("Final result is "+ div_result);
			
	}
}
