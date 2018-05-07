package com.kodilla.good.patterns.challenges.VerysMallAirlines;

import java.time.LocalDate;
import java.time.LocalTime;

public class Flight {
    private final String departureAirport;
    private final LocalTime departureTime;
    private final String arrivalAirport;
    private final LocalTime arrivalTime;

    public Flight(final String departureAirport, final LocalTime departureTime, final String arrivalAirport, final LocalTime arrivalTime) {
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.arrivalAirport = arrivalAirport;
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public String toString() {
        return "departure: " + departureAirport + ", " + departureTime +
                " ; arrival: " + arrivalAirport + ", " + arrivalTime;
    }
}
