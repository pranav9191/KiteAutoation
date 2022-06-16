package UtilPKG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
public static void screensnap(WebDriver driver) throws IOException 
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File destination=new File("D:\\Selenium\\screensnap.jpeg");
	
	FileHandler.copy(src, destination);
}

public static String getexcelvalue(int row, int cell) throws EncryptedDocumentException, IOException
{
	String sValue;
	FileInputStream File= new FileInputStream("src\\main\\resources\\credential.xlsx");
	sValue = WorkbookFactory.create(File).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
	return sValue;
}
}
