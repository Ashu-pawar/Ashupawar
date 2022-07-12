package execelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
    File myfile= new File("C:\\Users\\Dell\\Desktop\\Ashu\\selenium labraries\\textExelbatch.xlsx");
	// using workBookfactory class read excel sheet
    //how to read string value
    String name = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
    System.out.println(name);
    
    //how to read numeric value
    double number = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(2).getCell(0).getNumericCellValue();
   System.out.println(number);
   
   //how to read char value
   String chart = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(3).getCell(0).getStringCellValue();
   System.out.println(chart);
   
   //how to read boolean value
   boolean myvalue = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(3).getCell(1).getBooleanCellValue();
   System.out.println(myvalue);

	}

}
