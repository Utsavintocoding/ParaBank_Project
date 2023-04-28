package TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.Login_ParaBank;
import PageObjects.UpdateAccountInfo;


public class UpdateAccountInfo_Test {
	

	Login_ParaBank log;
	UpdateAccountInfo info;
	
	@BeforeMethod
	public void browserConfig() {
		log.initialize();
}


	@Test
	public void firstName() {
		log.loginToParabank();
		info.updateName();
		info.clickUpdate();
	}
	
	@Test
	public void lastName() {
		log.loginToParabank();
		info.updateLastName();
		info.clickUpdate();
	}
	
	@Test
	public void address() {
		log.loginToParabank();
		info.updateAddress();
		info.clickUpdate();
	}
	
	@Test
	public void city() {
		log.loginToParabank();
		info.updateCity();
		info.clickUpdate();
	}
	
	@Test
	public void state() {
		log.loginToParabank();
		info.updateState();
		info.clickUpdate();
	}
	
	@Test
	public void Zip() {
		log.loginToParabank();
		info.updateZip();
		info.clickUpdate();
	}
	
	@Test
	public void phoneNumber() {
		log.loginToParabank();
		info.updateContact();
		info.clickUpdate();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		log.tearDown();
	}

}
