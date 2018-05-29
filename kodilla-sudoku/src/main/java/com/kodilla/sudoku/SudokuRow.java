package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    List<SudokuElement> row = new ArrayList<>();

    public SudokuRow() {
        for(int i = 0; i<=8; i++) {
            SudokuElement element = new SudokuElement();
            this.row.add(element);
        }
    }

    public boolean setValue (int column, int value) {
        boolean isDone = this.row.get(column).setValue(value);
        return isDone;
    }
}
