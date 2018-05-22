package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public final static int MIN_BURGER = 1;
    public final static int MAX_BURGER = 3;

    public static List<String> bunTypes() {
        List<String> bunTypes = new ArrayList<>();
        bunTypes.add("with sesame");
        bunTypes.add("without sesame");
        return bunTypes;
    }

    public static int getBurgerMin() {
        return MIN_BURGER;
    }

    public static int getBurgerMax() {
        return MAX_BURGER;
    }

    public static List<String> sauceTypes() {
        List<String> sauceTypes = new ArrayList<>();
        sauceTypes.add("standard");
        sauceTypes.add("1000 islands");
        sauceTypes.add("barbecue");
        return sauceTypes;
    }

    public static List<String> ingredientTypes() {
        List<String> ingredientTypeList = new ArrayList<>();
        ingredientTypeList.add("salad");
        ingredientTypeList.add("onion");
        ingredientTypeList.add("bacon");
        ingredientTypeList.add("cucumber");
        ingredientTypeList.add("chilli peppers");
        ingredientTypeList.add("mushrooms");
        ingredientTypeList.add("shrimp");
        ingredientTypeList.add("cheese");
        return ingredientTypeList;
    }
}
