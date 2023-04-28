package PageObjects;

import org.openqa.selenium.By;

import para_bank.Base_Class;

public class LogOut extends Base_Class{
	
	By logout = By.linkText(prop.getProperty("logout"));
	
	public void logOut() {
		
		driver.findElement(logout).click();
		driver.close();
	}

}
