package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {15, 24, 4, 82, 0, 1, 77, 35, 124, 59, 49};

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(42.727273, average, 0.000001);
    }
}
