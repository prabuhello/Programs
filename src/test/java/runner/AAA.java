package runner;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExample {
    public static void main(String[] args) {
        // Initialize a WebDriver instance for Chrome
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://example.com");

        // Capture a full-page screenshot
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            // Save the screenshot to a file
            FileUtils.copyFile(screenshotFile, new File("screenshot.png"));

            // Capture an element screenshot
            WebElement element = driver.findElement(By.cssSelector("your-css-selector"));
            File elementScreenshotFile = element.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(elementScreenshotFile, new File("element_screenshot.png"));
            
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeAsyncScript(null, args)
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Close the WebDriver
        driver.quit();
    }
}
""


class A {
	private void a() {
		List li = s
}


class B extends A{
	private void a() {
		
	}
}
}