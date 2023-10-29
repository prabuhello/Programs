package testrunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
	public WebDriver driver;
        @Test
        public void FirefoxTest() {	 
            //Initializing the firefox driver (Gecko)
        	WebDriverManager.firefoxdriver().setup();
	    driver = new FirefoxDriver();	  
	    driver.get("https://www.facebook.com"); 
	//    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
	    driver.quit();
         }
 
        @Test
 	public void ChromeTest()	
 	{ 
        	WebDriverManager.chromedriver().setup();
	  //Initialize the chrome driver
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com"); 
	 // driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
	  driver.quit();
 	}
}