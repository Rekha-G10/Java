package com.miniexchange.order;

import com.miniexchange.utill.BuySell;
import com.miniexchange.utill.OrderRequestType;
import com.miniexchange.utill.Stock;

import java.util.Date;

public class Order implements Cloneable{

    private Long orderId;
    private long price;
    private BuySell orderType;
    private Long qty;
    private Long stockID;
    private Date creationDate=new Date();
    private OrderRequestType orderStatus;
    private String traderCode;

    public Order(Long orderId, long price, BuySell orderType, Long qty, Long stockID, String traderCode) {
        this.orderId = orderId;
        this.price = price;
        this.orderType = orderType;
        this.qty = qty;
        this.stockID = stockID;
        this.traderCode=traderCode;
        this.traderCode=traderCode;
        this.orderStatus= OrderRequestType.NEW;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public BuySell getOrderType() {
        return orderType;
    }

    public void setOrderType(BuySell orderType) {
        this.orderType = orderType;
    }

    public Long getQty() {
        return qty;
    }

    public void setQty(Long qty) {
        this.qty = qty;
    }

    public Long getStockID() {
        return stockID;
    }

    public Date getCreationDate() {
        return creationDate;
    }



    public OrderRequestType getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderRequestType orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getTraderCode() {
        return traderCode;
    }

    public void setTraderCode(String traderCode) {
        this.traderCode = traderCode;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", price=" + price +
                ", orderType=" + orderType +
                ", qty=" + qty +
                ", stockID=" + stockID +
                ", creationDate=" + creationDate +
                ", orderStatus=" + orderStatus +
                ", traderCode='" + traderCode + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
