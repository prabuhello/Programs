

package runner;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Command;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( tags = "@login",  plugin = {"pretty"}, features = "src/test/resources", glue="stepdefinition")
public class RunCucumberTest {
 public static void main(String[] args) {
	System.out.println(    );
	WebDriver driver = null;
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
									.pollingEvery(Duration.ofSeconds(30))
									 .ignoring(Exception.class);
	
	
	Wait w = new WebDriverWait(driver,30);
	
	
	
		WebElement e;
 }
}


