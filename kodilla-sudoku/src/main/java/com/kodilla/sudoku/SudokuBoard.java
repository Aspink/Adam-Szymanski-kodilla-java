package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    private final String underlineNormal = "|---:---:---+---:---:---+---:---:---|";
    private final String underlineBold = "+===+===+===+===+===+===+===+===+===+";
    List<String> vertical = new ArrayList<>();
    List<SudokuRow> board = new ArrayList<>();

    public SudokuBoard() {
        for(int i = 0; i<=8; i++) {
            SudokuRow row = new SudokuRow();
            this.board.add(row);
        }
    }

    boolean setValue(int column, int row, int value) {
        boolean isDone = board.get(row).setValue(column, value);
        return isDone;
    }

    Integer getValue(int column, int row) {
        Integer value = board.get(row).row.get(column).getValue();
        return value;
    }

    @Override
    public String toString() {
        vertical = VerticalSign.sign();
        String sudokuBoardImage = underlineBold;
        for (int row = 0; row<=8; row++) {
            sudokuBoardImage = sudokuBoardImage + "\n| ";
            for(int column = 0; column<=8; column++) {
                sudokuBoardImage = sudokuBoardImage + board.get(row).row.get(column).toString() + vertical.get(column);
            }
            sudokuBoardImage = sudokuBoardImage + "\n";
            if (row == 2 || row == 5 || row == 8){
                sudokuBoardImage = sudokuBoardImage + underlineBold;
            } else {
                sudokuBoardImage = sudokuBoardImage + underlineNormal;
            }


        }

        return sudokuBoardImage;
    }
}
