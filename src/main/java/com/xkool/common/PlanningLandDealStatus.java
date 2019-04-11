package com.xkool.common;


import lombok.Data;

@Data
public class PlanningLandDealStatus {

    private int id;
    private String name;

    PlanningLandDealStatus(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
