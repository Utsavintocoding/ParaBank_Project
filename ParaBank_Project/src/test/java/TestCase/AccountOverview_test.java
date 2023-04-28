package TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.AccountOverview;
import PageObjects.Login_ParaBank;

public class AccountOverview_test {
	
	Login_ParaBank log;
	AccountOverview click;
	
	@BeforeMethod
	public void browserConfig() {
		log.initialize();
}


	@Test
	public void billPay() {
		log.loginToParabank();
		click.validateAccountsOverviewPage();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		log.tearDown();
	}
}


