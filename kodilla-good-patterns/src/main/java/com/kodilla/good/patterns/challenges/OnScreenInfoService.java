package com.kodilla.good.patterns.challenges;

public class OnScreenInfoService implements InformationService {
    public void inform (User user) {
        System.out.println("Hello, " + user.getUserName() + ", your request is approved!");
    }
}
