package com.xkool.common.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.xkool.common.constant.UnitTypeIdConstant.*;
import static com.xkool.common.constant.UnitTypeNameConstant.*;

public enum UnitTypeEnum {
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

    UnitTypeEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static UnitTypeEnum getUnitTypeEnumById(int id) {
        for (UnitTypeEnum unitTypeEnum : UnitTypeEnum.values()) {
            if (unitTypeEnum.getId() == id) {
                return unitTypeEnum;
            }
        }
        return null;
    }

    public static UnitTypeEnum getUnitTypeEnumByName(String name) {
        for (UnitTypeEnum unitTypeEnum : UnitTypeEnum.values()) {
            if (unitTypeEnum.getName().equals(name)) {
                return unitTypeEnum;
            }
        }
        return null;
    }

    public static List<UnitTypeEnum> getResidenceUnitTypeEnums() {
        List<UnitTypeEnum> unitTypeEnums = new ArrayList<UnitTypeEnum>();
        for (UnitTypeEnum unitTypeEnum : UnitTypeEnum.values()) {
            if (unitTypeEnum.getId() == HIGH_RISE_BUILDING_UNIT_TYPE_ID) {
                unitTypeEnums.add(unitTypeEnum);
            }
            if (unitTypeEnum.getId() == WESTERN_STYLE_HOUSE_UNIT_TYPE_ID) {
                unitTypeEnums.add(unitTypeEnum);
            }
            if (unitTypeEnum.getId() == VILLA_UNIT_TYPE_ID) {
                unitTypeEnums.add(unitTypeEnum);
            }
        }
        return unitTypeEnums;
    }

    public static List<UnitTypeEnum> getUnitTypeEnums() {
        return Arrays.asList(UnitTypeEnum.values());
    }
}
