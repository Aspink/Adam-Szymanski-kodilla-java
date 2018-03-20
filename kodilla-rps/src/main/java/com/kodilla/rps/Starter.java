package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Starter {
    public static Game startGame() {
        int max = 250;
        final List<Player> players = new ArrayList<>();
        final List<Warrior> warriors = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me your name!");
        String name = sc.next();
        while (name.equals("Computer")||name.equals("computer")) {
            System.out.println("Do not make a fool of me! " + name + " is MY name!\nGive me YOUR name!");
            name = sc.next();
        }
        System.out.println("So, Your name is " + name + ". I'm Computer!");

        System.out.println("How meny times you want to lose?");
        int pointsToWin = sc.nextInt();
        while ((pointsToWin<1)||(pointsToWin>max)) {
            if(pointsToWin>250) System.out.println("Be serious! Do you have eternity to play? I don't have that much time!" +
                    "\nSo - how many time? Not more than " + max);
            if (pointsToWin<1) System.out.println("Are you joking with me? It will not work!\nSo - how many time? Not less than 1!");
            pointsToWin = sc.nextInt();
        }

        System.out.println("Game instruction:\n" +
                "[1] - rock, [2] - paper, [3] - scissors, [x] - exit, [n] - new game");

        //players list
        Player human = new Player(name);
        Player computer = new Player("Computer");
        players.add(human);
        players.add(computer);

        //warriors list
        Warrior rock = new Warrior("rock");
        Warrior paper = new Warrior("paper");
        Warrior scissors = new Warrior("scissors");
        scissors.addLoser(paper);
        rock.addLoser(scissors);
        paper.addLoser(rock);

        warriors.add(rock);
        warriors.add(paper);
        warriors.add(scissors);

        Game newGame = new Game(players, warriors, pointsToWin);

        return newGame;
    }
}
