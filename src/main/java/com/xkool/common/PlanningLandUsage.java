package com.xkool.common;

import lombok.Data;

@Data
public class PlanningLandUsage {

    private int id;
    private int parentId;
    private String name;

    public PlanningLandUsage() {
    }

    public PlanningLandUsage(int id, int parentId, String name) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
    }
}
