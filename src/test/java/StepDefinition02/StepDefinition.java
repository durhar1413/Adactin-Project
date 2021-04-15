package StepDefinition02;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.baseclass.PojoClass;
import org.baseclass.ReuseableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

public class StepDefinition extends ReuseableMethods {
	public PojoClass l;

	@Given("user sholud be in login page")
	public void user_sholud_be_in_login_page() {
		loadUrl();
		toNavigate("https://adactinhotelapp.com/index.php");
		removeAllCookies();
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password(DataTable d) throws IOException {

		Map<String, String> map = excelreadMap("Tc_01");
		String user = map.get("username");
		l = new PojoClass();
		toSendKeys(l.getTxtemail(), user);
		String pass = map.get("password");
		toSendKeys(l.getTxtPass(), pass);
		toClick(l.getClickLogin());
	
		
	}

	@When("user select location,hotels")
	public void user_select_location_hotels(DataTable d) {
		List<List<String>> lists = d.asLists();
		List<String> list = lists.get(0);
		String location = list.get(0);
		List<List<String>> asLists = d.asLists();
		List<String> list2 = asLists.get(1);
		String hotel = list2.get(0);

		toSendKeys(l.getSelectLocation(), location);
		toSendKeys(l.getSelectHotels(), hotel);

	}

	@When("user select no of rooms and room type")
	public void user_select_no_of_rooms_and_room_type(DataTable d) {
		List<List<String>> asLists = d.asLists();
		List<String> list = asLists.get(0);
		String noOfRooms = list.get(2);
		List<List<String>> li = d.asLists();
		List<String> l1 = li.get(1);
		String roomType = l1.get(0);

		toSendKeys(l.getSelectNoOfRooms(), noOfRooms);
		toSendKeys(l.getSelectRoom(), roomType);
	}

	@When("user is in checkin and checkout")
	public void user_is_in_checkin_and_checkout(DataTable d) {

		List<String> asList = d.asList();
		String checkIn = asList.get(0);
		String checkOut = asList.get(1);
		l.getCheckIn().clear();
		toSendKeys(l.getCheckIn(), checkIn);
		l.getCheckOut().clear();
		toSendKeys(l.getCheckOut(), checkOut);
	}

	@When("user select adults and child and click search button")
	public void user_select_adults_and_child_and_click_search_button(DataTable d) {
		List<List<String>> l1 = d.asLists();
		List<String> list = l1.get(0);
		String adult = list.get(1);
		toSendKeys(l.getSelectAdult(), adult);
		List<List<String>> l2 = d.asLists();
		List<String> list2 = l2.get(1);
		String child = list2.get(0);
		toSendKeys(l.getSelectChildren(), child);
		toClick(l.getSelectCntBtn());
	}

	@When("user select and click continue button")
	public void user_select_and_click_continue_button() {
		toClick(l.getSelectRadioButton());
		toClick(l.getSelectCntBtn());
	}

	@When("user enter firstname,lastname and address")
	public void user_enter_firstname_lastname_and_address(DataTable d) {
		Map<String, String> map = d.asMap(String.class, String.class);
		String f = map.get("firstname");
		toSendKeys(l.getFirstName(), f);
		String l1 = map.get("lastname");
		toSendKeys(l.getLasttName(), l1);
		String add = map.get("address");
		toSendKeys(l.getAddress(), add);
	}

	@When("user enter card no,card type,expmonth,expyear,cvv number and click book now button")
	public void user_enter_card_no_card_type_expmonth_expyear_cvv_number_and_click_book_now_button(DataTable d) throws InterruptedException {
		List<Map<String, String>> asMaps = d.asMaps();
		Map<String, String> map = asMaps.get(1);
		String cardNo = map.get("cardno");
		toSendKeys(l.getCardNumber(), cardNo);
		String cardType = map.get("cardtype");
		toSendKeys(l.getCardType(), cardType);
		String expMonth = map.get("expmonth");
		toSendKeys(l.getCardExpriyDate(), expMonth);
		String expYear = map.get("expyear");
		toSendKeys(l.getCardExpriyYear(), expYear);
		String cvv = map.get("cvv");
		toSendKeys(l.getCvvNumber(), cvv);

		l.getClickBookBtn().click();
	}

	@Then("user is in valid credential page")
	public void user_is_in_valid_credential_page() throws InterruptedException {
		Thread.sleep(10000);
		
		if (driver.getCurrentUrl().contains("BookingConfirm")) {
			
			WebElement f1 = driver.findElement(By.xpath("//a[text()='www.adactin.com']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", f1);
			WebElement findElement = driver.findElement(By.id("order_no"));
			String attribute = findElement.getAttribute("value");
			System.out.println("your order no:" + attribute);
			 
			System.out.println("Room Booked");
		} else {
			System.out.println("Room not booked");
		}
			System.out.println("user is in valid credential page");
		}
	}


