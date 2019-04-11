package com.xkool.common;

import lombok.Data;

@Data
public class HouseType {

    private int id;
    private String name;

    public HouseType(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
