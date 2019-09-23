package humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {
	public static final String URL = "https://testing266.humanity.com/app/staff/list/load/true/";
	private static final String ADDEMPLOYEE_BUTTON_XPATH = "//button[@id='act_primary']";
	private static final String SAVEEMPLOYEE_BUTTON_XPATH = "//button[@id='_as_save_multiple']";

	// Add Employee

	public static WebElement getAddEmployeeButton(WebDriver driver) {
		return driver.findElement(By.xpath(ADDEMPLOYEE_BUTTON_XPATH));
	}

	public static void clickAddEmplyeeButton(WebDriver driver) {
		getAddEmployeeButton(driver).click();
	}

	// Employee name
	public static WebElement getEmployeeName(WebDriver driver, int index) {
		String pd = "//input[@id='_asf";
		String dd = "']";
		String xpath = pd + index + dd;
		return driver.findElement(By.xpath(xpath));
	}

	public static void clickEmployeeName(WebDriver driver, int index) {
		getEmployeeName(driver, index).click();
	}

	public static void inputEmployeeName(WebDriver driver, int index, String data) {
		getEmployeeName(driver, index).sendKeys(data);
	}
	// Employee surname

	public static WebElement getEmployeeSurname(WebDriver driver, int index) {
		String pd = "//input[@id='_asl";
		String dd = "']";
		String xpath = pd + index + dd;
		return driver.findElement(By.xpath(xpath));
	}

	public static void clickEmployeeSurname(WebDriver driver, int index) {
		getEmployeeSurname(driver, index).click();
	}

	public static void inputEmployeeSurname(WebDriver driver, int index, String data) {
		getEmployeeSurname(driver, index).sendKeys(data);
	}
	// Employee email

	public static WebElement getEmployeeEmail(WebDriver driver, int index) {
		String pd = "//input[@id='_ase";
		String dd = "']";
		String xpath = pd + index + dd;
		return driver.findElement(By.xpath(xpath));
	}

	public static void clickEmployeeEmail(WebDriver driver, int index) {
		getEmployeeEmail(driver, index).click();
	}

	public static void inputEmployeeEmail(WebDriver driver, int index, String data) {
		getEmployeeEmail(driver, index).sendKeys(data);
	}

	// SAve Employee
	public static WebElement getSaveEmployeeButton(WebDriver driver) {
		return driver.findElement(By.xpath(SAVEEMPLOYEE_BUTTON_XPATH));
	}

	public static void clickSaveEmplyeeButton(WebDriver driver) {
		getSaveEmployeeButton(driver).click();
	}
	
	public static WebElement getEmployee(WebDriver driver, int index) {
		String pd = "//a[contains(text(),'";
		String dd = "')]";
		String xpath = pd + getEmployeeName(driver, index) + ""+ getEmployeeSurname(driver, index) + dd;
		return driver.findElement(By.xpath(xpath));
	}
	public static void clickEmployee(WebDriver driver, int index) {
		getEmployee(driver, index).click();
	}
	
}
