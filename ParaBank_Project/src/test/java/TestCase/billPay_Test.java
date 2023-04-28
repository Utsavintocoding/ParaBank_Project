package TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.BillPay;
import PageObjects.Login_ParaBank;

public class billPay_Test {
	Login_ParaBank log;
	BillPay pay;
	
	@BeforeMethod
	public void browserConfig() {
		log.initialize();
}


	@Test
	public void billPay() {
		log.loginToParabank();
		pay.billPay();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		log.tearDown();
	}
}
