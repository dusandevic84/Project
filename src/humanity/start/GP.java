package humanity.start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import humanity.page.objects.HumanityHome;
import humanity.page.objects.HumanityMenu;
import humanity.page.objects.HumanityProfile;
import humanity.page.objects.HumanityStaff;

public class GP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//Provera login-a		
		
		HumanityHome.clickLoginButton(driver);
		HumanityHome.inputEmailButton(driver, "kehoboged@net1mail.com");
		HumanityHome.inputPassButton(driver, "testiranje");
		HumanityHome.clickLogedinButton(driver);
		
		Thread.sleep(3000);

		HumanityProfile.clickProfile(driver);
		//HumanityProfile.clickToProfile(driver);
		//HumanityProfile.clickAvailability(driver);
		HumanityProfile.getVersion(driver);
	}

}
