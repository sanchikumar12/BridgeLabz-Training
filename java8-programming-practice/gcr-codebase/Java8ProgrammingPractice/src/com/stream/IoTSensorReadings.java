package com.stream;

import java.util.*;
import java.util.stream.*;

class SensorReading {
    String sensorId;
    double value;

    SensorReading(String sensorId, double value) {
        this.sensorId = sensorId;
        this.value = value;
    }

    @Override
    public String toString() {
        return sensorId + " -> Reading: " + value;
    }
}

public class IoTSensorReadings {
    public static void main(String[] args) {

        List<SensorReading> readings = Arrays.asList(
            new SensorReading("S1", 28.5),
            new SensorReading("S2", 35.2),
            new SensorReading("S3", 22.0),
            new SensorReading("S4", 40.8),
            new SensorReading("S5", 30.1)
        );

        double threshold = 30.0;

        readings.stream()
                .filter(a->a.value >threshold).forEach(b->System.out.println(b));
    }
}
