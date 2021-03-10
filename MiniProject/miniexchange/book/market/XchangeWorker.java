package com.miniexchange.book.market;

import com.miniexchange.order.Order;
import com.miniexchange.utill.OrderRequestType;

public class XchangeWorker implements Runnable{

    private Event event;
    private Market market;

    public XchangeWorker(Event event, Market market) {
        this.event = event;
        this.market = market;
    }

    @Override
    public void run() {

        Order order=event.getOrder();
        if(event.getOrderRequestType().equals(OrderRequestType.NEW))//New Order
            market.add(order.getStockID(),order.getOrderId(),order.getOrderType(),order.getPrice(),order.getQty());
        else if (event.getOrderRequestType().getStatus()==1){
            market.modify(order.getStockID(),order.getQty());
        }else if( event.getOrderRequestType().getStatus()==2){
            market.cancel(order.getOrderId(),order.getQty());
        }

    }
}
