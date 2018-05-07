package com.kodilla.good.patterns.challenges.VerysMallAirlines;

import java.util.List;
import java.util.Scanner;

public class VMAProcessor {
    public static void process() {
        List<Flight> flightsList = FlightListGenerator.generateFlightList();
        boolean end = false;

        while (!end) {
            char choice = Menu.makeAChoice();
            switch (choice) {
                case 'l': ListPrinter.printList(flightsList);
                break;
                case 'd': FlightFinder.findDeparture(flightsList);
                break;
                case 'a': FlightFinder.findArrival(flightsList);
                break;
                case 'c': FlightFinder.findDirect(flightsList);
                break;
                case 'i': FlightFinder.findIndirect(flightsList);
                break;
                case 'e': end = true;
                break;
                default:  System.out.println("This is not allowed!");
            }
        }

    }
}
