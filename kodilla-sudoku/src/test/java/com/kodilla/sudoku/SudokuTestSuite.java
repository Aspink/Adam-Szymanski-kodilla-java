package com.kodilla.sudoku;

import org.junit.Assert;
import org.junit.Test;

public class SudokuTestSuite {
    @Test
    public void SudokuElementTest() {
        //Given
        SudokuElement sudokuElement = new SudokuElement();

        //When
        System.out.println("\nWartość elementu: " + sudokuElement.getValue());
        System.out.println("\nLista możliwych wartości: " + sudokuElement.getPossibleValues());

        //Then

        sudokuElement.setValue(5);
        System.out.println("\nUstawiam wartość elementu na 5\n" + sudokuElement + "\n\nUsuwam z możliwych wartości 7, 4 i 9:\n");
        sudokuElement.removePossibleValue(7);
        sudokuElement.removePossibleValue(4);
        sudokuElement.removePossibleValue(9);
        System.out.println("\nWartość elementu: " + sudokuElement.getValue());
        System.out.println("\nLista możliwych wartości: " + sudokuElement.getPossibleValues());
        Assert.assertEquals(6, sudokuElement.getPossibleValues().size());
    }

    @Test
    public void SudokuBoardTest() {
        //Given
        SudokuBoard sudokuBoard = new SudokuBoard();

        //When
        System.out.println("\nPlansza Sudoku po inicjalizacji:\n" + sudokuBoard);
        System.out.println("\nWartość komórki w kolumnie 5, rząd 0:\n" + sudokuBoard.getValue(5,0));

        //Then
        sudokuBoard.setValue(5, 0, 3);
        sudokuBoard.setValue(4, 4, 9);
        sudokuBoard.setValue(0, 3, 6);
        System.out.println("\n Wartość komórki w kolumnie 5, rząd 0:\n" + sudokuBoard.getValue(5,0));
        System.out.println(  "\nPlansza Sudoku po zmianach:\n" + sudokuBoard);
        Assert.assertEquals(3, (int)sudokuBoard.getValue(5,0));
        Assert.assertEquals(9, (int)sudokuBoard.getValue(4,4));
        Assert.assertEquals(6, (int)sudokuBoard.getValue(0,3));
        Assert.assertEquals(-1, (int)sudokuBoard.getValue(0,5));
    }
}
