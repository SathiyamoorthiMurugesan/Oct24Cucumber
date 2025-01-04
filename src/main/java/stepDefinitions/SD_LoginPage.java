package stepDefinitions;

import base.Generic;
import io.cucumber.java.en.Given;
import pages.LoginPageOHRM;

public class SD_LoginPage {

	public Generic generic = new Generic();

//	Given User launches OrangeHRM page and enters username and password
	@Given("User launches OrangeHRM page and enters username and password")
	public void user_launches_orange_hrm_page_and_enters_username_and_password() throws Exception {
//		System.out.println("11111111");

		generic.launchABrowser();
		LoginPageOHRM loginPage = new LoginPageOHRM(Generic.driver);
		loginPage.loginOrangeHrmApplication1("Admin", "admin123");
	}


//	@Given("User launches OrangeHRM page and enters Username {string} and Password {string}")
//	public void user_launches_orange_hrm_page_and_enters_username_and_password(String username, String password) throws Exception {
//		generic.launchABrowser();
//		LoginPageOHRM loginPage = new LoginPageOHRM(Generic.driver);
//		loginPage.loginOrangeHrmApplication1(username, password);
//	}
	
//	OR
	
	@Given("^User launches OrangeHRM page and enters Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_launches_orange_hrm_page_and_enters_username_and_password(String username, String password) throws Exception {
		generic.launchABrowser();
		LoginPageOHRM loginPage = new LoginPageOHRM(Generic.driver);
		loginPage.loginOrangeHrmApplication1(username, password);
	}

}
