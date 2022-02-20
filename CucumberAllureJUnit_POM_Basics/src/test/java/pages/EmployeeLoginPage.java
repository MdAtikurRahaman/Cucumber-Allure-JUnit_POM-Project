package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class EmployeeLoginPage extends Base{
//WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the
	//public EmployeeLoginPage(WebDriver driver) {
		//this.driver = driver;
	//}
	//Locator username filed
		By employeeLoginLabel = By.xpath("//h1[text()='Employee Login ']");
		By userIdBox = By.name("mailuid");
		By userPasswordBox = By.name("pwd");
		By loginBtn = By.name("login-submit");
		
		//Method to enter username
		public String getEmployeeLoginLabel() {
	    	return browser.findElement(employeeLoginLabel).getText();
	    }
		public void enterUserId(String user) {
			browser.findElement(userIdBox).sendKeys(user);
		}
		public void enterUserPassword(String pass) {
			browser.findElement(userPasswordBox).sendKeys(pass);
		}
		public void clickLoginBtn() {
			browser.findElement(loginBtn).click();
		}

}
