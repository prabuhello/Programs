package runner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class DateDifferenceExample {
    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            // Define two Date objects representing the dates you want to compare
            Date date1 = sdf.parse("2023-09-01");
            Date date2 = sdf.parse("2023-09-15");

            // Calculate the difference in milliseconds
            long differenceInMilliseconds = date2.getTime() - date1.getTime();

            // Calculate the difference in seconds, minutes, hours, and days
            long differenceInSeconds = differenceInMilliseconds / 1000;
            long differenceInMinutes = differenceInSeconds / 60;
            long differenceInHours = differenceInMinutes / 60;
            long differenceInDays = differenceInHours / 24;
            
            
            Set<Integer> s = new HashSet<Integer>();
            
           Vector<Integer> n = null;
           n.elements();
           
           List<Integer> g;
           
           
           
            
            String st="lll";

            System.out.println("Difference in milliseconds: " + differenceInMilliseconds);
            System.out.println("Difference in seconds: " + differenceInSeconds);
            System.out.println("Difference in minutes: " + differenceInMinutes);
            System.out.println("Difference in hours: " + differenceInHours);
            System.out.println("Difference in days: " + differenceInDays);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
