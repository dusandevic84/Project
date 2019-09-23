package humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityHome {
	public static final String URL = "https://www.humanity.com";
	private static final String LOGIN_BUTTON_XPATH = "//p[contains(text(),'LOGIN')]";
	private static final String EMAIL_BUTTON_XPATH = "//input[@id='email']";
	private static final String PASSWORD_BUTTON_XPATH = "//input[@id='password']";
	private static final String LOGEDIN_BUTTON_XPATH = "//button[contains(text(),'Log in')]";
	private static final String ABOUTUS_BUTTON_XPATH = "//p[contains(text(),'About Us')]";
	private static final String TRIAL_BUTTON_XPATH = "//a[@class='button pale']";
	private static final String FULLNAME_BUTTON_XPATH = "//div[@class='input-wrapper']//input[@placeholder='Full Name']";
	private static final String EMAILTRIAL_BUTTON_XPATH = "//div[@class='input-wrapper']//input[@placeholder='Work Email']";
	private static final String STARTTRIAL_BUTTON_XPATH = "//input[@id='free-trial-link-01']";

//Login button
	public static WebElement getLoginButton(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_BUTTON_XPATH));
	}

	public static void clickLoginButton(WebDriver driver) {
		getLoginButton(driver).click();
	}

//Email for login	
	public static WebElement getEmailButton(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_BUTTON_XPATH));
	}

	public static void clickEmailButton(WebDriver driver) {
		getEmailButton(driver).click();
	}

	public static void inputEmailButton(WebDriver driver, String data) {
		getEmailButton(driver).sendKeys(data);
	}

	// Pass for login
	public static WebElement getPassButton(WebDriver driver) {
		return driver.findElement(By.xpath(PASSWORD_BUTTON_XPATH));
	}

	public static void clickPassButton(WebDriver driver) {
		getPassButton(driver).click();
	}

	public static void inputPassButton(WebDriver driver, String data) {
		getPassButton(driver).sendKeys(data);
	}

	// Logged in button
	public static WebElement getLogedinButton(WebDriver driver) {
		return driver.findElement(By.xpath(LOGEDIN_BUTTON_XPATH));
	}

	public static void clickLogedinButton(WebDriver driver) {
		getLogedinButton(driver).click();
	}

//About us
	public static WebElement getAboutus(WebDriver driver) {
		return driver.findElement(By.xpath(ABOUTUS_BUTTON_XPATH));
	}

	public static void clickAboutus(WebDriver driver) {
		getAboutus(driver).click();
	}

//Trial button
	public static WebElement getTrialButton(WebDriver driver) {
		return driver.findElement(By.xpath(TRIAL_BUTTON_XPATH));
	}

	public static void clickTrialButton(WebDriver driver) {
		getTrialButton(driver).click();
	}
//Full name button
	public static WebElement getFullNameButton(WebDriver driver) {
		return driver.findElement(By.xpath(FULLNAME_BUTTON_XPATH));
	}

	public static void clickFullNameButton(WebDriver driver) {
		getFullNameButton(driver).click();
	}

	public static void inputFullNameButton(WebDriver driver, String data) {
		getFullNameButton(driver).sendKeys(data);
	}
	//Email trial button
	public static WebElement getEmailTrialButton(WebDriver driver) {
		return driver.findElement(By.xpath(EMAILTRIAL_BUTTON_XPATH));
	}

	public static void clickEmailTrialButton(WebDriver driver) {
		getEmailTrialButton(driver).click();
	}

	public static void inputEmailTrialButton(WebDriver driver, String data) {
		getEmailTrialButton(driver).sendKeys(data);
	}
	//Start my free trial button
	public static WebElement getStartTrialButton(WebDriver driver) {
		return driver.findElement(By.xpath(STARTTRIAL_BUTTON_XPATH));
	}

	public static void clickStartTrialButton(WebDriver driver) {
		getStartTrialButton(driver).click();
	}
	

}
