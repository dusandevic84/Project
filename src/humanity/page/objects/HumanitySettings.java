package humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;



public class HumanitySettings {
	public static final String URL = "https://testing266.humanity.com/app/admin/settings/";
	private static final String COUNTRY_BUTTON_XPATH = "//a[contains(text(),'Edit Details')]";
	private static final String LANGUAGE_BUTTON_XPATH = "//td[@class='nowrap']//select[@name='language']";
	private static final String TIMEFORMAT_BUTTON_XPATH = "//select[@name='pref_24hr']";

	//Drop down country
	public static Select getCountry(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(COUNTRY_BUTTON_XPATH)));
	}
	
	public static void clickCountry(WebDriver driver, String data) {
		getCountry(driver).selectByVisibleText(data);
	}
	//Drop down Language
	public static Select getLanguage(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(LANGUAGE_BUTTON_XPATH)));
	}
	
	public static void clickLanguage(WebDriver driver, String data) {
		getLanguage(driver).selectByVisibleText(data);
	}
	//Drop down timeformat
		public static Select getTimeFormat(WebDriver driver) {
			return new Select(driver.findElement(By.xpath(TIMEFORMAT_BUTTON_XPATH)));
		}
		
		public static void clickTimeFormat(WebDriver driver, String data) {
			getTimeFormat(driver).selectByVisibleText(data);
		}
}
