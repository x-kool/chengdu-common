package com.xkool.common;

import lombok.Data;

@Data
public class UnitType {

    private int id;
    private String name;

    public UnitType() {

    }

    public UnitType(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
