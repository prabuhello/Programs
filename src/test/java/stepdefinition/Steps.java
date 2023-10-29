package stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	ChromeDriver browser;

	
	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with(String string) {

	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {

	}

	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String string) {

	}

	@Given("the test data are available from csv file {string}")
	public void the_test_data_are_available_from_csv_file(String string) {

		int i = 0;
		while (true) {
			i++;
			if (i > 100)
				break;
		}
	}

}
