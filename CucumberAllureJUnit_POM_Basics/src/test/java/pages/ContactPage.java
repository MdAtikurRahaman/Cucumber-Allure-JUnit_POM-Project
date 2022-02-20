package pages;

import org.openqa.selenium.By;

import base.Base;

public class ContactPage extends Base{
	
	
	By logOutBtn = By.xpath("//a[@href='elogin.php']");
	By backHomeBtn = By.xpath("//a[text()='HOME']");
	By contactBtn = By.xpath("//a[text()='CONTACT']");
	By contactPageVerification =By.xpath("//p[text()='MicroTech NA']");
	By emailId = By.xpath("//p[text()=' contact@sit.microtechna.com']");
	By phoneNo = By.xpath("//p[text()=' +18767865430']");
	
	
	public void click_logOutBtn() {
		browser.findElement(logOutBtn).click();
	}
	
	public void click_backHomeBtn() {
		browser.findElement(backHomeBtn).click();
	}
	
	public void click_contactBtn() {
		browser.findElement(contactBtn).click();
	}
	
	public String getPageVerification() {
		return browser.findElement(contactPageVerification).getText();
	}
	
	public String getemailId() {
		return browser.findElement(emailId).getText();
	}
	
	public String getphoneNumber() {
		return browser.findElement(phoneNo).getText();
	}
	
//	browser.navigate().back();
	

}
