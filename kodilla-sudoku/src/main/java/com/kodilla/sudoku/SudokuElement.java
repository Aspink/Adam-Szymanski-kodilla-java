package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SudokuElement {
    public static int EMPTY = -1;
                    private int value;
    List<Integer> possibleValues = new ArrayList<>();

    public SudokuElement() {
        this.value = EMPTY;
        for (int i = 1; i<=9; i++) {
            this.possibleValues.add((Integer)i);
        }

    }

    public int getValue() {
        return value;
    }

    public boolean setValue(int value) {
        if(possibleValues.contains((Integer)value)) {
            this.value = value;
            return true;
        } else {
            return false;
        }
    }

    public List<Integer> getPossibleValues() {
        return possibleValues;
    }

    public void removePossibleValue(Integer reVal) {
        try {
            possibleValues.remove(reVal);
        } catch (UnsupportedOperationException e) {
            System.out.println("Zaszedł tu nieprzewidziany wypadek!");;
        }
    }

    @Override
    public String toString() {
        if(value == -1) {
            return " ";
        }
        return Integer.toString(value);
    }
}
