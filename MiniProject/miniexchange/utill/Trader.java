package com.miniexchange.utill;

public class Trader {
    String traderID;
    String traderName;
    String traderContactNumber;
    String traderAddress;
    String creationDate;
    String lastModificationDate;

    public void setTraderID(String traderID) {
        this.traderID = traderID;
    }

    public void setTraderName(String traderName) {
        this.traderName = traderName;
    }

    public void setTraderContactNumber(String traderContactNumber) {
        this.traderContactNumber = traderContactNumber;
    }

    public void setTraderAddress(String traderAddress) {
        this.traderAddress = traderAddress;
    }

    public String getTraderID() {
        return traderID;
    }

    public String getTraderName() {
        return traderName;
    }

    public String getTraderContactNumber() {
        return traderContactNumber;
    }

    public String getTraderAddress() {
        return traderAddress;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastModificationDate() {
        return lastModificationDate;
    }

    public void setLastModificationDate(String lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "traderID='" + traderID + '\'' +
                ", traderName='" + traderName + '\'' +
                ", traderContactNumber='" + traderContactNumber + '\'' +
                ", traderAddress='" + traderAddress + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", lastModificationDate='" + lastModificationDate + '\'' +
                '}';
    }

    public Trader(String traderID, String traderName, String traderContactNumber, String traderAddress) {
        this.traderID = traderID;
        this.traderName = traderName;
        this.traderContactNumber = traderContactNumber;
        this.traderAddress = traderAddress;
    }
}
