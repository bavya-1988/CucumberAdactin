package com.adactin.property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.bookHotel;
import com.adactin.pom.loginPage;
import com.adactin.pom.logout;
import com.adactin.pom.searchHotel;
import com.adactin.pom.selectHotel;

public class page_object_Manager {

	public static WebDriver driver;
	
	private loginPage login;
	private searchHotel search;
	private selectHotel select;
	private bookHotel book;
	private logout log;
	
	public page_object_Manager(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	public loginPage getinstanceLogin() {
		login=new loginPage(driver);
		return login;
	}
	public searchHotel getinstanceSearch() {
		search=new searchHotel(driver);
		return search;
	}
	public selectHotel getinstanceSelect() {
		select=new selectHotel(driver);
		return select;
	}
	public bookHotel getinstanceBook() {
		book=new bookHotel(driver);
		return book;
	}
	public logout getinstanceLogout() {
		log=new logout(driver);
		return log;
		
	}
	
}
