package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class VerticalSign {
    public static List<String> sign() {
        List<String> sign = new ArrayList<>();
        for (int i = 1; i<=3; i++) {
            sign.add(" : ");
            sign.add(" : ");
            sign.add(" | ");
        }
        return sign;
    }

}
