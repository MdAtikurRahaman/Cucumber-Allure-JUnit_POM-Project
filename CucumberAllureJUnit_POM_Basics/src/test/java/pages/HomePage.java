package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class HomePage extends Base{
	//https://sit.skyschooling.com/microtech
		
		//WebDriver driver;
		
		//public HomePage(WebDriver driver) {
		//	this.driver = driver;
		//}
		
		By welcomeText = By.xpath("//div//h2[text()='Welcome Test ']");
		
		public String getWelcomeText() {
			return browser.findElement(welcomeText).getText();
		}
		
//		browser.navigate().back
	}
