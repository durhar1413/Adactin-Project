package org.adcstepdef;

import org.baseclass.PojoClass;
import org.baseclass.ReuseableMethods;
import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class StepDefinition2 extends ReuseableMethods {
	public PojoClass l;
	@When("user enter valid username and password and click login button")
	public void user_enter_valid_username_and_password_and_click_login_button() {
		l = new PojoClass();
		driver.findElement(By.id("username")).sendKeys("durairaj1314");
		driver.findElement(By.id("password")).sendKeys("9840441438");
		toClick(l.getClickLogin());
	}
	
	@When("user enter hotel detail and click search button")
	public void user_enter_hotel_detail_and_click_search_button() {
		toSelectByValue(driver.findElement(By.xpath("//select[@name='location']")),"London");
	    toSelectByValue(driver.findElement(By.xpath("//select[@name='hotels']")),"Hotel Creek");
	    PojoClass p =  new PojoClass();
	    toSelectByValue(p.getSelectRoom(),"Standard");
	    toSelectByValue(p.getSelectNoOfRooms(),"1");
	    p.getCheckIn().clear();
	    p.getCheckIn().sendKeys("13/04/2021");
	    p.getCheckOut().clear();
	    p.getCheckOut().sendKeys("14/05/2021");
	    toSelectByValue(p.getSelectAdult(),"1");
	    toSelectByValue(p.getSelectChildren(),"1");
	    driver.findElement(By.name("Submit")).click();
	    
	}

	@When("user click the radio button and click the continue button")
	public void user_click_the_radio_button_and_click_the_continue_button() {
		l.getSelectRadioButton().click();
		l.getSelectCntBtn().click();
	}
	

	@When("user enter the valid detail for booking")
	public void user_enter_the_valid_detail_for_booking() {
		toSendKeys(l.getCardNumber(),"1234567890123456");
		toSelectByValue(l.getCardType(),"VISA");
		toSelectByValue(l.getCardExpriyDate(),"2");
		toSelectByValue(l.getCardExpriyYear(),"2022");
		toSendKeys(l.getCvvNumber(),"456");
		l.getClickBookBtn().click();
	}
	
	
	
	
	
}
