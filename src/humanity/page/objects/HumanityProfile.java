package humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityProfile {
	public static final String URL = "https://testing266.humanity.com/app/dashboard/";
	private static final String PROFILE_BUTTON_XPATH = "//i[@class='icon icon-arrowFullDn j-arrowIconToAvatar navBottom__userArrow']";
	private static final String GOTOPROFILE_BUTTON_XPATH = "//a[contains(text(),'Profile')]";
	private static final String SETTINGS_BUTTON_XPATH = "//div[@class='userm userm-mainPage']//a[contains(text(),'Settings')]";
	private static final String AVAILABILITY_BUTTON_XPATH = "//div[@class='userm userm-mainPage']//a[contains(text(),'Availability')]";
	private static final String VERSION_XPATH = "//div[@id='humanityAppVersion']";

	// Profile icon
	public static WebElement getProfile(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILE_BUTTON_XPATH));
	}

	public static void clickProfile(WebDriver driver) {
		getProfile(driver).click();
	}

	// go to profile
	public static WebElement getToProfile(WebDriver driver) {
		return driver.findElement(By.xpath(GOTOPROFILE_BUTTON_XPATH));
	}

	public static void clickToProfile(WebDriver driver) {
		getToProfile(driver).click();
	}

	// Settings
	public static WebElement getSettings(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_BUTTON_XPATH));
	}

	public static void clickSettings(WebDriver driver) {
		getSettings(driver).click();
	}

	// Availability
	public static WebElement Availability(WebDriver driver) {
		return driver.findElement(By.xpath(AVAILABILITY_BUTTON_XPATH));
	}

	public static void clickAvailability(WebDriver driver) {
		Availability(driver).click();
	}

	// Version
	public static void getVersion(WebDriver driver) {
			WebElement we=driver.findElement(By.xpath(VERSION_XPATH));
			String s = we.getText();
			System.out.println(s);
			
		}
}
