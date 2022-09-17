package Parameteriztion;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel9_verifyTypeOfCell 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("D:\\Class\\Excel\\123.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
	  Cell cellvalue = sh.getRow(0).getCell(2);
      CellType typeofcell = cellvalue.getCellType();
      System.out.println(typeofcell);
      
      if (typeofcell==CellType.STRING) 
      {
		String value = cellvalue.getStringCellValue();
		System.out.println(value);
	}else if(typeofcell==CellType.NUMERIC) 
	{
		double value = cellvalue.getNumericCellValue();
		System.out.println(value);
	}else if(typeofcell==CellType.BOOLEAN) 
	{
	     boolean value = cellvalue.getBooleanCellValue();	
	     System.out.println(value);
	}

	
	
}
}
