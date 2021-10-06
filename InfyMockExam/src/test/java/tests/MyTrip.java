package tests;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class MyTrip {
	static WebDriver driver;
	 static Logger logger =  Logger.getLogger(MyTrip.class);
	
//	PropertyConfigurator c ;
//	c.configure("log4j.properties");
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void log() {
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\main\\resources\\log4j2.properties");
		logger.info("Entering URL");
		
		driver.get("https://makemytrip.com/");
		
	}
	
	@Test
	public static void test1() {
		logger.info(driver.getTitle());
		List<WebElement> links = driver.findElements(By.tagName("a"));
		logger.info("Number of hyperlinks:" + links.size());
		
	}

	
	@AfterClass
	public void tearDown() {
		driver.quit();
		
	}
}
