package runner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException, ParseException {
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver(); driver.manage().deleteAllCookies();
		 * //driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		 * driver.get("http://the-internet.herokuapp.com/basic_auth");
		 * Thread.sleep(4000);
		 */
		
		System.out.println("Test");
		
		
		LocalDate date1 = LocalDate.of(2018, 01, 1);
        LocalDate date2 = LocalDate.of(2023, 9, 15);
        
        long daysDifference = ChronoUnit.DAYS.between(date1, date2);
        
        System.out.println(daysDifference);
        // Calculate the difference between the two dates in weeks
        long weeksDifference = ChronoUnit.WEEKS.between(date1, date2);

        // Calculate the difference between the two dates in months
        long monthsDifference = ChronoUnit.MONTHS.between(date1, date2);

        // Calculate the difference between the two dates in years
        long yearsDifference = ChronoUnit.YEARS.between(date1, date2);

        System.out.println("Days difference: " + daysDifference);
        System.out.println("Weeks difference: " + weeksDifference);
        System.out.println("Months difference: " + monthsDifference);
        System.out.println("Years difference: " + yearsDifference);

        
        SimpleDateFormat sf  =new SimpleDateFormat("yyyy-mm-dd");
        Calendar cal = Calendar.getInstance();
		cal.setTime(sf.parse("2017-03-10"));
		System.out.println(sf.format(cal.getTime()));
		
	    Calendar cal1 = Calendar.getInstance();
			cal1.setTime(sf.parse("2017-03-11"));
			
			int compareTo = cal1.compareTo(cal);
			
			
	}
}
