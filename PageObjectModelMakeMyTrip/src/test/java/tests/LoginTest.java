package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest{

	
	@Test
	public void loginTest() throws InterruptedException {
		System.out.println("LoginTest");
		HomePage.clickLoginOrCreateAcountButton();
		LoginPage.enterEmail("apurvajoglekar23@gmail.com");
		LoginPage.clickContinue();
		Thread.sleep(3000);
		LoginPage.loginDisabled();
		LoginPage.enterPassword("Bigbang23!");
		LoginPage.clickLoginButton();
	}
}
