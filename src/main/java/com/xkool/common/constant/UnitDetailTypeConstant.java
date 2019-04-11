package com.xkool.common.constant;


import com.xkool.common.UnitDetailType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.xkool.common.constant.UnitDetailTypeIdConstant.*;
import static com.xkool.common.constant.UnitDetailTypeNameConstant.*;
import static com.xkool.common.constant.UnitTypeIdConstant.*;

public class UnitDetailTypeConstant {

    public static List<UnitDetailType> unitDetailTypes = new ArrayList<UnitDetailType>() {
        {
            add(new UnitDetailType(HIGH_RISE_BUILDING_UNIT_DETAIL_TYPE_ID, HIGH_RISE_BUILDING_UNIT_TYPE_ID, HIGH_RISE_BUILDING_UNIT_DETAIL_TYPE_NAME));
            add(new UnitDetailType(MID_HIGH_BUILDING_UNIT_DETAIL_TYPE_ID, HIGH_RISE_BUILDING_UNIT_TYPE_ID, MID_HIGH_BUILDING_UNIT_DETAIL_TYPE_NAME));
            add(new UnitDetailType(SUPER_HIGH_BUILDING_UNIT_DETAIL_TYPE_ID, HIGH_RISE_BUILDING_UNIT_TYPE_ID, SUPER_HIGH_BUILDING_UNIT_DETAIL_TYPE_NAME));
            add(new UnitDetailType(MULTISTAGE_WESTERN_STYLE_HOUSE_UNIT_DETAIL_TYPE_ID, WESTERN_STYLE_HOUSE_UNIT_TYPE_ID, MULTISTAGE_WESTERN_STYLE_HOUSE_UNIT_DETAIL_TYPE_NAME));
            add(new UnitDetailType(WESTERN_STYLE_HOUSE_UNIT_DETAIL_TYPE_ID, WESTERN_STYLE_HOUSE_UNIT_TYPE_ID, WESTERN_STYLE_HOUSE_UNIT_DETAIL_TYPE_NAME));
            add(new UnitDetailType(WESTERN_STYLE_BUILDING_UNIT_DETAIL_TYPE_ID, WESTERN_STYLE_HOUSE_UNIT_TYPE_ID, WESTERN_STYLE_BUILDING_UNIT_DETAIL_TYPE_NAME));
            add(new UnitDetailType(WESTERN_STYLE_VILLA_UNIT_DETAIL_TYPE_ID, WESTERN_STYLE_HOUSE_UNIT_TYPE_ID, WESTERN_STYLE_VILLA_UNIT_DETAIL_TYPE_NAME));
            add(new UnitDetailType(INDEPENDENT_VILLA_UNIT_DETAIL_TYPE_ID, VILLA_UNIT_TYPE_ID, INDEPENDENT_VILLA_UNIT_DETAIL_TYPE_NAME));
            add(new UnitDetailType(LIKE_INDEPENDENT_VILLA_UNIT_DETAIL_TYPE_ID, VILLA_UNIT_TYPE_ID, LIKE_INDEPENDENT_VILLA_UNIT_DETAIL_TYPE_NAME));
            add(new UnitDetailType(DOUBLE_VILLA_UNIT_DETAIL_TYPE_ID, VILLA_UNIT_TYPE_ID, DOUBLE_VILLA_UNIT_DETAIL_TYPE_NAME));
            add(new UnitDetailType(STACKED_VILLA_UNIT_DETAIL_TYPE_ID, VILLA_UNIT_TYPE_ID, STACKED_VILLA_UNIT_DETAIL_TYPE_NAME));
            add(new UnitDetailType(TOWN_HOUSE_UNIT_DETAIL_TYPE_ID, VILLA_UNIT_TYPE_ID, TOWN_HOUSE_UNIT_DETAIL_TYPE_NAME));
            add(new UnitDetailType(GROUP_VILLA_UNIT_DETAIL_TYPE_ID, VILLA_UNIT_TYPE_ID, GROUP_VILLA_UNIT_DETAIL_TYPE_NAME));
            add(new UnitDetailType(LOFT_UNIT_DETAIL_TYPE_ID, CONDO_UNIT_TYPE_ID, LOFT_UNIT_DETAIL_TYPE_NAME));
            add(new UnitDetailType(SOHO_UNIT_DETAIL_TYPE_ID, CONDO_UNIT_TYPE_ID, SOHO_UNIT_DETAIL_TYPE_NAME));
        }
    };

    public static UnitDetailType getUnitDetailTypeByName(String name) {
        Optional<UnitDetailType> unitDetailTypeOptional = unitDetailTypes.stream()
                .filter(unitDetailType -> unitDetailType.getName().equals(name))
                .findFirst();
        return unitDetailTypeOptional.orElse(null);
    }

    public static UnitDetailType getUnitDetailTypeById(int id) {
        Optional<UnitDetailType> unitDetailTypeOptional = unitDetailTypes.stream()
                .filter(unitDetailType -> unitDetailType.getId() == id)
                .findFirst();
        return unitDetailTypeOptional.orElse(null);
    }

    public static List<UnitDetailType> getUnitDetailTypesByParentId(Integer id) {
        return unitDetailTypes.stream()
                .filter(unitDetailType -> unitDetailType.getUnitTypeId() == id).collect(Collectors.toList());
    }

    public static List<UnitDetailType> getUnitDetailTypes() {
        return unitDetailTypes;
    }

}
