package runner;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;
	import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
	import java.util.List;

	public class FindBrokenImagesExample {
	    public static void main(String[] args){
	    	WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.freepik.com/photos/nature"); // Replace with the URL of the web page you want to test

	        List<WebElement> imageElements = driver.findElements(By.tagName("img"));
	        	int i =0;
	        	System.out.println( imageElements.size());
	        
	        	for (WebElement imageElement : imageElements) {
	            String imageUrl = imageElement.getAttribute("src");
	            try {
	                URL url = new URL(imageUrl);
	                
	                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	                connection.setRequestMethod("HEAD");
	                connection.connect();
	                int responseCode = connection.getResponseCode();
	                if (responseCode != HttpURLConnection.HTTP_OK) {
	                    System.out.println("Broken image URL: " + imageUrl);
	                }
	                else {
	                	i++;
	                	System.out.println(i+")"+imageUrl);
	                }
	                connection.disconnect();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }

	        driver.quit();
	    }
	}

	
	

