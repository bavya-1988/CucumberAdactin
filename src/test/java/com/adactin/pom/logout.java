package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout {

	public static WebDriver driver;
	
	@FindBy(linkText="Logout")
	private WebElement logout;
	


	
	public logout(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
		
	}
	public WebElement getlogout() {
		return logout;
	}
	
	
}
