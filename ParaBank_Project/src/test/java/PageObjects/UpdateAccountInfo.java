package PageObjects;

import org.openqa.selenium.By;

import para_bank.Base_Class;

public class UpdateAccountInfo extends Base_Class{
	
	By updateContactInfo = By.linkText(prop.getProperty("updateContactInfo"));
	By updateFirstName = By.id(prop.getProperty("updateFirstName"));
	By updateLastName = By.id(prop.getProperty("updateLastName"));
	By updateAddress = By.id(prop.getProperty("updateAddress"));
	By updateCity = By.id(prop.getProperty("updateCity"));
	By updateState = By.id(prop.getProperty("updateState"));
	By updateZipcode = By.id(prop.getProperty("updateZipcode"));
	By updatePhoneNumber = By.id(prop.getProperty("updatePhoneNumber"));
	By updateProfileButton = By.xpath(prop.getProperty("updateProfileButton"));
	
	public void updateName() {
		try {

			driver.findElement(updateContactInfo).click();
			driver.findElement(updateFirstName).clear();
			driver.findElement(updateFirstName).sendKeys(prop.getProperty("Firstname"));
		} catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());;

		}
		
	}
	public void updateLastName() {
		try {
			driver.findElement(updateContactInfo).click();
			driver.findElement(updateLastName).clear();
			driver.findElement(updateLastName).sendKeys(prop.getProperty("Lastname"));
		} catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());;

		}
	}
	public void updateAddress() {
		try {
			driver.findElement(updateContactInfo).click();
			driver.findElement(updateAddress).clear();
			driver.findElement(updateAddress).sendKeys(prop.getProperty("Address"));
		} catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());;

		}
		
	}
	public void updateCity ( ) {
		try {
			driver.findElement(updateContactInfo).click();
			driver.findElement(updateCity).clear();
			driver.findElement(updateCity).sendKeys(prop.getProperty("City"));
		} catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());;

		}
	}
	public void updateState() {
		try {
			driver.findElement(updateContactInfo).click();
			driver.findElement(updateState).clear();
			driver.findElement(updateState).sendKeys(prop.getProperty("State"));
		} catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());;

		}
	}
	public void updateZip() {
		try {
			driver.findElement(updateContactInfo).click();
			driver.findElement(updateZipcode).clear();
			driver.findElement(updateZipcode).sendKeys(prop.getProperty("Zipcode"));
		} catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());;

		}
		
	}
		public void updateContact() {
			try {
				driver.findElement(updateContactInfo).click();
				driver.findElement(updatePhoneNumber).clear();
				driver.findElement(updatePhoneNumber).sendKeys(prop.getProperty("Phonenumber"));
			} catch (Exception e) {
				System.out.println("Exception is "+e.getMessage());;

			}
			
		}
		
		public void clickUpdate() {
			
			driver.findElement(updateProfileButton).click();

		}
	
		
	}


