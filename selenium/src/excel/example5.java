package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example5 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream file=new FileInputStream("D:\\Class\\Excel\\new.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("first");
		int value = sh.getLastRowNum()+1;
		System.out.println(value);
		
		
}
}