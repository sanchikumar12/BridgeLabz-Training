package Day_12_Hackerrank;

enum TrafficLight {
    RED(30),
    YELLOW(5),
    GREEN(25);

    private final int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}

public class Q7 {
    public static void main(String[] args) {
        System.out.println("=== Traffic Light Signal Timings ===");
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println("Light: " + light.name() + " -> Duration: " + light.getDuration() + " seconds");
        }
    }
}
