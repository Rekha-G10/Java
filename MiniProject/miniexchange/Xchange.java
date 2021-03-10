package com.miniexchange;

import com.miniexchange.order.Order;
import com.miniexchange.utill.Trader;

public interface Xchange {

    void placeOrder(Order order);
    void deleteOrder(Order order);
    void modifyOrder(Order orders);
    void viewBook(long stockID);
    void registerTrader(Trader trader);
    // void registerMarketListener(MarketListner listner);

}
