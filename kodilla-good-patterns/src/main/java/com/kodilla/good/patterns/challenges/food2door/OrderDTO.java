package com.kodilla.good.patterns.challenges.food2door;

public class OrderDTO {
    private InternalOrderDTO order;
    private boolean isAccepted;

    public OrderDTO(InternalOrderDTO order, boolean isAccepted) {
        this.order = order;
        this.isAccepted = isAccepted;
    }

    public InternalOrderDTO getOrder() {
        return order;
    }

    public boolean isAccepted() {
        return isAccepted;
    }
}
