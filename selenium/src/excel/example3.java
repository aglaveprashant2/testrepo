package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example3 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("D:\\Class\\Excel\\new.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("first");
	
	int lst = sh.getRow(0).getLastCellNum()-1;
	
	for (int i = 0; i <=lst; i++) 
	{
		String value = sh.getRow(0).getCell(i).getStringCellValue();
		System.out.print(value+" ");
	}
}
}
