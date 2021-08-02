package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;


public class OneWayTripTest extends BaseTest {
	

 @Test
 public static void onewayTrip() throws InterruptedException {
	 HomePage.clickLoginOrCreateAcountButton();
		Thread.sleep(4000);
	 LoginPage.login();
	 Thread.sleep(3000);
	 HomePage.clickFromCity();
	 HomePage.enterTextInFromCity();
	 Thread.sleep(20000);
 }
}
