package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example8_rowsize 
{

public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	
	FileInputStream file=new FileInputStream("D:\\Class\\Excel\\prash.xlsx");
	
	int lastrow = WorkbookFactory.create(file).getSheet("sheet1").getLastRowNum(); 
	
int rowsize = lastrow+1;
	
	System.out.println(rowsize);
}


}

