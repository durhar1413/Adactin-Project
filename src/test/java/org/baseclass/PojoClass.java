package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends ReuseableMethods {
	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	private WebElement txtemail;
	
	@FindBy(name="order_no")
	public WebElement orderId;
	
	public WebElement getOrderId() {
		return orderId;
	}
	@FindBy(name="password")
	private WebElement txtPass;
	
	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}
	@FindBy(name="login")
	public WebElement clickLogin;
	public WebElement getClickLogin() {
		return clickLogin;
		
	}
	@FindBy(name="location")
	private WebElement selectLocation;
	
	@FindBy(name="hotels")
	private WebElement selectHotels;
	
	@FindBy(name="room_type")
	private WebElement selectRoom;
	
	
	@FindBy(id="room_nos")
	private WebElement selectNoOfRooms;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement checkIn;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement checkOut;
	

	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement selectAdult;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement selectChildren;
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement selectRadioButton;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement selectCntBtn;
	
	
	@FindBy(name="first_name")
	private WebElement firstName;
	
	@FindBy(name="last_name")
	private WebElement lasttName;
	
	@FindBy(name="address")
	private WebElement address;
	
	@FindBy(xpath="(//input[@type='text'])[13]")
	private WebElement cardNumber;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement cardType;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement cardExpriyDate;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement cardExpriyYear;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvvNumber;
	
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement clickBookBtn;
	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLasttName() {
		return lasttName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getCardExpriyDate() {
		return cardExpriyDate;
	}

	public WebElement getCardExpriyYear() {
		return cardExpriyYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getClickBookBtn() {
		return clickBookBtn;
	}

	public WebElement getSelectLocation() {
		return selectLocation;
	}

	public WebElement getSelectHotels() {
		return selectHotels;
	}

	public WebElement getSelectRoom() {
		return selectRoom;
	}

	public WebElement getSelectNoOfRooms() {
		return selectNoOfRooms;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getSelectAdult() {
		return selectAdult;
	}

	public WebElement getSelectChildren() {
		return selectChildren;
	}
	
	public WebElement getSelectRadioButton() {
		return selectRadioButton;
	}

	public WebElement getSelectCntBtn() {
		return selectCntBtn;
	}
}
