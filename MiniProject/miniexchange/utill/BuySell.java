package com.miniexchange.utill;

public enum BuySell {
    BUY(0,"BUY"),SELL(1,"SELL");

    private final int typeValue;
    private final String type;

    BuySell(int i, String type) {
        this.typeValue=i;
        this.type=type;
    }

    public int getTypeValue() {
        return typeValue;
    }

    public String getType() {
        return type;
    }
}

