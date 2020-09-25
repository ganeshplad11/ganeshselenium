package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdef {
	
	
		@Given("^i am on login page$")
		public void i_am_on_login_page()
		{
		    
			System.out.println("h############");
			
		}
		
		@When("^user enter a user id and password$")
		public void user_enter_a_user_id_and_password() 
		{
			System.out.println("@@@@@@@@@@@@");
		    
		}
		@Then("^login successfully$")
		public void login_successfully() 
		{
			System.out.println("%%%%%%%%%%%%%%%%%");
		    
			
		}



	

}
