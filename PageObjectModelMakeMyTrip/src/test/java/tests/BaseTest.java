package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.qameta.allure.Step;

public class BaseTest {

	public static  RemoteWebDriver driver;
	
	@Step("Setup")
	@Parameters({"browser"})
	@BeforeClass
	public void setUp(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "F:\\EclipseWorkspace\\DemoProject\\src\\test\\java\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			
		}
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
