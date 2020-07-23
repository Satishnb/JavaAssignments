package JavaDay5;

public abstract class AbstarctParent {
	
	public void withbody() {
		int a =5;
		int b= 7;
		int c= a+b;
		System.out.println("Output of concrete method is: "+ c);
	}
	
	
	   public  abstract void withoutbody();
}
