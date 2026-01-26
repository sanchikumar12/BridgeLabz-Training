package com.travellog;

import java.io.*;
import java.util.*;

public class TravelLogWriter {
    public static void main(String[] args) throws Exception {

        List<Trip> trips = List.of(
            new Trip("Visited Paris and Rome", "France", 7),
            new Trip("Explored Berlin and Munich", "Germany", 4),
            new Trip("Paris, London, Paris again", "UK", 10),
            new Trip("Rome and Venice trip", "Italy", 6)
        );

        ObjectOutputStream oos =
            new ObjectOutputStream(new FileOutputStream("trips.dat"));

        oos.writeObject(trips);
        oos.close();

        System.out.println("Trips saved successfully.");
    }
}
