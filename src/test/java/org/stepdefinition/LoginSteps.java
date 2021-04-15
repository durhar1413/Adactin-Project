package org.stepdefinition;

import org.baseclass.ReuseableMethods;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends ReuseableMethods {


@Given("user is in facebook  login page")
public void user_is_in_facebook_login_page() {
	loadUrl(); 
	launchBrowser("https://www.facebook.com/");
}

@When("user enter invalid username and password")
public void user_enter_invalid_username_and_password() {
	
}

@When("user click login button")
public void user_click_login_button() {
	driver.findElement(By.name("login")).click();
}

@Then("user should be in invalid credentials page")
public void user_should_be_in_invalid_credentials_page() throws InterruptedException {
	Thread.sleep(3000);
	if (driver.getCurrentUrl().contains("privacy")) {
		System.out.println("the user credential is invalid");		
	}else if (driver.findElement(By.xpath("//a[@aria-label='Home']")).isDisplayed()) {
		System.out.println("the user credential is valid");
		
	}
}
@When("user enter invalid {string} and {string}")
public void user_enter_invalid_and(String user, String pass) {
	driver.findElement(By.name("email")).sendKeys(user);
	driver.findElement(By.name("pass")).sendKeys(pass);
	
}
@When("user click fotgot password link")
public void user_click_fotgot_password_link() {
	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
}

@When("user searches the account using invalid mobilenumber {string}")
public void user_searches_the_account_using_invalid_mobilenumber(String value) {
	toSendKeys(driver.findElement(By.xpath("//input[@type='text']")),value );
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}

@Then("user is displayed with error message")
public void user_is_displayed_with_error_message() {
	if (driver.getCurrentUrl().contains("screen=0")) {
		System.out.println("user gets an error message");
	}else {
		System.out.println("user is in invalid page");
	}
    
}



}
