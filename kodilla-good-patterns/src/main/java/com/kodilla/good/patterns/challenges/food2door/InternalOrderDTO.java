package com.kodilla.good.patterns.challenges.food2door;

public class InternalOrderDTO {
    private final Producer producer;
    private final Product product;
    private final int productQuantity;

    public InternalOrderDTO(Producer producer, Product product, int productQuantity) {
        this.producer = producer;
        this.product = product;
        this.productQuantity = productQuantity;
    }

    public Producer getProducer() {
        return producer;
    }

    public Product getProduct() {
        return product;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    @Override
    public String toString() {
        return "Order:\n" +
                "Producer: " + producer.getName() +
                ", product: " + product.getProductName() +
                ", productQuantity = " + productQuantity + ";";
    }
}
