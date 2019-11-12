package Generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readfronexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		String path = ("./data/input.xlsx");
		FileInputStream file = new FileInputStream(path) ;
		Workbook wb = WorkbookFactory.create(file);
		Sheet s = wb.getSheet("Sheet1");
		Row r = s.getRow(0);
		 String un = r.getCell(0).toString();
		 System.out.println(un);
		String pw = wb.getSheet("Sheet1").getRow(0).getCell(1).toString();
		 System.out.println(pw);
		 
		 
		 //Print all the rows and cells with value
		 for(int i=0;i<=s.getLastRowNum()+1;i++)
		 {
			 Row row = s.getRow(i);
			 if(row==null)
			 
				 row=s.createRow(i);
			 
			 for(int j=0;j<row.getLastCellNum();j++)
			 {
				 String val = row.getCell(j, MissingCellPolicy.CREATE_NULL_AS_BLANK).toString();
				 System.out.println(val+"\t");
			 }
			 
		 }System.out.println();
	}

}
