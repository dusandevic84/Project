package humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff {
	public static final String URL = "https://testing266.humanity.com/app/staff/detail/5093246/";
	private static final String EDIT_BUTTON_XPATH = "//a[contains(text(),'Edit Details')]";
	private static final String UPLOADPICTURE_BUTTON_XPATH = "//input[@id='fileupload']";
	private static final String NICKNAME_BUTTON_XPATH = "//input[@id='nick_name']";
	private static final String SAVEEMPLOYEE_BUTTON_XPATH = "//button[@id='act_primary']";


	//Edit profile
	public static WebElement getEdit(WebDriver driver) {
		return driver.findElement(By.xpath(EDIT_BUTTON_XPATH));
	}

	public static void clickEdit(WebDriver driver) {
		getEdit(driver).click();
	}
	//Upload Picture
		public static WebElement getUpload(WebDriver driver) {
			return driver.findElement(By.xpath(UPLOADPICTURE_BUTTON_XPATH));
		}

		public static void clickUpload(WebDriver driver) {
			getUpload(driver).click();
		}
		
		public static void inputUpload(WebDriver driver) {
			
		}
	//nickname	
		public static WebElement getNickname(WebDriver driver) {
			return driver.findElement(By.xpath(NICKNAME_BUTTON_XPATH));
		}

		public static void clickNickname(WebDriver driver) {
			getNickname(driver).click();
		}
		
		public static void inputNickname(WebDriver driver, String data) {
			getNickname(driver).sendKeys(data);
		}
		//save employee
		public static WebElement getSaveButton(WebDriver driver) {
			return driver.findElement(By.xpath(SAVEEMPLOYEE_BUTTON_XPATH));
		}

		public static void clickSaveButton(WebDriver driver) {
			getSaveButton(driver).click();
		}

}
