package pageObject;

import org.openqa.selenium.WebDriver;

import PageUI.HomePageUI;
import commons.AbstractPage;

public class HomePageObject extends AbstractPage{

	WebDriver driver;
	public HomePageObject(WebDriver driver) {
		super();
		this.driver = driver;
	}



	public void clickToRegisterLink() {
		// TODO Auto-generated method stub
		waitToElementClickable(driver,HomePageUI.REGISTER_LINK);
		clickToElement(driver,HomePageUI.REGISTER_LINK);
		
	}



}
