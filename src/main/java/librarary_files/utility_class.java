package librarary_files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility_class {

	// to get test data from excel sheet
	public static String getTD(int rowindex, int cellindex) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\lakha\\git\\MONEYCONTROL\\test_data\\DATA.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		return value;
	}
	// to capture screenshot of failed testcases
	public static void take_failed_tc_sc(WebDriver driver, int TCID) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\lakha\\git\\MONEYCONTROL\\browser\\TC"+TCID+".jpeg");
		FileHandler.copy(src,dest);
	}
    //to get propertyfile data
	public static String get_data_from_propertyfile(String Key) throws IOException {
		FileInputStream files = new FileInputStream(
				"C:\\Users\\lakha\\git\\MONEYCONTROL\\moneycontrol.properties");
		Properties p = new Properties();
		p.load(files);
		String data = p.getProperty(Key);
		return data;

	}

}
