package Parameteriztion;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel9_printAllDataInASheet 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("D:\\Class\\Excel\\123.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
	
	//outer for loop for rows	
	int lastRowIndex= sh.getLastRowNum();
	
	for (int i = 0; i < lastRowIndex; i++) 
	{
		//inner for loop for col
		int lastCellIndex = sh.getRow(i).getLastCellNum()-1;
		
		for (int j = 0; j <=lastCellIndex; j++)
		{
			String value = sh.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+"   ");
		}
		System.out.println();
	}
}
}
