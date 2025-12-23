import java.util.*;
public class UnitConvertor {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yardstofeet = 3;
        return yards * yardstofeet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feettoyards = 0.333333;
        return feet * feettoyards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meterstoinches = 39.3701;
        return meters * meterstoinches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inchestometers = 0.0254;
        return inches * inchestometers;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inchestocm = 2.54;
        return inches * inchestocm;
    }

    public static void main(String [] args){
          Scanner sc = new Scanner(System.in);

          // Taking input from user
          double yards = sc.nextInt();
          double feet = sc.nextInt();
          double meters = sc.nextInt();
          double inches = sc.nextInt(); 

          // Displaying the output 
          System.out.println("Yard to feet conversion" + convertYardsToFeet(yards));
          System.out.println("Yard to feet conversion" + convertFeetToYards(feet));
          System.out.println("Yard to feet conversion" +  convertMetersToInches(meters));
          System.out.println("Yard to feet conversion" + convertInchesToMeters(inches));
          System.out.println("Yard to feet conversion" + convertInchesToCentimeters(inches));

     }
}





 