package utility23;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility56 {
	public static String getdata12(int rowindex, int colindex) throws Throwable, IOException {
		FileInputStream fis23 =new FileInputStream("C:\\Users\\tanma\\OneDrive\\Documents\\Book3.xlsx");
		Sheet sh23 = WorkbookFactory.create(fis23).getSheet("Sheet1");
		String data23 = sh23.getRow(colindex).getCell(colindex).getStringCellValue();
		return data23;
	}

}
