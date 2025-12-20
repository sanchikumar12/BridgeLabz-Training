public class SpringSeason {

    // Method to check if the given month and day fall in Spring season
    public static boolean isSpring(int month, int day) {
        // Spring season: March 20 → June 20
        if (month == 3 && day >= 20 && day <= 31) return true; // March 20–31
        if (month == 4 && day >= 1 && day <= 30) return true;  // April
        if (month == 5 && day >= 1 && day <= 31) return true;  // May
        if (month == 6 && day >= 1 && day <= 20) return true;  // June 1–20

        return false;
    }

    public static void main(String[] args) {

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        if (isSpring(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
