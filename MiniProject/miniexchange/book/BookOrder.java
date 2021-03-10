package com.miniexchange.book;

import com.miniexchange.utill.BuySell;

public class BookOrder {
    public long price;
    public long remainingQuantity;
    public  OrderBook book;
    public BuySell side;


    public void reduce(long quantity ){

    }

    public void setRemainingQuantity(long remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
    }

    public OrderBook getOrderBook() {
        return book;
    }

    public BookOrder(long price, OrderBook book, BuySell side, long size) {
        this.price = price;
        this.book = book;
        this.side = side;
        this.remainingQuantity=size;
    }
}
