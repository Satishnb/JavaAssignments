package JavaDay9;

// Read particular cell value from xls using predefined method

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class xlsReadParticularCellMethod {
	
	public void readLine(int row,int column) throws BiffException, IOException
	{
		File f = new File("/Users/Satish/Desktop/Workbookfile.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet ws= wb.getSheet(0);
		Cell c=ws.getCell(row, column);
		System.out.println(c.getContents());
		
		wb.close();
		
	}
	
	public static void main(String[] args) throws BiffException, IOException {
		xlsReadParticularCellMethod rl = new xlsReadParticularCellMethod();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of particular row column");
		rl.readLine(s1.nextInt(), s1.nextInt());
		
		
	}

}
