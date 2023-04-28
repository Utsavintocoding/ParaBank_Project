package PageObjects;

import org.openqa.selenium.By;

import para_bank.Base_Class;

public class RequestLoan extends Base_Class{


	By requestLoan = By.linkText(prop.getProperty("requestLoan"));
	By loanAmount = By.id(prop.getProperty("loanAmount"));
	By downpaymentAmount = By.id(prop.getProperty("downpaymentAmount"));			
	By applyNowButton = By.xpath(prop.getProperty("applyNowButton"));
	
	public void applyLoan() {
		try {

			driver.findElement(requestLoan).click();
			driver.findElement(loanAmount).sendKeys(prop.getProperty("LoanAmount"));
			driver.findElement(downpaymentAmount).sendKeys(prop.getProperty("downPayment"));
			driver.findElement(applyNowButton).click();
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());

		}
	}
}
