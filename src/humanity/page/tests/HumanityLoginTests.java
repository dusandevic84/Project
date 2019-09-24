package humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Objects;

import humanity.page.objects.HumanityHome;
import humanity.page.objects.HumanityMenu;

public class HumanityLoginTests {

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

		String URL = driver.getCurrentUrl();
		if (Objects.equal(URL, HumanityMenu.URL)) {
			System.out.println("Pass");
		} else {
			System.out.println("failed");
		}
	}
	
}
