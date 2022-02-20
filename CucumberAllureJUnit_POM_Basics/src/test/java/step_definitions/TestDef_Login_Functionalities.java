package step_definitions;

import static org.junit.Assert.assertEquals;
import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactPage;
import pages.EmployeeLoginPage;
import pages.HomePage;
import pages.LandingPage;

public class TestDef_Login_Functionalities extends Base{

	LandingPage landingPage = new LandingPage();  
	EmployeeLoginPage employeeLoginPage = new EmployeeLoginPage();
	HomePage homePage = new HomePage();
	ContactPage contactPage = new ContactPage();
	
@Given("I am in landing page")
public void i_am_in_landing_page() {
	landingPage.navigateURL();
}

@When("I click on Login Menu")
public void i_click_on_Login_Menu() {
	landingPage.click_Login_Btn(); 
}

@Then("verify I am in Employee Login Page")
public void verify_I_am_in_Employee_Login_Page() {
    assertEquals("Employee Login", employeeLoginPage.getEmployeeLoginLabel() );
}

@Then("I enter Login Id")
public void i_enter_Login_Id() {
	employeeLoginPage.enterUserId("testpilot@gmail.com");
}

@Then("I enter Password")
public void i_enter_Password() {
	employeeLoginPage.enterUserPassword("1234");
}

@Then("Click on Login Button")
public void click_on_Login_Button() {
	employeeLoginPage.clickLoginBtn();
}

@Then("I will be in my Home page")
public void i_will_be_in_my_Home_page() {
	assertEquals("Welcome Test", homePage.getWelcomeText());
	}

@Then("I click on Logout")
public void I_click_on_Logout() {
	contactPage.click_logOutBtn();
	}

@Then("I click Home Btn")
public void I_click_Home_Btn() {
	contactPage.click_backHomeBtn();
	}

@Then("I will be in my Contact page")
public void I_will_be_in_my_Contact_page() {
	contactPage.click_contactBtn();
	}

@Then("verify I am in contact page")
public void verify_I_am_in_contact_page() {
	assertEquals("MicroTech NA", contactPage.getPageVerification());
	}

@Then("verify by email")
public void verify_by_email() {
	assertEquals("contact@sit.microtechna.com", contactPage.getemailId());
	}

@Then("verify by phone")
public void verify_by_phone() {
	assertEquals("+18767865430", contactPage.getphoneNumber());
	}

}


