package JavaDay7;

/*
1
2 3
4 5 6
7 8 9 10
 */

public class star6 {
	
	public static void main(String[] args) {
		int temp=1;
		for(int i=1;i<=4;i++) {        //will help which row
			for(int j=1;j<=i;j++) {    //will help how many times in a row
				System.out.print(temp + " ");
				temp++;
				
			}
			System.out.println();
		}
	}

}
