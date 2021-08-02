package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import tests.BaseTest;
import utils.CommonUtility;

public class LoginPage extends BaseTest{
	
	private static String continueButton = "//span[text()='Continue']";
	private static String loginButton = "//span[text()='Login']";
	
	
	public static void enterEmail(String email) {
		  driver.findElement(By.id("username")).sendKeys(email);
	}
	
	public static void clickContinue() {
		  driver.findElement(By.xpath(continueButton)).click();
	}
	
	
	/*
	 * Check Login button is disabled
	 */
	public static void loginDisabled() {
	  if(driver.findElement(By.xpath(loginButton)).isEnabled()==false)
		  System.out.println("Login button disabled");
	  else
		  System.out.println("Login button enabled");
	}
	
	public static void clickLoginButton() {
		CommonUtility.waitForVisibilityOfElement(loginButton);
		  driver.findElement(By.xpath(loginButton)).click();
	}
	
	public static void enterPassword(String password) {
		  driver.findElement(By.id("password")).sendKeys(password);
	}
	
	public static void login() throws InterruptedException {
		LoginPage.enterEmail("apurvajoglekar23@gmail.com");
		LoginPage.clickContinue();
		Thread.sleep(3000);
		LoginPage.enterPassword("Bigbang23!");
		LoginPage.clickLoginButton();
	}

}
