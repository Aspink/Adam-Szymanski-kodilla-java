package com.kodilla.rps;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args){
        boolean end = false;
        Scanner sc = new Scanner(System.in);
        Game game = Starter.startGame();
        List<Player> players = game.getPlayers();
        List<Warrior> warriors = game.getWarriors();

        Warrior humanWarrior;
        Warrior computerWarrior;

        Random randomGenerator = new Random();
        int randomInt;

        while (!end) {
            System.out.println("Your move! Press the key!");
            char move = sc.next().charAt(0);
            while ((move != '1')&(move !='2')&(move != '3')&(move !='x')&(move != 'n')){
                System.out.println("That's not allowed! Choice [1], [2], [3], [x] or [n].");
                move = sc.next().charAt(0);
            }
            switch (move) {
                case 'x':
                    System.out.println("Are you sure, that you want to end the game? [y/n]");
                    move = sc.next().charAt(0);
                    if (move == 'y'||move == 'Y')end = true;
                    break;
                case 'n':
                    System.out.println("Are you sure, that you want to end current game? [y/n]");
                    move = sc.next().charAt(0);
                    if (move == 'y'||move == 'Y'){
                        game = Starter.startGame();
                        players = game.getPlayers();
                        warriors = game.getWarriors();
                    }
                    break;
                default:
                    humanWarrior = warriors.get(Character.getNumericValue(move)-1);
                    randomInt = randomGenerator.nextInt(3);
                    computerWarrior = warriors.get(randomInt);
                    System.out.println("human: " + humanWarrior.getWarriorName() + ", computer: " + computerWarrior.getWarriorName());
                    if (humanWarrior.getLosers().contains(computerWarrior)) {
                        players.get(0).increasePlayerPoints();
                        System.out.println("This time you succeeded!");
                    } else if (humanWarrior.equals(computerWarrior)) System.out.println("Dead-heat, this time!");
                    else {
                        players.get(1).increasePlayerPoints();
                        System.out.println("I got you!");
                    }
                    System.out.println("You: " + players.get(0).getPlayerPoints() + " points,   me: " + players.get(1).getPlayerPoints()
                            + " points");
                    break;
            }

            if (players.get(0).getPlayerPoints() >= game.getPointsToWin()) {
                System.out.println("You win the game! I don't know, how you did it!\n" +
                        "Choir: " + players.get(0).getPlayerName() + " is the best! " +
                        players.get(0).getPlayerName() + " is great! " + players.get(0).getPlayerName() +" is born to win!");
                end = true;
            }

            if (players.get(1).getPlayerPoints() >= game.getPointsToWin()) {
                System.out.println("You are loser! I'm the best!\n" +
                        "Choir: " + players.get(1).getPlayerName() + " is the best! " +
                        players.get(1).getPlayerName() + " is great! " + players.get(1).getPlayerName() +" is born to win!");
                end = true;
            }




        }

    }
}
