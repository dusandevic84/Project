package humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMenu {
	public static final String URL = "https://testing266.humanity.com/app/dashboard/";
	private static final String DASHBOARD_XPATH = "//p[contains(text(),'Dashboard')]";
	private static final String SHIFTPLANNING_XPATH = "//p[contains(text(),'ShiftPlanning')]";
	private static final String TIMECLOCK_XPATH = "//p[contains(text(),'Time Clock')]";
	private static final String LEAVE_XPATH = "//a[@id='sn_requests']//span[@class='primNavQtip__inner']";
	private static final String TRAINING_XPATH = "//p[contains(text(),'Training')]";
	private static final String STAFF_XPATH = "//p[contains(text(),'Staff')]";
	private static final String PAYROLL_XPATH = "//p[contains(text(),'Payroll')]";
	private static final String REPORTS_XPATH = "//p[contains(text(),'Reports')]";
	private static final String SETTINGS_XPATH = "//i[@class='primNavQtip__icon icon-gear']";


//Dashboard link	
	public static WebElement getDashboard(WebDriver driver) {
		return driver.findElement(By.xpath(DASHBOARD_XPATH));
	}

	public static void clickdashboard(WebDriver driver) {
		getDashboard(driver).click();
	}

//Shift Planning
	public static WebElement getShiftPlanning(WebDriver driver) {
		return driver.findElement(By.xpath(SHIFTPLANNING_XPATH));
	}

	public static void clickShiftPlanning(WebDriver driver) {
		getShiftPlanning(driver).click();
	}

	// Time clock
	public static WebElement getTimeClock(WebDriver driver) {
		return driver.findElement(By.xpath(TIMECLOCK_XPATH));
	}

	public static void clickTimeClock(WebDriver driver) {
		getTimeClock(driver).click();
	}

	// Leave
	public static WebElement getLeave(WebDriver driver) {
		return driver.findElement(By.xpath(LEAVE_XPATH));
	}

	public static void clickLeave(WebDriver driver) {
		getLeave(driver).click();
	}

	// Training
	public static WebElement getTraining(WebDriver driver) {
		return driver.findElement(By.xpath(TRAINING_XPATH));
	}

	public static void clickTraining(WebDriver driver) {
		getTraining(driver).click();
	}

//Staff
	public static WebElement getStaff(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF_XPATH));
	}

	public static void clickStaff(WebDriver driver) {
		getStaff(driver).click();
	}

	// Payroll
	public static WebElement getPayroll(WebDriver driver) {
		return driver.findElement(By.xpath(PAYROLL_XPATH));
	}

	public static void clickPayroll(WebDriver driver) {
		getPayroll(driver).click();
	}

	// Reports
	public static WebElement getReports(WebDriver driver) {
		return driver.findElement(By.xpath(REPORTS_XPATH));
	}

	public static void clickReports(WebDriver driver) {
		getReports(driver).click();
	}
	
	//Settings
	public static WebElement getSettings(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_XPATH));
	}

	public static void clickSettings(WebDriver driver) {
		getSettings(driver).click();
	}

}
