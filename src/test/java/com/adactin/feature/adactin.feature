Feature: Hotel booking functionality 

Background: User login to the application 
	Given User launch the adactin application 
	When user enter "vinovicky"  as username 
	And user enter  "Jan@2020" as password 
	Then User validate the username and password 
	


@Login	
Scenario Outline: User login to the application 
	Given User launch the adactin application 
	When user enter "<Username>"  as username 
	And user enter  "<Password>" as password 
	Then User validate the username and password 
	

Examples:

|Username|Password|
|AAA|1234|
|BBB|2222|


Scenario: search Hotel 
	When user select location 
	And  user enter hotel 
	And  user select room type 
	And user select number of rooms 
	And user enter as check in date 
	And user enter  as check out date 
	And user select adult per room 
	And user select children per room 
	Then user click the search button 


Scenario: select hotel 
	When user select hotel 
	Then user click the continuie button 
	

Scenario: Book a hotel 
	When user enter "bavya" first name 
	And user enter "bose" second name 
	And user enter "b" address 
	And user enter "1234567890123456" credit card number 
	And user enter cardtype 
	And user enter exp month 
	And user enter exp year 
	And user enter cvv number 
	Then user book hotel 
	

Scenario: logout page 
	When user enter logout