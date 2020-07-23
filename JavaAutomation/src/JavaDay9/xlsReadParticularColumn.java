package JavaDay9;

// Read particular column value from xls without predefined method

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class xlsReadParticularColumn {
	
	public void readLine(int column) throws BiffException, IOException
	{
		File f = new File("/Users/Satish/Desktop/Workbookfile.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet ws= wb.getSheet(0);
		int r1= ws.getRows();
		int c1=ws.getColumns();
		int c = column;
		
		for(int i=0; i<r1;i++) {
			for(int j=0;j<c1;j++) {
				Cell cell = ws.getCell(j,i);
				if(j==c) {
					System.out.println(cell.getContents());
					
				}
			}
		}
		wb.close();
		
	}
	
	public static void main(String[] args) throws BiffException, IOException {
		xlsReadParticularColumn rl = new xlsReadParticularColumn();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of particular row column");
		rl.readLine(s1.nextInt());
		
		
	}

}
