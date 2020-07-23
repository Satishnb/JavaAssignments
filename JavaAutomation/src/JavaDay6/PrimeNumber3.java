package JavaDay6;

public class PrimeNumber3 {
	
	public void primeNumber(int a) {
		int num = a;
		boolean flag = false;

        int i=2;
		
		while(i<=num/2)
		{
			
			if(num%i==0)
			{
				flag=true;
				break;
				
			}
			i++;
		}
			if(flag== false)
			{
				System.out.println(num + " is prime number");
			}
			else
			{
				System.out.println(num + " is  non prime");
			}
			
		}
	
	public static void main(String[] args) {
		PrimeNumber3 prime = new PrimeNumber3();
		for( int b=5;b<=50;b++) {
		prime.primeNumber(b);
		
		}
	}
		
	}


