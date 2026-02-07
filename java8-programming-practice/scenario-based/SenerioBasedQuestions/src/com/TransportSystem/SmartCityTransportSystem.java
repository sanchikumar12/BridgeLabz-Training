import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SmartCityTransportSystem {
    public static void main(String[] args) {

        List<TransportService> services = Arrays.asList(
                new BusService("A-B",20,540),
                new MetroService("A-C",35,520),
                new TaxiService("B-C",50,530),
                new BusService("A-C",25,560)
        );

        // 1. Lambda + Sorting
        System.out.println("Filtered & Sorted Services:");
        services.stream()
                .filter(s -> s.getFare() <= 40)
                .sorted(Comparator.comparingDouble(TransportService::getFare))
                .forEach(TransportService::printServiceDetails);

        // 2. Functional Interface
        FareCalculator calc = d -> 10 + d * 8;
        System.out.println("\nTaxi Fare (5km): " + calc.calculateFare(5));

        // 3. ForEach Dashboard
        System.out.println("\nLive Dashboard:");
        services.forEach(System.out::println);

        // Passenger data
        List<Passenger> passengers = Arrays.asList(
                new Passenger("A-B",20,30),
                new Passenger("A-C",35,40),
                new Passenger("A-C",25,36),
                new Passenger("B-C",50,25)
        );

        // 4. groupingBy
        System.out.println("\nPassengers by Route:");
        passengers.stream()
                .collect(Collectors.groupingBy(p -> p.route))
                .forEach((r,p)->System.out.println(r+" -> "+p.size()));

        // 5. partitioningBy
        Map<Boolean,List<Passenger>> peak =
                passengers.stream().collect(
                        Collectors.partitioningBy(p -> p.time >= 35)
                );
        System.out.println("\nPeak Trips: " + peak.get(true).size());

        // 6. summarizingDouble
        DoubleSummaryStatistics stats =
                passengers.stream().collect(
                        Collectors.summarizingDouble(p -> p.fare)
                );
        System.out.println("Total Revenue: " + stats.getSum());

        // 7. Marker Interface
        TransportService amb = new Ambulance();
        if (amb instanceof EmergencyService)
            System.out.println("\nEmergency Service Priority Granted 🚨");
    }
}