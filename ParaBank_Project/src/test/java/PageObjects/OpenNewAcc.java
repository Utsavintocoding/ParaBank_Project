package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import para_bank.Base_Class;

public class OpenNewAcc extends Base_Class {
		
		
	String typeOfAccount = prop.getProperty("accountType");
	By openNewAccount = By.linkText(prop.getProperty("openNewAccount"));
	By TypeOfAccountLocator = By.id(prop.getProperty("TypeOfAccountLocator"));
	By ButtonLocator = By.xpath(prop.getProperty("ButtonLocator"));
    
	public void openAccount() {
		try {
			driver.findElement(openNewAccount).click();
			Select typeOfAccount = new Select (driver.findElement(TypeOfAccountLocator));
			typeOfAccount.selectByVisibleText(prop.getProperty("accountType"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(ButtonLocator).click();
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
}
}

			

		
		
			
			

		
		
		
	



