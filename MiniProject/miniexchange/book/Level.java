package com.miniexchange.book;

public class Level {

    public long bidPrice;
    public long bidSize;
    public long askPrice;
    public long askSize;

    public Level(long bidPrice, long bidSize, long askPrice, long askSize) {
        this.bidPrice = bidPrice;
        this.bidSize = bidSize;
        this.askPrice = askPrice;
        this.askSize = askSize;
    }

    @Override
    public String toString() {
        return "Level{" +
                "bidPrice=" + bidPrice +
                ", bidSize=" + bidSize +
                ", askPrice=" + askPrice +
                ", askSize=" + askSize +
                '}';
    }
}
