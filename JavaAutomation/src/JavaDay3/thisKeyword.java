package JavaDay3;

public class thisKeyword {
int a;
int b;

public void thisMethod1(int a)
{
a=a;     
System.out.println("Value of a(local) without this keyword is: " + a);

}

public void thisMethod2(int b)
{
this.b=b;
System.out.println("Value of b(local) using this keyword is: " + b);
}

public static void main(String[] args) {
	thisKeyword k1 = new thisKeyword();
	k1.thisMethod1(5);
	System.out.println("Value of a(global) without this keyword is: " + k1.a);


	k1.thisMethod2(10);
	System.out.println("Value of b(global) using this keyword is: " + k1.b);

}
}