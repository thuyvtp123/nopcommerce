package pageObject;

import org.openqa.selenium.WebDriver;

import PageUI.RegisterPageUI;
import commons.AbstractPage;

public class RegisterPageObject extends AbstractPage {
	WebDriver driver;
	public RegisterPageObject(WebDriver driver) {
		super();
		this.driver = driver;
	}



	public void clickToGenderMaleRadioButton() {
		// TODO Auto-generated method stub
		waitToElementClickable(driver,RegisterPageUI.GENDER__MALE_RADIO);
		clickToElement(driver,RegisterPageUI.GENDER__MALE_RADIO);
	}

	public void inputToFristnameTextbox(String firstName) {
		// TODO Auto-generated method stub
		waitToElementVisible(driver,RegisterPageUI.FIRSTNAME_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.FIRSTNAME_TEXTBOX, firstName);
		
	}

	public void inputToLastnameTextbox(String lastName) {
		// TODO Auto-generated method stub
		waitToElementVisible(driver,RegisterPageUI.LASTNAME_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.LASTNAME_TEXTBOX, lastName);
	}

	

	public void selectDayDropdown(String day) {
		// TODO Auto-generated method stub
		waitToElementClickable(driver,RegisterPageUI.DAY_DROPDOWN);
		selectItemInDropDown(driver, RegisterPageUI.DAY_DROPDOWN, day);
	}

	public void selectMonthDropdown(String month) {
		// TODO Auto-generated method stub
		waitToElementClickable(driver,RegisterPageUI.MONTH_DROPDOWN);
		selectItemInDropDown(driver, RegisterPageUI.MONTH_DROPDOWN, month);

	}
	public void selectYearDropdown(String year) {
		// TODO Auto-generated method stub
		waitToElementClickable(driver,RegisterPageUI.YEAR_DROPDOWN);
		selectItemInDropDown(driver, RegisterPageUI.YEAR_DROPDOWN, year);
	}

	public void inputToEmailTextbox(String email) {
		// TODO Auto-generated method stub
		waitToElementVisible(driver,RegisterPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, email);
	}

	public void inputToCompany(String companyName) {
		// TODO Auto-generated method stub
		waitToElementVisible(driver,RegisterPageUI.COMPANY_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.COMPANY_TEXTBOX, companyName);
	}

	public void inputToPasswordTextbox(String password) {
		// TODO Auto-generated method stub
		waitToElementVisible(driver,RegisterPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, password);
	}

	public void inputToConfirmPasswordTextbox(String password) {
		// TODO Auto-generated method stub
		waitToElementVisible(driver,RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, password);
	}

	public void clickToRegisterButton() {
		// TODO Auto-generated method stub
		waitToElementClickable(driver,RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver,RegisterPageUI.REGISTER_BUTTON);
	}

	public String getRegisterSuccessMessage() {
		// TODO Auto-generated method stub
		waitToElementVisible(driver,RegisterPageUI.REGISTER_SUCCEESS_MESSAGE);
		return getElementText(driver,RegisterPageUI.REGISTER_SUCCEESS_MESSAGE);
	}

	public void clickToLogoutLink() {
		// TODO Auto-generated method stub
		waitToElementClickable(driver,RegisterPageUI.LOGOUT_LINK);
		clickToElement(driver,RegisterPageUI.LOGOUT_LINK);
	}



	

}
