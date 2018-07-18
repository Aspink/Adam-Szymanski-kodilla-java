package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }
    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        System.out.println("\n" + description);
        System.out.println("Price: " + theOrder.getCost().setScale(2, RoundingMode.HALF_DOWN) + " PLN");
        //Then
        assertEquals("Pizza with cheese and tomato sauce", description);
    }
    @Test
    public void testPizzaFatCrustAnchoisPepperoniExtraCheeseOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new FatCrustPizzaDecorator(theOrder);
        theOrder = new AnchoisPizzaDecorator(theOrder);
        theOrder = new PepperoniPizzaDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost().setScale(2, RoundingMode.HALF_DOWN);
        //Then
        assertEquals(new BigDecimal(22).setScale(2, RoundingMode.HALF_DOWN), calculatedCost.setScale(2, RoundingMode.HALF_DOWN));
    }
    @Test
    public void testPizzaFatCrustAnchoisPepperoniExtraCheeseOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new FatCrustPizzaDecorator(theOrder);
        theOrder = new AnchoisPizzaDecorator(theOrder);
        theOrder = new PepperoniPizzaDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        System.out.println("\n" + description);
        System.out.println("Price: " + theOrder.getCost().setScale(2, RoundingMode.HALF_DOWN) + " PLN");
        //Then
        assertEquals("Pizza with cheese and tomato sauce on a fat crust, with Anchois, with Pepperoni, + extra cheese,", description);
    }
    @Test
    public void testPizzaThinCrustBaconJalapenoSauceOfHotJoyGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ThinCrustPizzaDecorator(theOrder);
        theOrder = new BaconPizzaDecorator(theOrder);
        theOrder = new JalapenoPizzaDecorator(theOrder);
        theOrder = new SauceOfHotJoyPizzaDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost().setScale(2, RoundingMode.HALF_DOWN);
        //Then
        assertEquals(new BigDecimal(19.20).setScale(2, RoundingMode.HALF_DOWN), calculatedCost.setScale(2, RoundingMode.HALF_DOWN));
    }
    @Test
    public void testPizzaThinCrustBaconJalapenoSauceOfHotJoyGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ThinCrustPizzaDecorator(theOrder);
        theOrder = new BaconPizzaDecorator(theOrder);
        theOrder = new JalapenoPizzaDecorator(theOrder);
        theOrder = new SauceOfHotJoyPizzaDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        System.out.println("\n" + description);
        System.out.println("Price: " + theOrder.getCost().setScale(2, RoundingMode.HALF_DOWN) + " PLN");
        //Then
        assertEquals("Pizza with cheese and tomato sauce on a thin crust, with backon, with Jalapeno, + a sauce of hot joy,", description);
    }
    @Test
    public void testPizzaBlueCheeseMushroomsSauceIslandOfJoyGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BlueCheesePizzaDecorator(theOrder);
        theOrder = new MushroomsPizzaDecorator(theOrder);
        theOrder = new SauceIslandOfJoyPizzaDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost().setScale(2, RoundingMode.HALF_DOWN);
        //Then
        assertEquals(new BigDecimal(22.50).setScale(2, RoundingMode.HALF_DOWN), calculatedCost.setScale(2, RoundingMode.HALF_DOWN));
    }
    @Test
    public void testPizzaBlueCheeseMushroomsSauceIslandOfJoyGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BlueCheesePizzaDecorator(theOrder);
        theOrder = new MushroomsPizzaDecorator(theOrder);
        theOrder = new SauceIslandOfJoyPizzaDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        System.out.println("\n" + description);
        System.out.println("Price: " + theOrder.getCost().setScale(2, RoundingMode.HALF_DOWN) + " PLN");
        //Then
        assertEquals("Pizza with cheese and tomato sauce with blue cheese, with mushrooms, + sauce island of joy,", description);
    }
}
