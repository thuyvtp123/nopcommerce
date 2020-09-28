package tiki.atantis.user;

import pageObject.HomePageObject;
import pageObject.LoginPageObject;
import pageObject.RegisterPageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;

public class Register extends AbstractTest {
	String source_folder = System.getProperty("user.dir");
	String url = "https://demo.nopcommerce.com/";
	WebDriver driver;
	Select select;
	String firstName, lastName, email, companyName, password;
	HomePageObject homePage;
	RegisterPageObject registerPage;
	LoginPageObject loginPage;

	@Parameters("browser")
	@BeforeClass
	public void before(String browserName) {

		driver = getBrowserDriver(browserName);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// cho element dc load
		driver.manage().window().maximize();// mo full window
		driver.get(url);
		homePage = new HomePageObject(driver);
		firstName = "Tony";
		lastName = "Buoi Sang";
		email = "tonybuoisang" + getRandomNumber() + "@hotmail.com";
		companyName = "Tony Buoi Sang";
		password = "tonybuoisang";

	}

	private String getRadomNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@AfterClass
	public void after() {
		driver.quit();
	}

	@Test
	public void TC_01_Register() {
		homePage.clickToRegisterLink();
		registerPage = new RegisterPageObject(driver);
		registerPage.clickToGenderMaleRadioButton();
		registerPage.inputToFristnameTextbox(firstName);
		registerPage.inputToLastnameTextbox(lastName);
		registerPage.selectDayDropdown("10");
		registerPage.selectMonthDropdown("August");
		registerPage.selectYearDropdown("1960");
		registerPage.inputToEmailTextbox(email);
		registerPage.inputToCompany(companyName);
		registerPage.inputToPasswordTextbox(password);
		registerPage.inputToConfirmPasswordTextbox(password);

		registerPage.clickToRegisterButton();
		registerPage.getRegisterSuccessMessage();
		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");

		registerPage.clickToLogoutLink();
		homePage = new HomePageObject(driver);
	}

}
