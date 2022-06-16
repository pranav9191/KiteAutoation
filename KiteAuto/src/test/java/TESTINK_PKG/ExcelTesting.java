package TESTINK_PKG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTesting {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream File= new FileInputStream("src\\main\\resources\\credential.xlsx");
	String Value = WorkbookFactory.create(File).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	System.out.println(Value);
}
}
