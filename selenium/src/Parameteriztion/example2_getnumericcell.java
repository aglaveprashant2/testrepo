package Parameteriztion;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example2_getnumericcell
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
{
		
	
FileInputStream file=new FileInputStream("D:\\Class\\Excel\\123.xlsx");

Workbook f1 = WorkbookFactory.create(file);
Sheet sheet = f1.getSheet("Sheet1");
Row rw = sheet.getRow(1);
Cell cel = rw.getCell(0);
double value = cel.getNumericCellValue();
System.out.println(value);
}
}
