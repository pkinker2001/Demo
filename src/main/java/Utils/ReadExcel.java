package Utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class ReadExcel {
	
	public static void writeTheUserDetails(String firstname,String lastname,String email,String password) throws IOException {
		FileInputStream fs = new FileInputStream("src/main/resources/Data/AccountDetails.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int lastRow = sheet.getLastRowNum();
		Row row = sheet.createRow(lastRow+1);
		Row header = sheet.getRow(0);
		HashMap<String,Integer> hm = new HashMap<>();
		int i=0;
		while(i<header.getLastCellNum()) {
			hm.put(header.getCell(i).toString(),i);
			i++;
		}
		row.createCell(hm.get("FirstName")).setCellValue(firstname);
		row.createCell(hm.get("LastName")).setCellValue(lastname);
		row.createCell(hm.get("Email")).setCellValue(email);
		row.createCell(hm.get("Password")).setCellValue(password);		
	
	FileOutputStream fos = new FileOutputStream("src/main/resources/Data/AccountDetails.xlsx");
	workbook.write(fos);
	fos.close();
	fs.close();
	
	}
}
