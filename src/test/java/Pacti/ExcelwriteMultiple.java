package Pacti;

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelwriteMultiple 
{
	public static void main(String[] args) throws Throwable 
	{
		Workbook wb = new XSSFWorkbook();
		Sheet sh = wb.createSheet("Sheet4");

		Object[][] data= {
				{"name", "age","prof"},
				{"mahes",54,"te"},
				{"sures",99, "dev"},
				{"lok",9,"Scrim"},

		};
		int rownum=0;
		for( Object[] rowdata :data)
		{
			Row row = sh.createRow(rownum++);

			int colnum=0;

			for( Object filed :rowdata)
			{
				Cell cell = row.createCell(colnum++);

				if( filed instanceof String )
				{
					cell.setCellValue((String) filed);
				}
				else if( filed instanceof Integer )
				{
					cell.setCellValue((Integer)filed);
				}


			}
			FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\commonData.properties\\Book2.xlsx");
			wb.write(fos);
		}
	}
}
	



		
			
	