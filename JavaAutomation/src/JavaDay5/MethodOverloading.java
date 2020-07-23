package JavaDay5;

public class MethodOverloading {
	
	public void sum(int a, int b) {
		int c= a+b;
		System.out.println("Output of first method is "+ c);
		
	}
	
    public void sum(int a, int b, int c) {
    	System.out.println("Output of second method is: "+ (a+b+c));
		
	}
    
    public int sum(int a, float b) {
    	
    	int i= a+(int)b;
    	return i;
		
	}
    
    public static void main(String[] args) {
    	
    	MethodOverloading over =new MethodOverloading();
    	over.sum(5,7);
    	over.sum(5,7,8);
    	int output= over.sum(10,10.5f);
    	System.out.println("Output of third method is: "+ output);
	}
    
}
