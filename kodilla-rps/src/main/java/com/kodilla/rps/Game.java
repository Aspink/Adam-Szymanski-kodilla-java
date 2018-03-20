package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players = new ArrayList<>();
    private List<Warrior> warriors = new ArrayList<>();
    private int pointsToWin = 0;

    public Game(List<Player> players, List<Warrior> warriors, int pointsToWin) {
        this.players = players;
        this.warriors = warriors;
        this.pointsToWin = pointsToWin;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Warrior> getWarriors() {
        return warriors;
    }

    public int getPointsToWin() {
        return pointsToWin;
    }
}
