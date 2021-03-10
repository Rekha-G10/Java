package com.miniexchange.book;


import com.miniexchange.utill.BuySell;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class OrderBook {

    TreeMap<Long,Long> bids=new TreeMap<>();
    TreeMap<Long,Long> asks=new TreeMap<>(new Comparator<Long>() {
        @Override
        public int compare(Long o1, Long o2) {
            return o1.compareTo(o2) *-1;
        }
    });

    private long instrument;



    public long getInstrument() {
        return instrument;
    }

    public void setInstrument(long instrument) {
        this.instrument = instrument;
    }




    public OrderBook(long instrument) {
        this.instrument = instrument;
    }

    public long  getBestBidPrice(){

        return 0;
    }
    public SortedSet<Long> getBidPrices(){

        return new TreeSet(bids.entrySet());
    }
    public long getBidsize( long price){

        return 0;
    }
    public long getBestAskPrice(){
        return 0;
    }
    public SortedSet<Long> getAsksPrices(){
        return new TreeSet(asks.entrySet());
    }
    long getAskSize(long price){
        return 0;
    }
    public boolean add(BuySell side,long price,long quantity){

        if(side.getType().equals("BUY")){
            if( bids.get(price) ==null){

                bids.put(price,bids.get(price)+quantity);
            }else
                bids.put(price,quantity);
        }else if(side.getType().equals("SELL")){
            if( asks.get(price) ==null){

                asks.put(price,bids.get(price)+quantity);
            }else
                asks.put(price,quantity);
        }
        return false;
    }
    public  boolean update(BuySell side,long price,long quantity){

        return false;
    }

    void getLevels(BuySell buy){

    }
}

