package com.xkool.common;

import lombok.Data;

@Data
public class ProjectSaleState {

    private int id;
    private String name;

    public ProjectSaleState(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
