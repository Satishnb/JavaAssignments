package JavaDay1;

public class Student1 {
	int roll_no;
	int age;
	
	public void displayRollNo(int a)
	{
	    System.out.println("Roll number of student" + a +" is: " + roll_no);
	}
	public void displayAge(int a)
	{
		System.out.println("Age of student" + a +" is: " + age);
	}
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		
		s1.roll_no=10;
		s1.age=25;
		s1.displayRollNo(1);
		s1.displayAge(1);
		
		s2.roll_no=11;
		s2.age=27;
		s2.displayRollNo(2);
		s2.displayAge(2);
		
		System.out.println("value of reoll_no is " + s1.roll_no);
		System.out.println("value of reoll_no is " + s2.roll_no);


		
	}
	

}
