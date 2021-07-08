package com.adactin.stepdefinition;

import java.io.IOException;

import org.junit.runner.Runner;
import org.openqa.selenium.WebDriver;

import com.adactin.org.newMaven1.BaseClass;
import com.adactin.pom.bookHotel;
import com.adactin.pom.loginPage;
import com.adactin.pom.logout;
import com.adactin.pom.searchHotel;
import com.adactin.pom.selectHotel;
import com.adactin.property.File_Reader_Manager;
import com.adactin.property.page_object_Manager;
import com.adactin.runner.runner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition extends BaseClass {
	
	public static WebDriver driver=runner.driver;
	
	page_object_Manager pom=new page_object_Manager(driver);
	
	@Before
	public void beforeHooks(Scenario scenario)
	{
		String status =scenario.getStatus();
	     System.out.println("Scenario status :"+status);
	     
	}
	@After
	public void aferHooks(Scenario scenario) throws Throwable {
		if (scenario.isFailed()) {
			screenshot("C:\\Users\\bavya_bose\\eclipse-workspace\\newMaven1\\Screenshot\\image1.png");
		}
		System.out.println("exit from the page");
	}
	
	@Given("^User launch the adactin application$")
	public void user_launch_the_adactin_application() throws Throwable {
	    String url=File_Reader_Manager.getInstance().getInstanceCR().getUrl();
	    getUrl(url);
	}

	//loginPage lp = new loginPage(driver);
	@When("^user enter \"([^\"]*)\"  as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
		inputValueElement(pom.getinstanceLogin().getUsername(), "vinovicky");
	}

	@When("^user enter  \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
	    
	    inputValueElement(pom.getinstanceLogin().getPassword(), "Jan@2020");
	}
	
	
	@Then("^User validate the username and password$")
	public void user_validate_the_username_and_password() throws Throwable {
		clickOnElement(pom.getinstanceLogin().getLogin());
	}

	//searchHotel sh = new searchHotel(driver);
	
	@When("^user select location$")
	public void user_select_location() throws Throwable {
		selection(pom.getinstanceSearch().getLocation(), "byValue", "Melbourne");
	}

	@When("^user enter hotel$")
	public void user_enter_hotel() throws Throwable {
		selection(pom.getinstanceSearch().gethotels(), "byValue", "Hotel Sunshine");
	}

	@When("^user select room type$")
	public void user_select_room_type() throws Throwable {
		selection(pom.getinstanceSearch().getroomType(), "byValue", "Super Deluxe");  
	}

	@When("^user select number of rooms$")
	public void user_select_number_of_rooms() throws Throwable {
		selection(pom.getinstanceSearch().getroomnos(), "byValue", "1");
	}

	@When("^user enter as check in date$")
	public void user_enter_as_check_in_date() throws Throwable {
		inputValueElement(pom.getinstanceSearch().getdatein(), "06/06/2021");
	}

	@When("^user enter  as check out date$")
	public void user_enter_as_check_out_date() throws Throwable {
		inputValueElement(pom.getinstanceSearch().getdateout(), "08/06/2021"); 
	}

	@When("^user select adult per room$")
	public void user_select_adult_per_room() throws Throwable {
		selection(pom.getinstanceSearch().getadultroom(), "byValue", "2");
	}

	@When("^user select children per room$")
	public void user_select_children_per_room() throws Throwable {
		selection(pom.getinstanceSearch().getchildroom(), "byValue", "1");  
	}

	@Then("^user click the search button$")
	public void user_click_the_search_button() throws Throwable {
		clickOnElement(pom.getinstanceSearch().getsubmit());
	}

	//selectHotel shs = new selectHotel(driver);
	
	@When("^user select hotel$")
	public void user_select_hotel() throws Throwable {
		clickOnElement(pom.getinstanceSelect().getSelect());
	}

	@Then("^user click the continuie button$")
	public void user_click_the_continuie_button() throws Throwable {
		clickOnElement(pom.getinstanceSelect().getcont());
	}

	//bookHotel bh = new bookHotel(driver);

	@When("^user enter \"([^\"]*)\" first name$")
	public void user_enter_first_name(String arg1) throws Throwable {
		inputValueElement(pom.getinstanceBook().getfirstname(), arg1);
	}

	@When("^user enter \"([^\"]*)\" second name$")
	public void user_enter_second_name(String arg2) throws Throwable {
		inputValueElement(pom.getinstanceBook().getlastname(), arg2);
	}

	@When("^user enter \"([^\"]*)\" address$")
	public void user_enter_address(String arg3) throws Throwable {
		inputValueElement(pom.getinstanceBook().getaddress(), arg3);   
	}

	@When("^user enter \"([^\"]*)\" credit card number$")
	public void user_enter_credit_card_number(String arg4) throws Throwable {
		inputValueElement(pom.getinstanceBook().getccnum(), arg4);
	}

	@When("^user enter cardtype$")
	public void user_enter_cardtype() throws Throwable {
		selection(pom.getinstanceBook().getcctype(), "byValue", "VISA");
	}

	@When("^user enter exp month$")
	public void user_enter_exp_month() throws Throwable {
		selection(pom.getinstanceBook().getccexpmonth(), "byValue", "4");
	}

	@When("^user enter exp year$")
	public void user_enter_exp_year() throws Throwable {
		selection(pom.getinstanceBook().getccexpyear(), "byValue", "2022");
	}

	@When("^user enter cvv number$")
	public void user_enter_cvv_number() throws Throwable {
		inputValueElement(pom.getinstanceBook().getcccvv(), "1234");
	}

	@Then("^user book hotel$")
	public void user_book_hotel() throws Throwable {
		clickOnElement(pom.getinstanceBook().getbooknow());
	}

//	logout lo = new logout(driver);
	
	@When("^user enter logout$")
	public void user_enter_logout() throws Throwable {
		clickOnElement(pom.getinstanceLogout().getlogout());
	}


}
