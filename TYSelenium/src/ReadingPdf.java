import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import com.sun.jna.StringArray;


public class ReadingPdf {

	public static void main(String[] args) throws IOException 
	{
		File src = new File("./resource/bill.pdf");
		PDDocument pdf = PDDocument.load(src);
         
	 PDFTextStripper strip = new PDFTextStripper();
	 String str = strip.getText(pdf);
	 List<String> arr = new ArrayList<>();
	 for(String s:arr)
	 {
	   
	 {
		 System.out.println(str);
	 }
	}

}
