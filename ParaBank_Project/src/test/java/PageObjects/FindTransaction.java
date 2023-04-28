package PageObjects;

import org.openqa.selenium.By;

import para_bank.Base_Class;

public class FindTransaction extends Base_Class{
		
	By findTransaction = By.xpath(prop.getProperty("findTransaction"));	
	By Amount = By.id(prop.getProperty("findByAmountLocator"));
	By findByAmountButton = By.xpath(prop.getProperty("byamount"));
	By Transaction = By.id(prop.getProperty("Transaction "));
	By findByTransactionButton = By.xpath(prop.getProperty("byTransactionButton"));
	By Date = By.xpath(prop.getProperty("date"));
	By findByDateButton = By.xpath(prop.getProperty("byDateButton"));
	By fromDate = By.id(prop.getProperty("fromDateRange"));
	By toDate = By.id(prop.getProperty("toDateRange"));
	By bydateRangeButton =By.xpath(prop.getProperty("byDateRange"));
	
	public void byTransaction() {
		try {
			driver.findElement(findTransaction).click();
			driver.findElement(Transaction).sendKeys(prop.getProperty("TransactionId"));
			driver.findElement(findByTransactionButton).click();
		} catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());;		}
	}
	
	public void byDate() {
		
		try {
			driver.findElement(findTransaction).click();
			driver.findElement(Date).sendKeys(prop.getProperty("TransactionDate"));
			driver.findElement(findByDateButton).click();
		} catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());;		}
	}
	
	public void byDateRange () {
		
		try {
			driver.findElement(findTransaction).click();
			driver.findElement(fromDate).sendKeys(prop.getProperty("fromDate"));
			driver.findElement(toDate).sendKeys(prop.getProperty("toDate"));
			driver.findElement(bydateRangeButton).click();
		} catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());;		}
		
	}
	
	public void byAmount() {
		
		try {
			driver.findElement(findTransaction).click();
			driver.findElement(Amount).sendKeys(prop.getProperty("TransactionAmount"));
			driver.findElement(findByDateButton).click();
		} catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());;		}
	}
} 
