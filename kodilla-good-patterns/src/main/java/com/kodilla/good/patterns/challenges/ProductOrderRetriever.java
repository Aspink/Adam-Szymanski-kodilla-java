package com.kodilla.good.patterns.challenges;

public class ProductOrderRetriever {
    ProductRequest retrieve() {
        User user = new User ("Jose", "Morales", "JoMo123");
        Product boots = new Boots("TRB121", 43.5, "Black");
        int quantity = 1;

        return new ProductRequest(user, boots, quantity);
    }

}
