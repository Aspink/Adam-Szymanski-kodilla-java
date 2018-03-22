package com.kodilla.exception.test;

import org.junit.Assert;
import org.junit.Test;

public class FlightFinderTestSuite {
    @Test
    public void testFindFlightAirportAvailable() {
        //Given
        Flight flight = new Flight("Ataturk", "Heathrow");
        boolean isAvailable = false;

        //When
        try {
            isAvailable = FlightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            boolean isException = true;
        }

        //Then
        Assert.assertTrue(isAvailable);
    }

    @Test
    public void testFindFlightAirportUnavailable() {
        //Given
        Flight flight = new Flight("Ataturk", "O'Hare");
        boolean isAvailable = true;

        //When
        try {
            isAvailable = FlightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            boolean isException = true;
        }

        //Then
        Assert.assertTrue(!isAvailable);
    }

    @Test
    public void testFindFlightAirportNotInMap() {
        //Given
        Flight flight = new Flight("Ataturk", "Kozia Wólka");
        boolean isAvailable = false;
        boolean isException = false;

        //When
        try {
            isAvailable = FlightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            isException = true;
        }

        //Then
        Assert.assertTrue(isException);
    }
}
