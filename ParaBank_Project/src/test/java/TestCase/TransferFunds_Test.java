package TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.Login_ParaBank;
import PageObjects.TransferFunds;

public class TransferFunds_Test {
	
	Login_ParaBank log;
	TransferFunds funds; 

	
	@BeforeMethod
	public void browserConfig() {
		log.initialize();
	}
	
	@Test 

	public void validateLoginTest()
	{
		log.loginToParabank();
		funds.transferFunds();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		log.tearDown();
	}
}
