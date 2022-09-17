package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example7 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("D:\\Class\\Excel\\new.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("first");
	
	 int lstrw = sh.getLastRowNum();
	 
	 for (int i = 0; i <=lstrw; i++)
	 {
		 int lstcol = sh.getRow(i).getLastCellNum()-1;
		 
		 for (int j = 0; j <=lstcol; j++) 
		 {
			String value = sh.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+" ");
		}
		 System.out.println();
	}
}
}
