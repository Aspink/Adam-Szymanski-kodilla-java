package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;import java.util.List;

public class Bigmac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            if(Menu.bunTypes().contains(bun)){
                this.bun = bun;
                return this;
            } else {
                throw new IllegalStateException("Type of bun should be " + Menu.bunTypes().toString());
            }

        }

        public BigmacBuilder burgers(int burgers) {
            if(burgers > Menu.getBurgerMin() && burgers < Menu.getBurgerMax()) {
                this.burgers = burgers;
                return this;
            } else {
                throw new IllegalStateException("Number of burgers should be between " + Menu.getBurgerMin() +
                        " and " + Menu.getBurgerMax());
            }

        }

        public BigmacBuilder sauce(String sauce) {
            if(Menu.sauceTypes().contains(sauce)) {
                this.sauce = sauce;
                return this;
            } else {
                throw new IllegalStateException("Type of bun should be " + Menu.sauceTypes().toString());
            }
        }

        public BigmacBuilder ingredient(String ingredient) {
            if(Menu.ingredientTypes().contains(ingredient)) {
                ingredients.add(ingredient);
                return this;
            } else {
                throw new IllegalStateException("Ingredient should be " + Menu.ingredientTypes().toString());
            }

        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    private Bigmac (String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Big Mac:{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
