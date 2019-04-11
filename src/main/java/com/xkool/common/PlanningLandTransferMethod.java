package com.xkool.common;

import lombok.Data;

@Data
public class PlanningLandTransferMethod {

    private int id;
    private String name;

    PlanningLandTransferMethod(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
