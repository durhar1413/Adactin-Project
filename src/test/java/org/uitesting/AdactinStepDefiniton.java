package org.uitesting;

import org.baseclass.PojoClass;
import org.baseclass.ReuseableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinStepDefiniton extends ReuseableMethods {
	

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("durairaj1314");
		driver.findElement(By.id("password")).sendKeys("9840441438");
		
	}

	@When("user click login button")
	public void user_click_login_button() {
		driver.findElement(By.id("login")).click();

	}

	@Then("user should be in valid credentials page")
	public void user_should_be_in_valid_credentials_page() {
		if (driver.getCurrentUrl().contains("index")) {
			System.out.println("user is invalid data");
		}else if (driver.findElement(By.xpath("(//input[@type='text'])[1]")).isDisplayed()) {
			System.out.println("user is in valid data");
		}
		
	}
	@Given("user is in adactin login page")
	public void user_is_in_adactin_login_page() {
		loadUrl();
		launchBrowser("https://adactinhotelapp.com/index.php");
	}
	
	@Given("user is in adactin booking detail page")
	public void user_is_in_adactin_booking_detail_page() {
	    System.out.println("User is in booking page");
	}

	@When("user enter valid Location and hotel and roomtype and number of rooms and checkin and checkout and adult per room and children per room")
	public void user_enter_valid_Location_and_hotel_and_roomtype_and_number_of_rooms_and_checkin_and_checkout_and_adult_per_room_and_children_per_room() throws InterruptedException {
	    toSelectByValue(driver.findElement(By.xpath("//select[@name='location']")),"London");
	    toSelectByValue(driver.findElement(By.xpath("//select[@name='hotels']")),"Hotel Creek");
	    PojoClass p =  new PojoClass();
	    toSelectByValue(p.getSelectRoom(),"Standard");
	    toSelectByValue(p.getSelectNoOfRooms(),"1");
	    p.getCheckIn().clear();
	    p.getCheckIn().sendKeys("20/04/2021");
	    p.getCheckOut().clear();
	    p.getCheckOut().sendKeys("11/05/2021");
	    toSelectByValue(p.getSelectAdult(),"1");
	    toSelectByValue(p.getSelectChildren(),"1");
    		
	    
	}

	@Then("user click search button")
	public void user_click_search_button() {
	  driver.findElement(By.name("Submit")).click();
	}
	
	@Given("user is in adactin booking itinerary page")
	public void user_is_in_adactin_booking_itinerary_page() {
	    if (driver.getCurrentUrl().contains("12345")) {
			System.out.println("user is in invalid booking itinerary page");
		}else if (driver.findElement(By.xpath("//td[text()='Select Hotel ']")).isDisplayed()) {
			System.out.println("user is in valid booking itinerary page");
		}
	}

	@When("user enter valid booking details")
	public void user_enter_valid_booking_details() {
		PojoClass p =  new PojoClass();
		p.getSelectRadioButton().click();
	    
	}

	@When("user click continue button")
	public void user_click_continue_button() {
		PojoClass p =  new PojoClass();
	    p.getSelectCntBtn().click();
	}
	
	@Given("user is in adactin payment page")
	public void user_is_in_adactin_payment_page() {
	    if (driver.getCurrentUrl().contains("adas")) {
	    	System.out.println("user is in invalid adactin payment page");
		}else if (driver.findElement(By.xpath("//td[text()='Book A Hotel ']")).isDisplayed()) {
			System.out.println("user is in valid adactin payment page");
		}
	}

	@When("user enter valid personal details")
	public void user_enter_valid_personal_details() {
		PojoClass p =  new PojoClass();
		toSendKeys(p.getFirstName(), "Durairaj");
		toSendKeys(p.getLasttName(), "Raja");
		toSendKeys(p.getAddress(), "856");

	}

	

	@When("user enter valid card details and user click booknow button")
	public void user_enter_valid_card_details_and_user_click_booknow_button() throws InterruptedException {
		PojoClass p =  new PojoClass();
		toSendKeys(p.getCardNumber(),"1234567890123456");
		toSelectByValue(p.getCardType(),"VISA");
		toSelectByValue(p.getCardExpriyDate(),"2");
		toSelectByValue(p.getCardExpriyYear(),"2022");
		toSendKeys(p.getCvvNumber(),"456");
		p.getClickBookBtn().click();
		
	}


}
