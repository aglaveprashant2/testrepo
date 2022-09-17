package Parameteriztion;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel10_printAllDataInARow_verifyTypeOFCell
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
FileInputStream file=new FileInputStream("D:\\Class\\Excel\\123.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
	
int lastCellIndex = sh.getRow(0).getLastCellNum() - 1;	
	
	for(int i=0; i<=lastCellIndex; i++)
	{
		Cell cellInfo = sh.getRow(0).getCell(i);
		CellType TypeofCell = cellInfo.getCellType();
		
		if(TypeofCell==CellType.STRING)
		{
			String value = cellInfo.getStringCellValue();
			System.out.print(value+ " ");
		}
		else if (TypeofCell == CellType.NUMERIC)
		{
			double value=cellInfo.getNumericCellValue();
			System.out.print(value+ " ");
		}
		else if (TypeofCell ==CellType.BOOLEAN )
		{
			boolean value = cellInfo.getBooleanCellValue();
			System.out.print(value+ " ");
		}
		
	}

}
}
