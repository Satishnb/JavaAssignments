package JavaDay6;


public class Factorila_Recursion {
	
	public long factorial1(long n) {
		
		if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial1(n-1));    
		 
		}
	public static void main(String[] args) {
		Factorila_Recursion  rec = new Factorila_Recursion();
		long fact = rec.factorial1(5);
		System.out.println(fact);
		
	}

}
