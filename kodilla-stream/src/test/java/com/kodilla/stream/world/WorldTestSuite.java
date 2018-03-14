package com.kodilla.stream.world;

import com.kodilla.stream.sand.Asia;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent asia = new Continent();
        Continent europe = new Continent();
        Continent australiaAndOceania = new Continent();

        Country China = new Country(new BigDecimal("1379302771"));
        Country Japan = new Country(new BigDecimal("126451398"));
        Country Mongolia = new Country(new BigDecimal("3119935"));
        Country Poland = new Country(new BigDecimal("38422346"));
        Country France = new Country(new BigDecimal("67158000"));
        Country Italy = new Country(new BigDecimal("60788140"));
        Country Hungary = new Country(new BigDecimal("9849000"));
        Country Australia = new Country(new BigDecimal("24511800"));
        Country NewZealand = new Country(new BigDecimal("4510327"));
        Country PapuaNewGuinea = new Country(new BigDecimal("6909701"));

        asia.addCountry(China);
        asia.addCountry(Japan);
        asia.addCountry(Mongolia);
        europe.addCountry(Poland);
        europe.addCountry(France);
        europe.addCountry(Italy);
        europe.addCountry(Hungary);
        australiaAndOceania.addCountry(Australia);
        australiaAndOceania.addCountry(NewZealand);
        australiaAndOceania.addCountry(PapuaNewGuinea);

        world.addContinent(asia);
        world.addContinent(europe);
        world.addContinent(australiaAndOceania);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeople = new BigDecimal("1721023418");
        Assert.assertEquals(expectedPeople, totalPeople);
    }
}
