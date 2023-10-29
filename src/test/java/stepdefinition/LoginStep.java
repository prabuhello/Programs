package stepdefinition;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep {

	WebDriver driver;
	
	@Before
	public void setup( ) {
		WebDriverManager.chromedriver().setup();
		}

	@After
	public void tearDown(Scenario sc) {
		  
           byte[] screenshotBytes =((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
           sc.attach(screenshotBytes, "image/png", "Screenshot");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

	@Given("I open the login page")
	public void i_open_the_login_page() {
		driver = new ChromeDriver();
		driver.get("http://localhost:8081/IframeTest/"); 
		driver.manage().window().maximize();
	}

	@When("I enter username as {string} and password as {string}")
	public void i_enter_username_as_and_password_as(String username, String password) {
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@When("I click the login button")
	public void i_click_the_login_button() {
	   driver.findElement(By.id("loginBtn")).click();
	}

	@Then("I should see the Login successful. message")
	public void i_should_see_the_login_successful_message() {
	   String text = driver.findElement(By.tagName("h2")).getText();
	   Assert.assertEquals("valid  verification", "Login successful.", text);
	}

	@Then("I should see the Invalid username or password. message")
	public void i_should_see_the_invalid_username_or_password_message() {
		String text = driver.findElement(By.tagName("h2")).getText();
		   Assert.assertEquals("invalid verification", "Invalid username or password.", text);
	}


}
