package com.miniexchange;

import com.miniexchange.book.market.Event;
import com.miniexchange.book.market.Market;
import com.miniexchange.book.market.XchangeWorker;
import com.miniexchange.order.Order;
import com.miniexchange.utill.OrderRequestType;
import com.miniexchange.utill.Trader;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MiniXchangeImpl implements Xchange{

    ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    private ArrayList<Trader> tarderList=new ArrayList<>();
    private Market market=new Market();
    @Override
    public void placeOrder(Order order) {

        Event event=null;
        try {
            event=new Event(order, OrderRequestType.NEW);
            executor.submit(new XchangeWorker(event,market));

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteOrder(Order order) {

    }

    @Override
    public void modifyOrder(Order orders) {

    }

    @Override
    public void viewBook(long stockID) {

    }

    @Override
    public void registerTrader(Trader trader) {

    }
}
