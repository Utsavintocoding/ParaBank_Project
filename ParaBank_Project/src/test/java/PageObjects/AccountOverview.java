package PageObjects;

import org.openqa.selenium.By;
import org.testng.Assert;

import para_bank.Base_Class;

public class AccountOverview extends Base_Class {
	

	By accountsOverview = By.linkText(prop.getProperty("accountsOverview"));
	
	public void validateAccountsOverviewPage() {
		try {
			driver.findElement(accountsOverview).click();
			String expectedTitle = "ParaBank | Accounts Overview";
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
			
		}catch(Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
	}
}
	
