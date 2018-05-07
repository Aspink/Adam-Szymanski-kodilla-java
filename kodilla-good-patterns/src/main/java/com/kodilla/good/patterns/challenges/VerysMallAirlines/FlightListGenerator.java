package com.kodilla.good.patterns.challenges.VerysMallAirlines;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FlightListGenerator {
    public static List<Flight> generateFlightList(){
        final List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Warszawa", LocalTime.of(6,12), "Kraków", LocalTime.of(7,07)));
        flightList.add(new Flight("Warszawa", LocalTime.of(6,22), "Rzeszów", LocalTime.of(7,12)));
        flightList.add(new Flight("Kraków", LocalTime.of(7,30), "Gdańsk", LocalTime.of(8,50)));
        flightList.add(new Flight("Kraków", LocalTime.of(7,37), "Warszawa", LocalTime.of(8,27)));
        flightList.add(new Flight("Rzeszów", LocalTime.of(7,40), "Kraków", LocalTime.of(8,30)));
        flightList.add(new Flight("Warszawa", LocalTime.of(8,55), "Wrocław", LocalTime.of(9,50)));
        flightList.add(new Flight("Kraków", LocalTime.of(9,00), "Wrocław", LocalTime.of(9,55)));
        flightList.add(new Flight("Gdańsk", LocalTime.of(9,15), "Warszawa", LocalTime.of(10,15)));
        flightList.add(new Flight("Wrocław", LocalTime.of(10,20), "Warszawa", LocalTime.of(11,15)));
        flightList.add(new Flight("Wrocław", LocalTime.of(10,30), "Poznań", LocalTime.of(11,10)));
        flightList.add(new Flight("Warszawa", LocalTime.of(10,45), "Kraków", LocalTime.of(11,40)));
        flightList.add(new Flight("Poznań", LocalTime.of(11,40), "Gdańsk", LocalTime.of(13,10)));
        flightList.add(new Flight("Warszawa", LocalTime.of(11,50), "Poznań", LocalTime.of(12,45)));
        flightList.add(new Flight("Poznań", LocalTime.of(13,15), "Warszawa", LocalTime.of(14,10)));
        flightList.add(new Flight("Gdańsk", LocalTime.of(13,40), "Warszawa", LocalTime.of(14,40)));
        flightList.add(new Flight("Warszawa", LocalTime.of(15,10), "Wrocław", LocalTime.of(16,05)));
        flightList.add(new Flight("Warszawa", LocalTime.of(15,40), "Gdańsk", LocalTime.of(16,40)));
        flightList.add(new Flight("Wrocław", LocalTime.of(16,35), "Warszawa", LocalTime.of(17,30)));
        flightList.add(new Flight("Gdańsk", LocalTime.of(17,10), "Poznań", LocalTime.of(18,40)));
        flightList.add(new Flight("Warszawa", LocalTime.of(18,00), "Poznań", LocalTime.of(18,55)));
        flightList.add(new Flight("Poznań", LocalTime.of(19,10), "Wrocław", LocalTime.of(19,50)));
        flightList.add(new Flight("Poznań", LocalTime.of(19,25), "Warszawa", LocalTime.of(20,20)));
        flightList.add(new Flight("Wrocław", LocalTime.of(20,20), "Kraków", LocalTime.of(21,15)));
        flightList.add(new Flight("Kraków", LocalTime.of(21,30), "Rzeszów", LocalTime.of(22,20)));
        flightList.add(new Flight("Rzeszów", LocalTime.of(22,50), "Warszawa", LocalTime.of(23,40)));
        return flightList;
    }
}
