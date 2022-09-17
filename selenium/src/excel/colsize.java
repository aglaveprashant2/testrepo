package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class colsize 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("D:\\Class\\Excel\\prash.xlsx");
	
	short col = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getLastCellNum();
	
	System.out.println(col);
}
}
