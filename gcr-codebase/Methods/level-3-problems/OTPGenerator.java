import java.util.Scanner;

public class OTPGenerator {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        // Generates numbers from 100000 to 999999
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check whether all OTPs in the array are unique
    public static boolean areOTPsUnique(int[] otps) {

        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {

        int[] otpArray = new int[10];
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }
        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }
        if (areOTPsUnique(otpArray)) {
            System.out.println("\nAll generated OTPs are unique ✔");
        } else {
            System.out.println("\nDuplicate OTPs found ✖");
        }
    }
}
