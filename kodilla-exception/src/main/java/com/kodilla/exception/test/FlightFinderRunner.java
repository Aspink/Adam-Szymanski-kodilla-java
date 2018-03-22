package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Heathrow", "Kozia Wólka");


        try {
            if (FlightFinder.findFlight(flight)) {
                System.out.println("Arrival airport " + flight.getArrivalAirport() +
                " is available!\nYou can fly from " + flight.getDepartureAirport() +
                " to " + flight.getArrivalAirport() + ".");
            } else {
                System.out.println("Arrival airport " + flight.getArrivalAirport() +
                        " is unavailable!\nYou can't fly from " + flight.getDepartureAirport() +
                        " to " + flight.getArrivalAirport() + ".");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("There is no information on the availability of the arrival airport! Sorry!");
        } finally {
            System.out.println("Have a nice trip!");
        }
    }

}
