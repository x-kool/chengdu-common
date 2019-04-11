package com.xkool.common;

import lombok.Data;

@Data
public class PlanningLandTransferMethod {

    private int id;
    private String name;

    public PlanningLandTransferMethod(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
