package com.miniexchange.book.market;

import com.miniexchange.book.BookOrder;
import com.miniexchange.book.MarketDepth;
import com.miniexchange.book.OrderBook;
import com.miniexchange.utill.BuySell;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Market implements MarketListener{

    private  ArrayList<OrderBook> books=new ArrayList<>();
    private ArrayList<BookOrder>  orders=null;
    private MarketListener listener=null;


    @Override
    public void update(OrderBook book, boolean boo) {

    }

    @Override
    public void trade(OrderBook book, BuySell type, long price, long size) {


    }


    public OrderBook open(long securityId){

        return null;
    }

    public BookOrder find(long securityId){

        return null;
    }
    public void add(long instrument, long orderId, BuySell buySell, long price, long size){

        List<OrderBook> filterList =
                books.stream().filter(book -> book.getInstrument() == instrument).collect(Collectors.toList());
        if(filterList.isEmpty()){
            books.add(new OrderBook(instrument));
        }else
            filterList.get(0).add(buySell,price,size);

        doMatching(  filterList.get(0),true,orderId,size,price);
    }
    public void doMatching(OrderBook book,boolean boo,long orderId,long size,long price){

        if  ( book.getBestAskPrice() >= book.getBestAskPrice()){
            execute(orderId,size);
        }

    }
    public void modify(long orderId,long size){

    }
    public Long execute(long orderId,long quantity){

        return  null;
    }
    public Long execute(long orderId,long quantity,long price ){

        return  null;
    }

    public Long execute(long orderId,BookOrder bookOrder,long quantity){

        return  null;
    }
    public Long cancel(long orderId,long quantity){

        return null;
    }
    public Long delete(long orderId){

        return null;
    }


    public MarketDepth getDeapth(long StokId, int depthValue){

        return null;
    }
    public void registerListener(MarketListener marketListener){
        this.listener=marketListener;
    }
}
