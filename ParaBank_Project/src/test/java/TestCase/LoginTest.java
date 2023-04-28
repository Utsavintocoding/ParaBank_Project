package TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PageObjects.Login_ParaBank;


public class LoginTest {
	WebDriver driver;
	
	Login_ParaBank log;

	
	@BeforeMethod
	public void browserConfig() {
		log.initialize();
	}
	
	@Test 

	public void validateLoginTest()
	{

		 log.loginToParabank();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		log.tearDown();
	}

}
