package Pacti;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelwrite 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		final FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\commonData.properties\\Book1.xlsx");
		final Workbook wb = WorkbookFactory.create(fis);
		final Sheet sh = wb.getSheet("sheet1");
		final Row row = sh.createRow(1);
		final Cell cell = row.createCell(0);
		cell.setCellValue("moisha");
		final FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\commonData.properties\\Book1.xlsx");
		   wb.write(fos);
		   wb.close();
	}

}
