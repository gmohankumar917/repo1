package Step_def;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_steps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		System.out.println("hii");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("hii");
		
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("hii");
	}

	@Then("user is on home page")
	public void user_is_on_home_page() {
		System.out.println("hii");
	}

}
