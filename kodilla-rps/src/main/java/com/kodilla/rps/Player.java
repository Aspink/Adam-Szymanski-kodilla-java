package com.kodilla.rps;

public final class Player {
    private final String playerName;
    private int playerPoints = 0;

    public Player(final String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public void increasePlayerPoints() {
        this.playerPoints++;
    }
}
