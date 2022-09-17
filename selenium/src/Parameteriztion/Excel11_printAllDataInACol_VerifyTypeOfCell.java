package Parameteriztion;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel11_printAllDataInACol_VerifyTypeOfCell
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
FileInputStream file=new FileInputStream("D:\\Class\\Excel\\123.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
int lastRowIndex = sh.getLastRowNum();
	
	for(int i=0; i<=lastRowIndex; i++) {
		Cell cellInfo = sh.getRow(i).getCell(0);
		CellType TypeofCell = cellInfo.getCellType();
		
		if(TypeofCell==CellType.STRING)
		{
			String value = cellInfo.getStringCellValue();
			System.out.println(value+ " ");
		}
		else if (TypeofCell == CellType.NUMERIC)
		{
			double value=cellInfo.getNumericCellValue();
			System.out.println(value+ " ");
		}
		else if (TypeofCell ==CellType.BOOLEAN )
		{
			boolean value = cellInfo.getBooleanCellValue();
			System.out.println(value+ " ");
		}
	}

}
}
