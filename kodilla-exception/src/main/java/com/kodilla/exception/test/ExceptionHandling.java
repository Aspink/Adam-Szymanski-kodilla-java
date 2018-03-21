package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String args[]) {

        SecondChallenge challenge = new SecondChallenge();
        String answer;
        try {
            answer = challenge.probablyIWillThrowException(2.2,1.7);
            System.out.println("The answer is: " + answer);
        } catch (Exception e) {
            System.out.println("x out of range or y = 1.5. Error: " + e);
        }
        finally {
            System.out.println();
        }

    }
}
