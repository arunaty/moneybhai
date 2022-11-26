package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login_pom1 {
//	WebDriver driver;
	@FindBy(xpath = "(//a[text()='skip'])[1]")
	private WebElement SKIPCLICK1;
	@FindBy(xpath = "//button[@id='loginbtn']")
	private WebElement play_LOGINCLICK2;
	@FindBy(xpath = "//button[@class='mb-cbtn linkSignIn modalBtn']")
	private WebElement CLICK;
	@FindBy(xpath = "//iframe[@id='myframe']")
	private WebElement iframename;
	
	@FindBy(xpath = "//input[@placeholder='Email or Mobile Number or User ID']")
	private WebElement UN;
	@FindBy(xpath = "(//input[@name='pwd'])[2]")
	private WebElement PW;
	@FindBy(xpath = "//button[@id='ACCT_LOGIN_SUBMIT']")
	private WebElement CLICKSUBMIT;

	public login_pom1(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void login_pom1_click_on_skip() {
		SKIPCLICK1.click();

	//CLICK.click();
	}

	public void login_pom1_click_on_playnow() throws InterruptedException {
		play_LOGINCLICK2.click();

	}

	public void swframe(WebDriver driver)
	{
		driver.switchTo().frame(iframename);
		
	}
	public void switchframe(WebDriver driver, WebDriverWait wait) {
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("//div[@class='login-iframe-holder']/iframe"));
		driver.switchTo().frame("//div[@class='login-iframe-holder']/iframe");
	}

	public void login_pom1_enter_UN(String UNM) {
		UN.sendKeys(UNM);

	}

	public void login_pom1_enter_PW(String PWD) {
		PW.sendKeys(PWD);

	}

	public void login_pom1_CLICKSUBMIT() {
		CLICKSUBMIT.click();

	}
}
