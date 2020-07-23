package JavaDay9;

// write into xls file for particular column and multiple rows

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class xlsWriteParticularColumn {
	
	public void Write(int column) throws IOException, RowsExceededException, WriteException {
		
		File f = new File("/Users/Satish/Desktop/Workbookfile12.xls");
		WritableWorkbook ww = Workbook.createWorkbook(f);
		WritableSheet ws = ww.createSheet("Java", 0);

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value that you want to insert");		
		     for (int i=0; i<=4;i++) {
				Label l = new Label(column,i,sc.nextLine());
				ws.addCell(l);
		     }
			
		ww.write();
		ww.close();
	}
		
	public static void main(String[] args) throws RowsExceededException, WriteException, IOException {
		
		xlsWriteParticularColumn xw = new xlsWriteParticularColumn();
		Scanner s1= new Scanner(System.in);
		System.out.println("enter the value of row column");
		xw.Write(s1.nextInt());
		
	}

}
