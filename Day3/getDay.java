import java.util.*;

// Class that contains the logic
class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function returns the day of the week for a given date.
     * month: 1-12
     * day: 1-31
     * year: full year (e.g., 2005)
     */
    public static String findDay(int month, int day, int year) {

        // Create a Calendar instance
        Calendar cal = Calendar.getInstance();

        // Set the date: months in Calendar start at 0, so subtract 1 from month
        cal.set(year, month - 1, day);

        // Get the day of week as a number (Sunday = 1, Monday = 2, ..., Saturday = 7)
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        // Array of day names
        String[] days = {
            "SUNDAY",
            "MONDAY",
            "TUESDAY",
            "WEDNESDAY",
            "THURSDAY",
            "FRIDAY",
            "SATURDAY"
        };

        // Convert day number to array index (0-based) and return the day name
        return days[dayOfWeek - 1];
    }
}

// Main class
public class getDay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read input as one line (e.g., "08 05 2005")
        String[] input = sc.nextLine().split(" ");

        int month = Integer.parseInt(input[0]);
        int day = Integer.parseInt(input[1]);
        int year = Integer.parseInt(input[2]);

        // Call the function and print result
        String result = Result.findDay(month, day, year);
        System.out.println(result);

        sc.close();
    }
}



/*
Output : 

08 05 2005
FRIDAY

*/