package com.miniexchange.book.market;

import com.miniexchange.order.Order;
import com.miniexchange.utill.OrderRequestType;

public class Event {
    private Order order;
    private OrderRequestType orderRequestType;

    public Event(Order order, OrderRequestType orderRequestType) {
        this.order = order;
        this.orderRequestType = orderRequestType;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderRequestType getOrderRequestType() {
        return orderRequestType;
    }

    public void setOrderRequestType(OrderRequestType orderRequestType) {
        this.orderRequestType = orderRequestType;
    }
}
