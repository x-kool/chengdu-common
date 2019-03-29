package com.xkool.common.enums;


import com.xkool.common.constant.UnitTypeIdConstant;

import java.util.ArrayList;
import java.util.List;

import static com.xkool.common.constant.UnitDetailTypeIdConstant.*;
import static com.xkool.common.constant.UnitDetailTypeNameConstant.*;

public enum UnitDetailType {
    HIGH_RISE_BUILDING(HIGH_RISE_BUILDING_ID, UnitTypeIdConstant.HIGH_RISE_BUILDING_UNIT_TYPE_ID, HIGH_RISE_BUILDING_NAME),
    MID_HIGH_BUILDING(MID_HIGH_BUILDING_ID, UnitTypeIdConstant.HIGH_RISE_BUILDING_UNIT_TYPE_ID, MID_HIGH_BUILDING_NAME),
    SUPER_HIGH_BUILDING(SUPER_HIGH_BUILDING_ID, UnitTypeIdConstant.HIGH_RISE_BUILDING_UNIT_TYPE_ID, SUPER_HIGH_BUILDING_NAME),
    MULTISTAGE_WESTERN_STYLE_HOUSE(MULTISTAGE_WESTERN_STYLE_HOUSE_ID, UnitTypeIdConstant.WESTERN_STYLE_HOUSE_UNIT_TYPE_ID, MULTISTAGE_WESTERN_STYLE_HOUSE_NAME),
    WESTERN_STYLE_HOUSE(WESTERN_STYLE_HOUSE_ID, UnitTypeIdConstant.WESTERN_STYLE_HOUSE_UNIT_TYPE_ID, WESTERN_STYLE_HOUSE_NAME),
    WESTERN_STYLE_BUILDING(WESTERN_STYLE_BUILDING_ID, UnitTypeIdConstant.WESTERN_STYLE_HOUSE_UNIT_TYPE_ID, WESTERN_STYLE_BUILDING_NAME),
    WESTERN_STYLE_VILLA(WESTERN_STYLE_VILLA_ID, UnitTypeIdConstant.WESTERN_STYLE_HOUSE_UNIT_TYPE_ID, WESTERN_STYLE_VILLA_NAME),
    INDEPENDENT_VILLA(INDEPENDENT_VILLA_ID, UnitTypeIdConstant.VILLA_UNIT_TYPE_ID, INDEPENDENT_VILLA_NAME),
    LIKE_INDEPENDENT_VILLA(LIKE_INDEPENDENT_VILLA_ID, UnitTypeIdConstant.VILLA_UNIT_TYPE_ID, LIKE_INDEPENDENT_VILLA_NAME),
    DOUBLE_VILLA(DOUBLE_VILLA_ID, UnitTypeIdConstant.VILLA_UNIT_TYPE_ID, DOUBLE_VILLA_NAME),
    STACKED_VILLA(STACKED_VILLA_ID, UnitTypeIdConstant.VILLA_UNIT_TYPE_ID, STACKED_VILLA_NAME),
    TOWN_HOUSE(TOWN_HOUSE_ID, UnitTypeIdConstant.VILLA_UNIT_TYPE_ID, TOWN_HOUSE_NAME),
    GROUP_VILLA(GROUP_VILLA_ID, UnitTypeIdConstant.VILLA_UNIT_TYPE_ID, GROUP_VILLA_NAME),
    LOFT(LOFT_ID, UnitTypeIdConstant.CONDO_UNIT_TYPE_ID, LOFT_NAME),
    SOHO(SOHO_ID, UnitTypeIdConstant.CONDO_UNIT_TYPE_ID, SOHO_NAME);

    private int id;
    private int unitTypeId;
    private String name;

    UnitDetailType(int id, int unitTypeId, String name) {
        this.id = id;
        this.unitTypeId = unitTypeId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getUnitTypeId() {
        return unitTypeId;
    }

    public String getName() {
        return name;
    }


    public static String getUnitDetailTypeNameById(int id) {
        for (UnitDetailType unitDetailType : UnitDetailType.values()) {
            if (unitDetailType.getId() == id) {
                return unitDetailType.getName();
            }
        }
        return null;
    }

    public static Integer getUnitDetailTypeIdByName(String name) {
        for (UnitDetailType unitDetailType : UnitDetailType.values()) {
            if (unitDetailType.getName().equals(name)) {
                return unitDetailType.getId();
            }
        }
        return null;
    }

    public static List<Integer> getUnitDetailTypeIdsByUnitTypeId(int unitTypeId) {
        List<Integer> unitDetailTypeIds = new ArrayList<Integer>();
        for (UnitDetailType unitDetailType : UnitDetailType.values()) {
            if (unitDetailType.getUnitTypeId() == unitTypeId) {
                unitDetailTypeIds.add(unitDetailType.getId());
            }
        }
        return unitDetailTypeIds;
    }
}
