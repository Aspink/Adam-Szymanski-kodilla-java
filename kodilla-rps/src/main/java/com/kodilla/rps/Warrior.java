package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Warrior {
    private String warriorName;
    List<Warrior> losers = new ArrayList<>();

    public Warrior(String warriorName) {
        this.warriorName = warriorName;
    }
    public void addLoser(Warrior loser) {
        losers.add(loser);
    }

    public String getWarriorName() {
        return warriorName;
    }

    public List<Warrior> getLosers() {
        return new ArrayList<Warrior>(losers);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Warrior warrior = (Warrior) o;
        return Objects.equals(warriorName, warrior.warriorName);
    }
}
