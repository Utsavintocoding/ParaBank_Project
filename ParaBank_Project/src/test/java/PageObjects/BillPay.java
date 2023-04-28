package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import para_bank.Base_Class;

public class BillPay extends Base_Class{
	
	 WebDriver driver;
	 
		By payBillLocator = By.linkText(prop.getProperty("payBillLocator"));
		By payeeNameLocator = By.xpath(prop.getProperty("payeeNameLocator"));
		By payeeAddLocator = By.xpath(prop.getProperty("payeeAddLocator"));
		By CityLocator = By.xpath(prop.getProperty("CityLocator"));
		By StateLocator = By.xpath(prop.getProperty("StateLocator"));
		By ZipcodeLocator = By.xpath(prop.getProperty("ZipcodeLocator"));
		By PhoneNumberLocator = By.xpath(prop.getProperty("PhoneNumberLocator"));
		By AccountNumberLocator = By.xpath(prop.getProperty("AccountNumberLocator"));
		By VerifyAccountNumberLocator = By.xpath(prop.getProperty("VerifyAccountNumberLocator"));
		By AmountToBeTransferredLocator = By.xpath(prop.getProperty("AmountToBeTransferredLocator"));
		By sendPaymentLocator = By.xpath(prop.getProperty("sendPaymentLocator"));

	public void billPay() {
		 
		try { 
			driver.findElement(payBillLocator).click();
			driver.findElement(payeeNameLocator).sendKeys(prop.getProperty("PayeeName"));
			driver.findElement(payeeAddLocator).sendKeys(prop.getProperty("PayeeAdd"));
			driver.findElement(CityLocator).sendKeys(prop.getProperty("CityName"));
			driver.findElement(StateLocator).sendKeys(prop.getProperty("StateName"));
			driver.findElement(ZipcodeLocator).sendKeys(prop.getProperty("Zipcode"));
			driver.findElement(PhoneNumberLocator).sendKeys(prop.getProperty("PhnNumber"));
			driver.findElement(AccountNumberLocator).sendKeys(prop.getProperty("AccNumber"));
			driver.findElement(VerifyAccountNumberLocator).sendKeys(prop.getProperty("AccNumber"));
			driver.findElement(AmountToBeTransferredLocator).sendKeys(prop.getProperty("Ammount"));
			driver.findElement(sendPaymentLocator).click();

		} catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
	
		
	}
}