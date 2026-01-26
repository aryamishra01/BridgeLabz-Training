package com.day1.travellog;

import java.io.*;
import java.util.*;

public class TravelFileUtil {

    static String FILE = "trips.dat";

    // WRITE
    public static void saveTrips(List<Trip> trips) throws Exception {
        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream(FILE));
        oos.writeObject(trips);
        oos.close();
    }

    // READ
    public static List<Trip> loadTrips() throws Exception {
        File f = new File(FILE);
        if (!f.exists()) return new ArrayList<>();

        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream(FILE));
        List<Trip> trips = (List<Trip>) ois.readObject();
        ois.close();
        return trips;
    }
}

