package TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.Login_ParaBank;
import PageObjects.OpenNewAcc;


public class OpenNewAcc_Test  {
	
	Login_ParaBank log;
	OpenNewAcc New;
	
	@BeforeMethod
	public void launch() {
		log=new Login_ParaBank();
		log.initialize();
		log.loginToParabank();
	}
	
	
	@Test
	public void openAcc() {
			New.openAccount();
	}
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		log.tearDown();
	}
}
