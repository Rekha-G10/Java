package com.miniexchange.book;

import java.util.List;

public class MarketDepth {

    private long securityId;
    private Level level;

    public long getSecurityId() {
        return securityId;
    }

    public void setSecurityId(long securityId) {
        this.securityId = securityId;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public List<Level> getLssevels(){

        return null;
    }

    @Override
    public String toString() {
        return "MarketDepth{" +
                "securityId=" + securityId +
                ", level=" + level +
                '}';
    }
}
