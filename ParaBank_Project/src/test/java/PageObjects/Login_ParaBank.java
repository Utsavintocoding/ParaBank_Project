package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import para_bank.Base_Class;

public class Login_ParaBank extends Base_Class{
	WebDriver driver;
	 
	
	By usernameLocator = By.xpath(prop.getProperty("usernameLocator"));

	By passLocator = By.xpath(prop.getProperty("passwordLocator"));

	By loginButtonLocator = By.xpath(prop.getProperty("loginButtonLocator"));

	

	public void loginToParabank() {
		try {
			driver.findElement(usernameLocator).sendKeys(prop.getProperty("username"));
			driver.findElement(passLocator).sendKeys(prop.getProperty("password"));
			driver.findElement(loginButtonLocator).click();
			String expectedTitle = "ParaBank | Customer Created";
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
			
		}catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());;
		}
	}
}



