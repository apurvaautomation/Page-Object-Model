package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import io.qameta.allure.Step;
import tests.BaseTest;
import utils.CommonUtility;

public class HomePage extends BaseTest{

	private static String loginorCreateAccountButton = "//p[text()='Login or Create Account' ]";
	private static String fromCityInput = "//input[@id='fromCity']/parent::*/following-sibling::*//input[@type='text']";
	private static String suggestionsList = "//p[contains(text(),'SUGGESTIONS')]/parent::*/following-sibling::*//li//p";
	private static String loginWithPhone = "//label[contains(text(),'Login with')]";
	
	@Step("Clicking Login or Create Acount Button")
	public static void clickLoginOrCreateAcountButton() {
		CommonUtility.waitForVisibilityOfElement(loginorCreateAccountButton);
		try{
			WebElement loginWithPhoneOrEmail = driver.findElement(By.xpath(loginWithPhone));
			loginWithPhoneOrEmail.isDisplayed();
			loginWithPhoneOrEmail.click();
			  System.out.println("Clicked");
		}
		catch(NoSuchElementException e){
			driver.findElement(By.xpath(loginorCreateAccountButton)).click();
			  System.out.println("Clicked");
		}
	
	}
	
	@Step("Click on fromCity ")
	public static void clickFromCity() {
		
		  driver.findElement(By.id("fromCity")).click();
	}
	
	@Step("Enter textbin fromCity ")
	public static void enterTextInFromCity() throws InterruptedException {
		
		  driver.findElement(By.xpath(fromCityInput)).sendKeys("Mum");
		  Thread.sleep(2000);
		  List<WebElement> suggestions = driver.findElements(By.xpath(suggestionsList));
		  System.out.println(suggestions.toString());
		  for(WebElement text: suggestions) {
			  System.out.println("Inside for loop");
			  System.out.println(text.getText());
			 	 if(text.getText().contains("Mumbai, India")) {
				  text.click();
				  break;
			  }
		  }
	}
}
