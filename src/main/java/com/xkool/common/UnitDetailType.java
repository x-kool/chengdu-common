package com.xkool.common;


import lombok.Data;

@Data
public class UnitDetailType {

    private int id;
    private int unitTypeId;
    private String name;

    UnitDetailType(int id, int unitTypeId, String name) {
        this.id = id;
        this.unitTypeId = unitTypeId;
        this.name = name;
    }
}
