package PageObjects;

import org.openqa.selenium.By;
import para_bank.Base_Class;

public class TransferFunds extends Base_Class {
	
	
	By transferFunds = By.linkText(prop.getProperty("transferFund"));
	By amount = By.id(prop.getProperty("amount"));
	By transferButton = By.xpath(prop.getProperty("transferButton"));
	
	public void transferFunds() {
		try {
			driver.findElement(transferFunds).click();
			driver.findElement(amount).sendKeys(prop.getProperty("amountTobeTransfered"));
			driver.findElement(transferButton).click(); 

		} catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());;
		}
	}

}
