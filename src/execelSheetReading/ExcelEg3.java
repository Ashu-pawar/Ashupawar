package execelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("C:\\Users\\Dell\\Desktop\\Ashu\\selenium labraries\\textExelbatch.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet2");
		int totalnumberofrows = mysheet.getLastRowNum();//will give me total row count
		int rowcount = totalnumberofrows;
		System.out.println("Total Number of rows are "+rowcount);
		
		short totalnumberofcell = mysheet.getRow(totalnumberofrows).getLastCellNum();
		 int cellcount = totalnumberofcell-1;
		 System.out.println("Total Number Of cell are "+cellcount);
		 
		 for(int i=0;i<=rowcount;i++)//outer for loop for rows
		 {
			 for(int j=0;j<=cellcount;j++)//inner for loop for cell
			 {
				 Cell cellvalue = mysheet.getRow(i).getCell(j);
				 CellType datatype = cellvalue.getCellType();
				 if(datatype==CellType.STRING)
				 {
					 String value = cellvalue.getStringCellValue();
					 System.out.print(value+" ");
				 }
				 else if (datatype==CellType.NUMERIC)
				 {
					 double value = cellvalue.getNumericCellValue();
					 System.out.print(value+" ");
				 }
				 else if(datatype==CellType.BOOLEAN)
				 {
					 boolean value = cellvalue.getBooleanCellValue();
					 System.out.print(value+" ");
				 }
				 else if(datatype==CellType.BLANK)
					 
				 {
					System.out.print(" ");
				 }
			 }
			 
			 System.out.println();
		 }
		
		
		
		


	}
	

}
