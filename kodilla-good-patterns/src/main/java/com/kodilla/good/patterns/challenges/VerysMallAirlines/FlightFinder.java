package com.kodilla.good.patterns.challenges.VerysMallAirlines;

import java.util.List;
import java.util.Scanner;

public class FlightFinder {
    public static void findDeparture(List<Flight> flightsList) {
        System.out.println("Write departure city:");
        String city = CityScanner.scanCity();
        ListPrinter.printDeparture(flightsList, city);
    }

    public static void findArrival(List<Flight> flightsList) {
        System.out.println("Write arrival city:");
        String city = CityScanner.scanCity();
        ListPrinter.printArrival(flightsList, city);
    }

    public static void findDirect(List<Flight> flightsList) {
        System.out.println("Write departure city:");
        String departureCity = CityScanner.scanCity();
        System.out.println("Write arrival city:");
        String arrivalCity = CityScanner.scanCity();
        ListPrinter.printDirect(flightsList, departureCity, arrivalCity);
    }

    public static void findIndirect(List<Flight> flightsList) {
        System.out.println("Write departure city:");
        String departureCity = CityScanner.scanCity();
        System.out.println("Write arrival city:");
        String arrivalCity = CityScanner.scanCity();
        System.out.println("Write transitional city (any character to skip):");
        String transitionalCity = CityScanner.scanCity();
        if(transitionalCity.length() < 2) {
            ListPrinter.printAllIndirect(flightsList, departureCity, arrivalCity);
        } else {
            ListPrinter.printIndirect(flightsList, departureCity, arrivalCity, transitionalCity);
        }
    }
}
