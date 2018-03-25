package com.kodilla.good.patterns.challenges;

public class ProductOrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderProcessor(final InformationService informationService,
                           final OrderService orderService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final ProductRequest productRequest) {
        boolean isOrdered = orderService.order(productRequest);

        if(!isOrdered) return new OrderDto(productRequest.getUser(), false);

        informationService.inform(productRequest.getUser());
        orderRepository.createOrder(productRequest.getUser(), productRequest.getProduct(), productRequest.getQuantity());
        return new OrderDto(productRequest.getUser(), true);

    }
}
