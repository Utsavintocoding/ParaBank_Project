package TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PageObjects.Login_ParaBank;
import PageObjects.RequestLoan;

public class RequestLoan_Test {
	
	Login_ParaBank log;
	RequestLoan loan;
	
	@BeforeMethod
	public void browserConfig() {
		log.initialize();
}


	@Test
	public void billPay() {
		log.loginToParabank();
		loan.applyLoan();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		log.tearDown();
	}

}
