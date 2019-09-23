package humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import humanity.page.objects.HumanityHome;
import humanity.page.objects.HumanityMenu;
import humanity.page.objects.HumanityStaff;

public class HumanityAddNewEmployee {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		HumanityHome.clickLoginButton(driver);
		HumanityHome.inputEmailButton(driver, "kehoboged@net1mail.com");
		HumanityHome.inputPassButton(driver, "testiranje");
		HumanityHome.clickLogedinButton(driver);
		
		HumanityMenu.clickStaff(driver);
		HumanityStaff.clickAddEmplyeeButton(driver);

		for(int index=1;index<=2;index++) {
			HumanityStaff.getEmployeeName(driver, index);
			HumanityStaff.clickEmployeeName(driver, index);
			HumanityStaff.inputEmployeeName(driver, index, "Test"+index);
		}
		
		for(int index=1;index<=2;index++) {
			HumanityStaff.getEmployeeSurname(driver, index);
			HumanityStaff.clickEmployeeSurname(driver, index);
			HumanityStaff.inputEmployeeSurname(driver, index, "Era"+index);
		}
		for(int index=1;index<=2;index++) {
			HumanityStaff.getEmployeeEmail(driver, index);
			HumanityStaff.clickEmployeeEmail(driver, index);
			HumanityStaff.inputEmployeeEmail(driver, index, "testera"+index+"@pljeskavicarnica.com");
		}
		
		HumanityStaff.clickSaveEmplyeeButton(driver);
		HumanityMenu.clickStaff(driver);
		
	}
}