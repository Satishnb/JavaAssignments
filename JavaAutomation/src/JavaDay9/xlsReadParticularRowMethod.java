package JavaDay9;

// Read particular row value from xls with predefined method

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class xlsReadParticularRowMethod {
	
	public void readLine(int row) throws BiffException, IOException
	{
		File f = new File("/Users/Satish/Desktop/Workbookfile.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet ws= wb.getSheet(0);
		Cell[]  cell= ws.getRow(row);
		
		for (int i = 0; i < cell.length; i++) {
			
			System.out.println(cell[i].getContents());
			
		}
		
		wb.close();
		
	}
	
	public static void main(String[] args) throws BiffException, IOException {
		xlsReadParticularRowMethod rl = new xlsReadParticularRowMethod();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of particular row column");
		rl.readLine(s1.nextInt());
		
		
	}

}
