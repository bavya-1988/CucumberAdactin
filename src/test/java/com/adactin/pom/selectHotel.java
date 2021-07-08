package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectHotel {

	public static WebDriver driver;
	
	@FindBy(name="radiobutton_0")
	private WebElement select1;
	
	@FindBy(id="continue")
	private WebElement cont;
	
	public selectHotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
		
	}
	public WebElement getSelect() {
		return select1;
	}
	public WebElement getcont() {
		return cont;
	}
	
	
}
