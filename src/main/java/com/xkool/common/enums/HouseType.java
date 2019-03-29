package com.xkool.common.enums;

import static com.xkool.common.constant.HouseTypeIdConstant.*;
import static com.xkool.common.constant.HouseTypeNameConstant.*;

public enum HouseType {

    SINGLE_BEDROOM(SINGLE_BEDROOM_HOUSE_TYPE_ID, SINGLE_BEDROOM_HOUSE_TYPE_NAME),
    ONE_BEDROOM(ONE_BEDROOM_HOUSE_TYPE_ID, ONE_BEDROOM_HOUSE_TYPE_NAME),
    ONE_AND_HALF_BEDROOM(ONE_AND_HALF_BEDROOM_HOUSE_TYPE_ID, ONE_AND_HALF_BEDROOM_HOUSE_TYPE_NAME),
    TWO_BEDROOM(TWO_BEDROOM_HOUSE_TYPE_ID, TWO_BEDROOM_HOUSE_TYPE_NAME),
    TWO_AND_HALF_BEDROOM(TWO_AND_HALF_BEDROOM_HOUSE_TYPE_ID, TWO_AND_HALF_BEDROOM_HOUSE_TYPE_NAME),
    THREE_BEDROOM(THREE_BEDROOM_HOUSE_TYPE_ID, THREE_BEDROOM_HOUSE_TYPE_NAME),
    THREE_AND_HALF_BEDROOM(THREE_AND_HALF_BEDROOM_HOUSE_TYPE_ID, THREE_AND_HALF_BEDROOM_HOUSE_TYPE_NAME),
    FOUR_AND_ABOVE_BEDROOM(FOUR_AND_ABOVE_BEDROOM_HOUSE_TYPE_ID, FOUR_AND_ABOVE_BEDROOM_HOUSE_TYPE_NAME);

    private int id;
    private String name;

    HouseType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static String getHouseTypeNameById(int id) {
        for (HouseType houseType : HouseType.values()) {
            if (houseType.getId() == id) {
                return houseType.getName();
            }
        }
        return null;
    }

    public static Integer getHouseTypeIdByName(String name) {
        for (HouseType houseType : HouseType.values()) {
            if (houseType.getName().equals(name)) {
                return houseType.getId();
            }
        }
        return null;
    }
}
