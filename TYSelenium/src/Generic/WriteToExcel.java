package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		String path = ("./data/input.xlsx");
		FileInputStream file = new FileInputStream(path) ;
		Workbook wb = WorkbookFactory.create(file);
		Sheet s = wb.getSheet("Sheet2");
		Row r = s.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("hi");
		wb.write(new FileOutputStream(path));
		System.out.println("efer");

	}

}

