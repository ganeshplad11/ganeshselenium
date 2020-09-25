package ExcelTesttilty;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static  void main(String[] args) throws IOException {
		
		
		
			try {
				File src = new File("‪C:\\Users\\Ganesh\\test.xls");
				
				
				FileInputStream fis = new FileInputStream (src);
						
				 XSSFWorkbook xss = new XSSFWorkbook(fis);
				 XSSFSheet sheet =xss.getSheetAt(0);
				 String data = sheet.getRow(0).getCell(0).getStringCellValue();
				System.out.println(data);
				 xss.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		
		}
		
		
	}


