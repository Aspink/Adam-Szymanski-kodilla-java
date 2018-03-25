package com.kodilla.good.patterns.challenges;

public class ProductRequest {
    private User user;
    private Product product;
    private int quantity;

    public ProductRequest(User user, Product product, int quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "User: " + user +
                ", product: " + product +
                ", quantity: " + quantity;
    }
}
