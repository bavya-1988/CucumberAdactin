package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchHotel {

	public static WebDriver driver;

	@FindBy(name = "location")
	private WebElement location;

	@FindBy(name = "hotels")
	private WebElement hotels;

	@FindBy(name = "room_type")
	private WebElement room_type;

	@FindBy(name = "room_nos")
	private WebElement room_nos;

	@FindBy(name = "datepick_in")
	private WebElement date_pickin;

	@FindBy(name = "datepick_out")
	private WebElement date_pickout;

	@FindBy(name = "adult_room")
	private WebElement adult_room;

	@FindBy(name = "child_room")
	private WebElement child_room;

	@FindBy(name = "Submit")
	private WebElement submit;

	public searchHotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement gethotels() {
		return hotels;
	}

	public WebElement getroomType() {
		return room_type;
	}

	public WebElement getroomnos() {
		return room_nos;
	}

	public WebElement getdatein() {
		return date_pickin;
	}

	public WebElement getdateout() {
		return date_pickout;
	}

	public WebElement getadultroom() {
		return adult_room;
	}

	public WebElement getchildroom() {
		return child_room;
	}

	public WebElement getsubmit() {
		return submit;
	}

}
