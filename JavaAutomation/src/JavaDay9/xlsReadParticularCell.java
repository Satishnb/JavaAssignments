package JavaDay9;

// Read particular cell value from xls without using pre defined method

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class xlsReadParticularCell {
	
	public void readLine(int row, int column) throws BiffException, IOException
	{
		File f = new File("/Users/Satish/Desktop/Workbookfile.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet ws= wb.getSheet(0);
		int r1= ws.getRows();
		int c1=ws.getColumns();
		int r = row;
		int c = column;
		
		for(int i=0; i<r1;i++) {
			for(int j=0;j<c1;j++) {
				Cell cell = ws.getCell(j,i);
				if(i==r && j==c) {
					System.out.println(cell.getContents());
					
				}
			}
		}
		wb.close();
		
	}
	
	public static void main(String[] args) throws BiffException, IOException {
		xlsReadParticularCell rl = new xlsReadParticularCell();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of particular row column");
		rl.readLine(s1.nextInt(), s1.nextInt());
		
		
	}

}
