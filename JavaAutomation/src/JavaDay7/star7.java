package JavaDay7;

/*
1
23
456
78910
 */

public class star7 {
	
	public static void main(String[] args) {
		int temp=1;
		for(int i=1;i<=4;i++) {        //will help which row
			for(int j=1;j<=i;j++) {    //will help how many times in a row
				System.out.print(temp);
				temp++;
				
			}
			System.out.println();
		}
	}

}
