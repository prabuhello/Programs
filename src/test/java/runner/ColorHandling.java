package runner;

import java.awt.Color;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ColorHandling {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.linkText("Forgotten password?"));
		String cssValue = ele.getCssValue("color");
		System.out.println(cssValue);
		Color colorFromCssValue = getColorFromCssValue(cssValue);
		System.out.println(colorFromCssValue);
	}
	
	
	public static Color getColorFromCssValue(String cssValue) {
	    String[] rgba = cssValue.replace("rgba(", "").replace(")", "").split(",");
	    int red = Integer.parseInt(rgba[0].trim());
	    int green = Integer.parseInt(rgba[1].trim());
	    int blue = Integer.parseInt(rgba[2].trim());
	    return new Color(red, green, blue);
	}
}
