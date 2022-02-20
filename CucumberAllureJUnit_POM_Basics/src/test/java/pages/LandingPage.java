package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class LandingPage extends Base{
//	WebDriver driver;
//	public LandingPage(WebDriver driver) {
//		this.driver = driver;
//	}

	public void navigateURL() {
		browser.get("https://sit.skyschooling.com/microtech");
	}
	
	By Loginbtn = By.xpath("//a[@href='elogin.php']");

	public void click_Login_Btn() {
		browser.findElement(Loginbtn).click();
	}
}
