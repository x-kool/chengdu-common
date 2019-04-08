package com.xkool.common.enums;


import com.xkool.common.constant.UnitTypeIdConstant;

import java.util.ArrayList;
import java.util.List;

import static com.xkool.common.constant.UnitDetailTypeIdConstant.*;
import static com.xkool.common.constant.UnitDetailTypeNameConstant.*;

public enum UnitDetailTypeEnum {
    HIGH_RISE_BUILDING(HIGH_RISE_BUILDING_UNIT_DETAIL_TYPE_ID,
            UnitTypeIdConstant.HIGH_RISE_BUILDING_UNIT_TYPE_ID,
            HIGH_RISE_BUILDING_UNIT_DETAIL_TYPE_NAME),
    MID_HIGH_BUILDING(MID_HIGH_BUILDING_UNIT_DETAIL_TYPE_ID,
            UnitTypeIdConstant.HIGH_RISE_BUILDING_UNIT_TYPE_ID,
            MID_HIGH_BUILDING_UNIT_DETAIL_TYPE_NAME),
    SUPER_HIGH_BUILDING(SUPER_HIGH_BUILDING_UNIT_DETAIL_TYPE_ID,
            UnitTypeIdConstant.HIGH_RISE_BUILDING_UNIT_TYPE_ID,
            SUPER_HIGH_BUILDING_UNIT_DETAIL_TYPE_NAME),
    MULTISTAGE_WESTERN_STYLE_HOUSE(MULTISTAGE_WESTERN_STYLE_HOUSE_UNIT_DETAIL_TYPE_ID,
            UnitTypeIdConstant.WESTERN_STYLE_HOUSE_UNIT_TYPE_ID,
            MULTISTAGE_WESTERN_STYLE_HOUSE_UNIT_DETAIL_TYPE_NAME),
    WESTERN_STYLE_HOUSE(WESTERN_STYLE_HOUSE_UNIT_DETAIL_TYPE_ID,
            UnitTypeIdConstant.WESTERN_STYLE_HOUSE_UNIT_TYPE_ID,
            WESTERN_STYLE_HOUSE_UNIT_DETAIL_TYPE_NAME),
    WESTERN_STYLE_BUILDING(WESTERN_STYLE_BUILDING_UNIT_DETAIL_TYPE_ID,
            UnitTypeIdConstant.WESTERN_STYLE_HOUSE_UNIT_TYPE_ID,
            WESTERN_STYLE_BUILDING_UNIT_DETAIL_TYPE_NAME),
    WESTERN_STYLE_VILLA(WESTERN_STYLE_VILLA_UNIT_DETAIL_TYPE_ID,
            UnitTypeIdConstant.WESTERN_STYLE_HOUSE_UNIT_TYPE_ID,
            WESTERN_STYLE_VILLA_UNIT_DETAIL_TYPE_NAME),
    INDEPENDENT_VILLA(INDEPENDENT_VILLA_UNIT_DETAIL_TYPE_ID,
            UnitTypeIdConstant.VILLA_UNIT_TYPE_ID,
            INDEPENDENT_VILLA_UNIT_DETAIL_TYPE_NAME),
    LIKE_INDEPENDENT_VILLA(LIKE_INDEPENDENT_VILLA_UNIT_DETAIL_TYPE_ID,
            UnitTypeIdConstant.VILLA_UNIT_TYPE_ID,
            LIKE_INDEPENDENT_VILLA_UNIT_DETAIL_TYPE_NAME),
    DOUBLE_VILLA(DOUBLE_VILLA_UNIT_DETAIL_TYPE_ID,
            UnitTypeIdConstant.VILLA_UNIT_TYPE_ID,
            DOUBLE_VILLA_UNIT_DETAIL_TYPE_NAME),
    STACKED_VILLA(STACKED_VILLA_UNIT_DETAIL_TYPE_ID,
            UnitTypeIdConstant.VILLA_UNIT_TYPE_ID,
            STACKED_VILLA_UNIT_DETAIL_TYPE_NAME),
    TOWN_HOUSE(TOWN_HOUSE_UNIT_DETAIL_TYPE_ID,
            UnitTypeIdConstant.VILLA_UNIT_TYPE_ID,
            TOWN_HOUSE_UNIT_DETAIL_TYPE_NAME),
    GROUP_VILLA(GROUP_VILLA_UNIT_DETAIL_TYPE_ID,
            UnitTypeIdConstant.VILLA_UNIT_TYPE_ID,
            GROUP_VILLA_UNIT_DETAIL_TYPE_NAME),
    LOFT(LOFT_UNIT_DETAIL_TYPE_ID,
            UnitTypeIdConstant.CONDO_UNIT_TYPE_ID,
            LOFT_UNIT_DETAIL_TYPE_NAME),
    SOHO(SOHO_UNIT_DETAIL_TYPE_ID,
            UnitTypeIdConstant.CONDO_UNIT_TYPE_ID,
            SOHO_UNIT_DETAIL_TYPE_NAME);

    private int id;
    private int unitTypeId;
    private String name;

    UnitDetailTypeEnum(int id, int unitTypeId, String name) {
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


    public static UnitDetailTypeEnum getUnitDetailTypeById(int id) {
        for (UnitDetailTypeEnum unitDetailTypeEnum : UnitDetailTypeEnum.values()) {
            if (unitDetailTypeEnum.getId() == id) {
                return unitDetailTypeEnum;
            }
        }
        return null;
    }

    public static UnitDetailTypeEnum getUnitDetailTypeByName(String name) {
        for (UnitDetailTypeEnum unitDetailTypeEnum : UnitDetailTypeEnum.values()) {
            if (unitDetailTypeEnum.getName().equals(name)) {
                return unitDetailTypeEnum;
            }
        }
        return null;
    }

    public static List<UnitDetailTypeEnum> getUnitDetailTypesByUnitTypeId(int unitTypeId) {
        List<UnitDetailTypeEnum> unitDetailTypeEnums = new ArrayList<UnitDetailTypeEnum>();
        for (UnitDetailTypeEnum unitDetailTypeEnum : UnitDetailTypeEnum.values()) {
            if (unitDetailTypeEnum.getUnitTypeId() == unitTypeId) {
                unitDetailTypeEnums.add(unitDetailTypeEnum);
            }
        }
        return unitDetailTypeEnums;
    }
}