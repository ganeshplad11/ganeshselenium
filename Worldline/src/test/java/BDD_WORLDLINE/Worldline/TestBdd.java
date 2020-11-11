package BDD_WORLDLINE.Worldline;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestBdd {
	@Given("^User navigate to the facebook page$")
	public void loginpage() {
		 System.out.println("step 1");
	}

	@When("^login using by username and password$")
	public void enter_Credintials() {
		 System.out.println("step 2");
	}

	@When("^cliks on thelogin button$")
	public void cliks_on_thelogin_button() {
		 System.out.println("step3");
	}
	
		@Then("user able to login to facebook portal")
		public void user_able_to_login_to_facebook_portal() {
		    System.out.println("step 4");
		}



	}


