package stepDefinitions;

import base.Generic;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPageOHRM;

public class SD_HomePage {
	
	@Then("validates home page by getting the user name")
	public void validates_home_page_by_getting_the_user_name() throws Exception {
//		System.out.println("2222222222222");
		CommonPageOHRM commonPage = new CommonPageOHRM(Generic.driver);
		commonPage.validateThePageHeader("Dashboard");
		
	}
	
	@When("clicks on the Time page")
	public void clicks_on_the_time_page() {
		System.out.println("333333333333333333333");
	}
	
//	@Given("User launches OrangeHRM page and enters username and password")
//	public void user_launches_orange_hrm_page_and_enters_username_and_password() {
//		System.out.println("11111111");
//	
//	}


}
