import java.util.Scanner;

public class CalenderDisplay{

    // Method to get month name
    public static String getMonthName(int month) {
        String[] months = {
                "", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return months[month];
    }

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Method to get number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {
                0, 31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month];
    }

    // Method to get first day of the month using Gregorian calendar
    public static int getFirstDay(int month, int year) {
        int d = 1;
        int y = year - (14 - month) / 12;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (d + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
    }

    // Method to display calendar
    public static void displayCalendar(int month, int year) {

        System.out.println("\n     " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        int daysInMonth = getDaysInMonth(month, year);

        // First loop → indentation before the 1st day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Second loop → display days
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        displayCalendar(month, year);

        sc.close();
    }
}

