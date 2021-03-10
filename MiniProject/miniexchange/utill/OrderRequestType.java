package com.miniexchange.utill;

public enum OrderRequestType {
    NEW(0),MODIFY(1),CANCEL(2);//CANCEL(1),COMPLETED(2),PARTIALLY_COMPLETED(3);

    private final int status;

    OrderRequestType(int status) {
        this.status=status;
    }

    public int getStatus() {
        return status;
    }
}
