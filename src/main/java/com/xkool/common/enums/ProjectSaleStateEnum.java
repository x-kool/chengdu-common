package com.xkool.common.enums;

import java.util.Arrays;
import java.util.List;

import static com.xkool.common.constant.ProjectSaleStateIdConstant.*;
import static com.xkool.common.constant.ProjectSaleStateNameConstant.*;

public enum ProjectSaleStateEnum {

    UNSOLD_PROJECT_SALE_STATE(UNSOLD_PROJECT_SALE_STATE_ID, UNSOLD_PROJECT_SALE_STATE_NAME),
    SALE_PROJECT_SALE_STATE(SALE_PROJECT_SALE_STATE_ID, SALE_PROJECT_SALE_STATE_NAME),
    FOR_SALE_PROJECT_SALE_STATE(FOR_SALE_PROJECT_SALE_STATE_ID, FOR_SALE_PROJECT_SALE_STATE_NAME),
    SOLD_OUT_PROJECT_SALE_STATE(SOLD_OUT_PROJECT_SALE_STATE_ID, SOLD_OUT_PROJECT_SALE_STATE_NAME);

    private int id;
    private String name;

    ProjectSaleStateEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static ProjectSaleStateEnum getProjectSaleStateEnumById(int id) {
        for (ProjectSaleStateEnum projectSaleStateEnum : ProjectSaleStateEnum.values()) {
            if (projectSaleStateEnum.getId() == id) {
                return projectSaleStateEnum;
            }
        }
        return null;
    }

    public static ProjectSaleStateEnum getProjectSaleStateEnumByName(String name) {
        for (ProjectSaleStateEnum projectSaleStateEnum : ProjectSaleStateEnum.values()) {
            if (projectSaleStateEnum.getName().equals(name)) {
                return projectSaleStateEnum;
            }
        }
        return null;
    }

    public static List<ProjectSaleStateEnum> getProjectSaleStateEnums() {
        return Arrays.asList(ProjectSaleStateEnum.values());
    }
}
