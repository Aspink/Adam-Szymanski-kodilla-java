package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.ShapeCollector;
import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testCircleField() {
        //Given
        Circle circle = new Circle(2.15);

        //When

        //Then
        Assert.assertEquals(14.5220120412, circle.getField(), 0.000000001);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2.15);


        //When
        shapeCollector.addFigure(circle);

        //Then
        Assert.assertEquals(1, shapeCollector.shapes.size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2.15);
        shapeCollector.addFigure(circle);

        //When
        shapeCollector.removeFigure(circle);

        //Then
        Assert.assertEquals(0, shapeCollector.shapes.size());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2.15);
        Square square = new Square(4.5);
        Triangle triangle = new Triangle(4, 5);

        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        //Then
        Assert.assertEquals(triangle, shapeCollector.getFigure(2));
    }

    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2.15);

        //When
        boolean result = shapeCollector.removeFigure(circle);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testGetFigureNotExisting() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        Shape result = shapeCollector.getFigure(1);

        //Then
        Assert.assertEquals(null, result);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2.15);
        Square square = new Square(4.5);
        Triangle triangle = new Triangle(4, 5);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        //When
        boolean result = shapeCollector.showFigures();

        //Then
        Assert.assertTrue(result);

    }
}

