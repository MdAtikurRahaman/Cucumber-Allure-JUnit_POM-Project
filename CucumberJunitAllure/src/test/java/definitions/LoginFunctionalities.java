package definitions;

import base.Base;
import org.openqa.selenium.By;
import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunctionalities extends Base {

	@Given("I am in Landing Page")
	public void i_am_in_Landing_Page() {
		navigateURL("https://sit.skyschooling.com/microtech");
		String welcomeString = getText(By.xpath("//div/h1"));
		assertEquals("Welcome to MicroTech NA.", welcomeString);
	}

	@When("I Click on Login")
	public void i_Click_on_Login() {
		click(By.xpath("//a[@href='elogin.html']"));
	}

	@Then("I will be in Login Page")
	public void i_will_be_in_Login_Page() {
		String cLogin= getText(By.xpath("//a[@href='clogin.html']"));
		assertEquals("Customer Login", cLogin);
	}

	@Then("Click Customer Login")
	public void click_Customer_Login() {
		click(By.xpath("//a[@href='clogin.html']"));
		String customerLogin= getText(By.xpath("//div/h1"));
		assertEquals("Customer Login", customerLogin);		
	}

	@Then("I enter User Id")
	public void i_enter_User_Id() {
		sendKeys(By.xpath("//input[@name='mailuid']"), "david@gmail.com");
	}

	@Then("I enter Password")
	public void i_enter_Password() {
		sendKeys(By.xpath("//input[@name='pwd']"), "1234");
	}

	@When("I click Login Button")
	public void i_click_Login_Button() {
		click(By.name("login-submit"));
	}

	@Then("I will see Customer Home Page")
	public void i_will_see_Customer_Home_Page() {
		String welcomeName= getText(By.xpath("//h2[2]"));
		assertEquals("Welcome David", welcomeName);		
	}

}
