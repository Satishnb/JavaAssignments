package JavaDay10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlsxRead {
	
	public static void main(String[] args) throws IOException, InvalidFormatException {
		
		File f = new File("/Users/Satish/Desktop/apache1.xlsx");
		XSSFWorkbook xss = new XSSFWorkbook(f);
		XSSFSheet sheet =xss.getSheetAt(0);
		int rows= sheet.getPhysicalNumberOfRows();
		
	}

}
