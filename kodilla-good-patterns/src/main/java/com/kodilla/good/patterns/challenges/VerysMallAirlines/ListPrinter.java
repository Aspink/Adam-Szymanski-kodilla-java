package com.kodilla.good.patterns.challenges.VerysMallAirlines;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class ListPrinter {
    public static void printList(List<Flight> list) {
        System.out.println("List of Verys Mall Airlines all flights:");
        list.stream()
                .forEach(System.out::println);
    }

    public static void printDeparture(List<Flight> list, String departureAirport) {
        System.out.println("List of Verys Mall Airlines flights starting in " + departureAirport +":");
        list.stream()
                .filter((s) -> s.getDepartureAirport().equals(departureAirport))
                .forEach(System.out::println);
    }

    public static void printArrival(List<Flight> list, String arrivalAirport) {
        System.out.println("List of Verys Mall Airlines flights ending in " + arrivalAirport +":");
        list.stream()
                .filter((s) -> s.getArrivalAirport().equals(arrivalAirport))
                .forEach(System.out::println);
    }

    public static void printDirect(List<Flight> flightsList, String departureAirport, String arrivalAirport) {
        System.out.println("List of Verys Mall Airlines connection from " + departureAirport +
                " to " + arrivalAirport +":");
        flightsList.stream()
                .filter((s) -> s.getDepartureAirport().equals(departureAirport))
                .filter((s) -> s.getArrivalAirport().equals(arrivalAirport))
                .forEach(System.out::println);
    }

    public static void printAllIndirect(List<Flight> flightsList, String departureAirport, String arrivalAirport) {
        System.out.println("List of Verys Mall Airlines connection from " + departureAirport +" to " + arrivalAirport + " with 1 change:");
        List<Flight> departureList = flightsList.stream()
                .filter((s) -> s.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());

        for(Flight flight:departureList) {
            try {
                Flight secondFlight = flightsList.stream()
                        .filter ((s) -> s.getArrivalAirport().equals(arrivalAirport))
                        .filter ((s) -> s.getDepartureAirport().equals(flight.getArrivalAirport()))
                        .filter ((s) -> s.getDepartureTime().isAfter(flight.getArrivalTime()))
                        .findFirst().get();
                System.out.println(flight + ", change to flight: " + secondFlight);
            } catch (NoSuchElementException e) {

            }

        }

    }

    public static void printIndirect(List<Flight> flightsList, String departureAirport, String arrivalAirport, String transitionalAirport) {
        System.out.println("List of Verys Mall Airlines connection from " + departureAirport +" to " + arrivalAirport +
                " with change in " + transitionalAirport);
        List<Flight> departureList = flightsList.stream()
                .filter((s) -> s.getDepartureAirport().equals(departureAirport))
                .filter((s) -> s.getArrivalAirport().equals((transitionalAirport)))
                .collect(Collectors.toList());

        for(Flight flight:departureList) {
            try {Flight secondFlight = flightsList.stream()
                    .filter ((s) -> s.getArrivalAirport().equals(arrivalAirport))
                    .filter ((s) -> s.getDepartureAirport().equals(flight.getArrivalAirport()))
                    .filter ((s) -> s.getDepartureTime().isAfter(flight.getArrivalTime()))
                    .findFirst().get();
                System.out.println(flight + ", change to flight: " + secondFlight);
            } catch (NoSuchElementException e) {

            }

        }

    }
}
