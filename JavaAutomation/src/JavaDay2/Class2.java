package JavaDay2;

//((((10/2)-2)+2)+2)/2)


public class Class2 {
	public int div (int a, int b)
	{
		int c;
		c=a/b;
		return c;
	}
	
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
	
	public static void main(String[] args) {
		Class2 obj = new Class2();
		
		int div_result1= obj.div(10, 2);
		System.out.println("value of divison1 is "+ div_result1);
		
		int sub_result= obj.sub(div_result1, 2);
		System.out.println("value of substraction is "+ sub_result);
		
		int add_result1= obj.add(sub_result, 2);
		System.out.println("value of addition1 is "+ add_result1);
		
		int add_result2= obj.add(add_result1, 2);
		System.out.println("value of addition2 is "+ add_result2);
		
		int div_result2= obj.div(add_result2, 2);
		System.out.println("final output is "+ div_result2);
		
		
	}

}
