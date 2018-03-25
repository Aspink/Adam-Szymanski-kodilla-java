package com.kodilla.good.patterns.challenges;

public class OrderApplication {
    public static void main(String[] args) {
        ProductOrderRetriever productOrderRetriever = new ProductOrderRetriever();
        ProductRequest productRequest = productOrderRetriever.retrieve();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new OnScreenInfoService(), new ProductOrderService(), new OrdersToProceedRepository());
        productOrderProcessor.process(productRequest);
    }
}
