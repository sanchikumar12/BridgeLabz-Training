public class TrigonometryCalculator {

    // Method to calculate sin, cos, tan for a given angle in degrees
    public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);  // Convert degrees → radians

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        TrigonometryCalculator calc = new TrigonometryCalculator();

        double angle = 45; // Example input
        double[] results = calc.calculateTrigonometricFunctions(angle);

        System.out.println("Angle: " + angle + " degrees");
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
    }
}
