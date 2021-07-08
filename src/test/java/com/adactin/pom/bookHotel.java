package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookHotel {

	public static WebDriver driver;
	
	@FindBy(name="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement ccnum;
	
	@FindBy(id="cc_type")
	private WebElement cctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement ccexpmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement cc_exp_year;
	
	@FindBy(id="cc_cvv")
	private WebElement cccvv;
	
	@FindBy(id="book_now")
	private WebElement booknow;
	
	
	
	public bookHotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
		
	}
	public WebElement getfirstname() {
		return firstname;
	}
		public WebElement getlastname() {
			return lastname;
		}
		public WebElement getaddress() {
			return address;
		}
		public WebElement getccnum() {
			return ccnum;
		}
		
		public WebElement getcctype() {
			return cctype;
		}
		public WebElement getccexpmonth() {
			return ccexpmonth;
		}
		public WebElement getccexpyear() {
			return cc_exp_year;
		}
		public WebElement getcccvv() {
			return cccvv;
		}
		public WebElement getbooknow() {
			return booknow;
		}
		
}
