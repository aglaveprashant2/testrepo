package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class rowdata 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("D:\\Class\\Excel\\prash.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	
	int rwsize = sh.getRow(1).getLastCellNum()-1;
	
	for (int i = 0; i <=rwsize; i++)
	{
		 Cell type = sh.getRow(1).getCell(i);
		 CellType typeofcell = type.getCellType();
		 
		 if(typeofcell==CellType.NUMERIC)
		 {
			 double num = type.getNumericCellValue();
			 System.out.print(num+" ");
		 }
		 else if(typeofcell==CellType.STRING)
		 {
			 String text = type.getStringCellValue();
			 System.out.print(text+" ");
		 }
		 else if (typeofcell==CellType.BOOLEAN)
		 {
			boolean bol = type.getBooleanCellValue();
			System.out.print(bol+" ");
		 }
		
	}
}
}
