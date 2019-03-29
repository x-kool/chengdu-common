package com.xkool.common.enums;

import static com.xkool.common.constant.UnitTypeIdConstant.*;
import static com.xkool.common.constant.UnitTypeNameConstant.*;

public enum UnitType {
    HIGH_RISE_BUILDING(HIGH_RISE_BUILDING_UNIT_TYPE_ID, HIGH_RISE_BUILDING_UNIT_TYPE_NAME),
    WESTERN_STYLE_HOUSE(WESTERN_STYLE_HOUSE_UNIT_TYPE_ID, WESTERN_STYLE_HOUSE_UNIT_TYPE_NAME),
    VILLA(VILLA_UNIT_TYPE_ID, VILLA_UNIT_TYPE_NAME),
    STORE(STORE_UNIT_TYPE_ID, STORE_UNIT_TYPE_NAME),
    OFFICE_BUILDING(OFFICE_BUILDING_UNIT_TYPE_ID, OFFICE_BUILDING_UNIT_TYPE_NAME),
    CONDO(CONDO_UNIT_TYPE_ID, CONDO_UNIT_TYPE_NAME),
    AFFORDABLE_HOUSE(AFFORDABLE_HOUSE_UNIT_TYPE_ID, AFFORDABLE_HOUSE_UNIT_TYPE_NAME),
    GARAGE(GARAGE_UNIT_TYPE_ID, GARAGE_UNIT_TYPE_NAME),
    STORAGE(STORAGE_UNIT_TYPE_ID, STORAGE_UNIT_TYPE_NAME),
    EDUCATION(EDUCATION_UNIT_TYPE_ID, EDUCATION_UNIT_TYPE_NAME),
    STAFF(STAFF_UNIT_TYPE_ID, STAFF_UNIT_TYPE_NAME);

    private int id;
    private String name;

    UnitType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static String getUnitTypeNameById(int id) {
        for (UnitType unitType : UnitType.values()) {
            if (unitType.getId() == id) {
                return unitType.getName();
            }
        }
        return null;
    }

    public static Integer getUnitTypeIdByName(String name) {
        for (UnitType unitType : UnitType.values()) {
            if (unitType.getName().equals(name)) {
                return unitType.getId();
            }
        }
        return null;
    }
}
