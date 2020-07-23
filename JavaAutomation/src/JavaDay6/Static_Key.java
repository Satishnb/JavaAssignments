package JavaDay6;

public class Static_Key {
	
	int a= 34;
	static int b = 10;
	
	public void increment1()
	{
		a= a+1;
		System.out.println("value of a is "+ a);
	}
	
	public void increment2()
	{
		b= b+1;
		System.out.println("value of a is "+ b);
	}
	
	public static void main(String[] args) {
		
		Static_Key key1 = new Static_Key();
		Static_Key key2 = new Static_Key();
		
		key1.increment1();  //value will store at object level in key1
		key1.increment1();  // value will store at object level in key1
		key2.increment1();  //value will store at object level in key2
		
		
		key1.increment2();   //value will store at class level
		key2.increment2();   //value will store at class level
		System.out.println(Static_Key.b);   /// also call using class name
		
		Static_Key.b=200;
		System.out.println(Static_Key.b);
		
	}
	
}
