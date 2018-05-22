package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {@Test
public void testPizzaNew() {
    //Given
    Bigmac bigMac = new Bigmac.BigmacBuilder()
            .ingredient("onion")
            .bun("with sesame")
            .sauce("1000 islands")
            .ingredient("shrimp")
            .ingredient("mushrooms")
            .burgers(2)
            .ingredient("chilli peppers")
            .build();
    System.out.println(bigMac);
    //When
    int howManyIngredients = bigMac.getIngredients().size();
    //Then
    Assert.assertEquals(4, howManyIngredients);
}
}
