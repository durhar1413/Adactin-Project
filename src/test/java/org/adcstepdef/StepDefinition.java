package org.adcstepdef;

import org.baseclass.PojoClass;
import org.baseclass.ReuseableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends ReuseableMethods {

	public PojoClass l;

	@Given("user is in adactin login page")
	public void user_is_in_adactin_login_page() {
		loadUrl();
		
		launchBrowser("https://adactinhotelapp.com/");
		removeAllCookies();
	}

	@When("user enter valid {string} and {string} and click login button")
	public void user_enter_valid_and_and_click_login_button(String username, String password) {
		l = new PojoClass();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		toClick(l.getClickLogin());
	}

	@When("user select {string},{string},{string},{string},{string},{string},{string},{string} and click search button")
	public void user_select_and_click_search_button(String location, String hotels, String roomtype, String noOfRooms,
			String checkIn, String checkOut, String adults, String child) throws InterruptedException {

		toSendKeys(l.getSelectLocation(), location);
		toSendKeys(l.getSelectHotels(), hotels);
		toSendKeys(l.getSelectRoom(), roomtype);
		toSendKeys(l.getSelectNoOfRooms(), noOfRooms);
		l.getCheckIn().clear();
		l.getCheckIn().sendKeys(checkIn);
		l.getCheckOut().clear();
		l.getCheckOut().sendKeys(checkOut);
		toSendKeys(l.getSelectAdult(), adults);
		toSendKeys(l.getSelectChildren(), child);

		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
		toClick(l.getSelectCntBtn());

	}

	@When("User {string},{string},{string},{string},{string},{string},{string} and click book btn")
	public void user_and_click_book_btn(String firstName, String lastName, String address, String cardNumber, String expMonth,
			String expYear, String cvv) throws InterruptedException {
			toSendKeys(l.getFirstName(), firstName);
			toSendKeys(l.getLasttName(), lastName);
			toSendKeys(l.getAddress(), address);
			toSendKeys(l.getCardNumber(), cardNumber);
			toSendKeys(l.getCardExpriyDate(), expMonth);
			toSendKeys(l.getCardExpriyYear(), expYear);
			toSendKeys(l.getCvvNumber(), cvv);
			toSelectByValue(l.getCardType(),"VISA");
			toClick(l.getClickBookBtn());
//			Thread.sleep(2000);
//			toGetAttribute(driver.findElement(By.name("order_no")), driver);
	}

	@Then("user should be in valid credentials page")
	public void user_should_be_in_valid_credentials_page() {
		if (driver.getCurrentUrl().contains("BookHotel")) {
			System.out.println("user is in valid page");
		}else {
			System.out.println("user is in invalid credential page");
		}
		
	}

}
