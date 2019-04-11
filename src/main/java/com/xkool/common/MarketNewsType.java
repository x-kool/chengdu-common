package com.xkool.common;


import lombok.Data;

@Data
public class MarketNewsType {

    private int id;
    private String name;

    public MarketNewsType() {
    }

    public MarketNewsType(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
