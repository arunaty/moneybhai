package login_test_class;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import librarary_files.base_class;
import login.login_pom1;

public class LOGIN_TEST_PERFORM extends base_class {
	login_pom1 o1;
	
	@BeforeClass
	public void openbroweser() throws IOException {
		initialize_broweser();
		o1 = new login_pom1(driver);
	}

	@BeforeMethod
	public void switch_to_frame() throws InterruptedException {
		o1.login_pom1_click_on_skip();
		Thread.sleep(1500);
		o1.login_pom1_click_on_playnow();
		Thread.sleep(1500);
		o1.swframe(driver);


	}

	@Test
	public void loginwothcredential() throws EncryptedDocumentException, IOException {
		String UNM = librarary_files.utility_class.getTD(0, 0);
		o1.login_pom1_enter_UN(UNM);
		String PWD = librarary_files.utility_class.getTD(0, 1);
		o1.login_pom1_enter_PW(PWD);
		o1.login_pom1_CLICKSUBMIT();
	}

}
