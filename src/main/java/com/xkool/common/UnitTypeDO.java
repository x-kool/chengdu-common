package com.xkool.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.xkool.common.constant.UnitTypeIdConstant.*;
import static com.xkool.common.constant.UnitTypeNameConstant.*;

public class UnitTypeDO {

    public static List<UnitType> unitTypes = new ArrayList<UnitType>() {
        {
            add(new UnitType(HIGH_RISE_BUILDING_UNIT_TYPE_ID, HIGH_RISE_BUILDING_UNIT_TYPE_NAME));
            add(new UnitType(WESTERN_STYLE_HOUSE_UNIT_TYPE_ID, WESTERN_STYLE_HOUSE_UNIT_TYPE_NAME));
            add(new UnitType(VILLA_UNIT_TYPE_ID, VILLA_UNIT_TYPE_NAME));
            add(new UnitType(STORE_UNIT_TYPE_ID, STORE_UNIT_TYPE_NAME));
            add(new UnitType(OFFICE_BUILDING_UNIT_TYPE_ID, OFFICE_BUILDING_UNIT_TYPE_NAME));
            add(new UnitType(CONDO_UNIT_TYPE_ID, CONDO_UNIT_TYPE_NAME));
            add(new UnitType(AFFORDABLE_HOUSE_UNIT_TYPE_ID, AFFORDABLE_HOUSE_UNIT_TYPE_NAME));
            add(new UnitType(GARAGE_UNIT_TYPE_ID, GARAGE_UNIT_TYPE_NAME));
            add(new UnitType(STORAGE_UNIT_TYPE_ID, STORAGE_UNIT_TYPE_NAME));
            add(new UnitType(EDUCATION_UNIT_TYPE_ID, EDUCATION_UNIT_TYPE_NAME));
            add(new UnitType(STAFF_UNIT_TYPE_ID, STAFF_UNIT_TYPE_NAME));
        }
    };

    public static UnitType getUnitTypeByName(String name) {
        Optional<UnitType> unitTypeOptional = unitTypes.stream()
                .filter(unitType -> unitType.getName().equals(name))
                .findFirst();
        return unitTypeOptional.orElse(null);
    }

    public static UnitType getUnitTypeById(int id) {
        Optional<UnitType> unitTypeOptional = unitTypes.stream()
                .filter(unitType -> unitType.getId() == id)
                .findFirst();
        return unitTypeOptional.orElse(null);
    }

    public static List<UnitType> getUnitTypes() {
        return unitTypes;
    }

}
