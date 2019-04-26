package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.tests.DriverUtility;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import page.RegistrationPage;

public class TestMeStepDef {
	WebDriver driver;
	@Before
	public void init() {
		driver=DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, RegistrationPage.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("url of the TestMeApp")
	public void url_of_the_TestMeApp() {
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");

	}

	@When("user enter admin as username")
	public void user_enter_admin_as_username() {
		RegistrationPage.userName.sendKeys("Admin");

	}

	@When("user enter Password{int} as password")
	public void user_enter_Password_as_password(Integer int1) {

		RegistrationPage.password.sendKeys("Password456");
		RegistrationPage.LoginButton.click();
		RegistrationPage.addproduct.click();
		RegistrationPage.catname.click();
		RegistrationPage.select();
		RegistrationPage.scatname.click();
		RegistrationPage.subselect();
		RegistrationPage.prodid.sendKeys("abc");
		RegistrationPage.priceid.sendKeys("50000");
		RegistrationPage.quantityid.sendKeys("1");
		RegistrationPage.brandid.sendKeys("HP");
		RegistrationPage.description.sendKeys("HP LAPTOP");
		RegistrationPage.submit.click();
		Assert.assertTrue(RegistrationPage.msg.getText().contains("abc is added Succesfully"));
	}

	@Then("user is in home page")
	public void user_is_in_home_page() {
		//RegistrationPage.LoginButton.click();
		//RegistrationPage.addproduct.click();

	}







}
