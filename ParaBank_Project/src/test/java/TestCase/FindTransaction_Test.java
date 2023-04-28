package TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PageObjects.FindTransaction;
import PageObjects.Login_ParaBank;
public class FindTransaction_Test {

	Login_ParaBank log;
	FindTransaction find;
	
	@BeforeMethod
	public void browserConfig() {
		log.initialize();
}


	@Test 
	public void byTransaction() {
		log.loginToParabank();
		find.byTransaction();
	}
	
	@Test 
	public void byDate() {
		log.loginToParabank();
		find.byDate();
	}
	 
	@Test 
	public void byDateRange() {
		log.loginToParabank();
		find.byDateRange();
	}
	
	@Test 
	public void byAmount() {
		log.loginToParabank();
		find.byAmount();
	}
	@AfterMethod
	public void closeBrowser()
	{
		log.tearDown();
	}
}

