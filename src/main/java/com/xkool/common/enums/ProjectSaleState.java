package com.xkool.common.enums;

import com.alibaba.fastjson.annotation.JSONType;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Arrays;
import java.util.List;

import static com.xkool.common.constant.ProjectSaleStateIdConstant.*;
import static com.xkool.common.constant.ProjectSaleStateNameConstant.*;

@JSONType(serializeEnumAsJavaBean = true)
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ProjectSaleState {

    UNSOLD_PROJECT_SALE_STATE(UNSOLD_PROJECT_SALE_STATE_ID, UNSOLD_PROJECT_SALE_STATE_NAME),
    SALE_PROJECT_SALE_STATE(SALE_PROJECT_SALE_STATE_ID, SALE_PROJECT_SALE_STATE_NAME),
    FOR_SALE_PROJECT_SALE_STATE(FOR_SALE_PROJECT_SALE_STATE_ID, FOR_SALE_PROJECT_SALE_STATE_NAME),
    SOLD_OUT_PROJECT_SALE_STATE(SOLD_OUT_PROJECT_SALE_STATE_ID, SOLD_OUT_PROJECT_SALE_STATE_NAME);

    private int id;
    private String name;

    ProjectSaleState(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static ProjectSaleState getProjectSaleStateById(int id) {
        for (ProjectSaleState projectSaleState : ProjectSaleState.values()) {
            if (projectSaleState.getId() == id) {
                return projectSaleState;
            }
        }
        return null;
    }

    public static ProjectSaleState getProjectSaleStateByName(String name) {
        for (ProjectSaleState projectSaleState : ProjectSaleState.values()) {
            if (projectSaleState.getName().equals(name)) {
                return projectSaleState;
            }
        }
        return null;
    }

    public static List<ProjectSaleState> getProjectSaleStates() {
        return Arrays.asList(ProjectSaleState.values());
    }
}
