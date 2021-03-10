package com.miniexchange.book.market;

import com.miniexchange.book.OrderBook;
import com.miniexchange.utill.BuySell;

public interface MarketListener {

    void update(OrderBook book, boolean boo);
    void  trade(OrderBook book, BuySell type, long price, long size);
}
