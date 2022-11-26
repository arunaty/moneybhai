package librarary_files;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base_class {
	public WebDriver driver;
	public WebDriverWait wait;
//author name  =  @Harshad
//base class consist of mandatory code run everytime like open browser
public void initialize_broweser() throws IOException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lakha\\git\\MONEYCONTROL\\browser\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
//	driver.get("https://moneybhai.moneycontrol.com/");
	driver.manage().window().maximize();
	driver.get(utility_class.get_data_from_propertyfile("URL"));
	
}




}
