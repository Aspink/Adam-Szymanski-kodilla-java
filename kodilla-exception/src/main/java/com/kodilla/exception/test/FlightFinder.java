package com.kodilla.exception.test;

import java.util.stream.Collector;
import java.util.stream.Stream;
import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public static boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String,Boolean> airportMap = new HashMap<>();
        airportMap.put("Heathrow", true);
        airportMap.put("O'Hare", false);
        airportMap.put("Frankfurt", false);
        airportMap.put("Chopin's", true);
        airportMap.put("Ataturk", false);
        airportMap.put("PrincessJuliana", false);

        if (airportMap.containsKey(flight.getArrivalAirport())) {
            Boolean isArrival = airportMap.entrySet().stream()
                    .filter(e -> e.getKey().equals(flight.getArrivalAirport()))
                    .map(Map.Entry::getValue)
                    .allMatch(e -> e == true);
            return isArrival;
        } else {
            throw new RouteNotFoundException("Arrival airport not found");
        }


    }
}
