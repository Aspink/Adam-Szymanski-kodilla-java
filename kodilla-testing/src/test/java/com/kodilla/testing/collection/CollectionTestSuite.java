package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> allNumbers = new ArrayList<Integer>();

        //When
        ArrayList<Integer> result = new ArrayList<Integer>();
        result = OddNumbersExterminator.exterminate(allNumbers);
        System.out.println("Testing empty list");
        //Then
        Assert.assertTrue(result.isEmpty());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        Integer allNumbs[] = new Integer[]{1,2,3,5,7,10,8,45,32,17,2564,120};
        Integer evenNumbs[] = new Integer[] {2,10,8,32,2564,120};
        ArrayList<Integer> allNumbers = new ArrayList<Integer>(Arrays.asList(allNumbs));
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>(Arrays.asList(evenNumbs));
        //When
        ArrayList<Integer> result = new ArrayList<Integer>();
        result = OddNumbersExterminator.exterminate(allNumbers);
        System.out.println("Testing normal list");
        //Then
        Assert.assertEquals(evenNumbers, result);
    }
}
