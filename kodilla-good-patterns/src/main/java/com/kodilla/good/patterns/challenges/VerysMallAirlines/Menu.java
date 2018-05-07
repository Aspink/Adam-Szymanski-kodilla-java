package com.kodilla.good.patterns.challenges.VerysMallAirlines;

import java.util.Scanner;

public class Menu {
    public static char makeAChoice() {
        System.out.println("\nmenu: \n[l] full list of connection\n[d] list of connection from city\n" +
                "[a] list of connection to city\n[c] list of direct connection from - to\n[i] list of indirect connection from - to\n" +
                "[e] exit");
        Scanner sc = new Scanner(System.in);
        char choice = sc.next().charAt(0);
        return choice;
    }
}
