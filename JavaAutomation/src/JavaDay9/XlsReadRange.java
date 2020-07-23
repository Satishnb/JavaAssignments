package JavaDay9;

// Read from xls file for particular range

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class XlsReadRange {
	
	public void readSpecificRange(int rowStart, int rowEnd) throws BiffException, IOException {
		
		File f = new File("/Users/Satish/Desktop/Regression Test cases.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		int r = ws.getRows();
		int c= ws.getColumns();
		System.out.println(r);
		System.out.println(c);
		
		for(int i=0;i<r;i++)
		{
			for (int j=0; j<c;j++)
			{
				Cell cell = ws.getCell(j,i);
				if(i>=rowStart && i<=rowEnd) {
					System.out.println(cell.getContents());	
				}	
			}
		}	
		wk.close();
	}
		public static void main(String[] args) throws BiffException, IOException {
			XlsReadRange rr = new XlsReadRange();
			Scanner s1 = new Scanner(System.in);
			rr.readSpecificRange(s1.nextInt(), s1.nextInt());
		}	
	}
