package JavaDay9;

// Read whole xls file

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class XlsRead {
	
		public static void main(String[] args) throws BiffException, IOException {
			
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
				{    // it will give particular cell value
					Cell cell = ws.getCell(j,i);
					// use getContents method to get the cell value
					System.out.println(cell.getContents());
					
				}
			}	
			wk.close();
		}
	}
