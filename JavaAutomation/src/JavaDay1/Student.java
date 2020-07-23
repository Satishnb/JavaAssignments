package JavaDay1;

public class Student {
	int roll_no;
	int age;
	
	public void displayRollNo()
	{
	    System.out.println("Roll number of student is: " + roll_no);
	}
	public void displayAge()
	{
		System.out.println("Age of student is: " + age);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.roll_no=10;
		s1.age=25;
		s1.displayRollNo();
		s1.displayAge();
		
		s1.roll_no=11;
		s1.age=30;
		s1.displayRollNo();
		s1.displayAge();
	}
}
