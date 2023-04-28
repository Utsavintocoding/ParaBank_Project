package TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import PageObjects.LogOut;
import PageObjects.Login_ParaBank;

public class Logout_Test {
	
	Login_ParaBank log;
	LogOut off;
	
	@BeforeMethod
	public void browserConfig() {
		log.initialize();
}


	@Test
	public void LogOut() {
		log.loginToParabank();
		off.logOut();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		log.tearDown();
	}
}
