package com.xkool.common.constant;

import com.xkool.common.HouseType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.xkool.common.constant.HouseTypeIdConstant.*;
import static com.xkool.common.constant.HouseTypeNameConstant.*;

public class HouseTypeConstant {

    public static List<HouseType> houseTypes = new ArrayList<HouseType>() {
        {
            add(new HouseType(SINGLE_BEDROOM_HOUSE_TYPE_ID, SINGLE_BEDROOM_HOUSE_TYPE_NAME));
            add(new HouseType(ONE_BEDROOM_HOUSE_TYPE_ID, ONE_BEDROOM_HOUSE_TYPE_NAME));
            add(new HouseType(ONE_AND_HALF_BEDROOM_HOUSE_TYPE_ID, ONE_AND_HALF_BEDROOM_HOUSE_TYPE_NAME));
            add(new HouseType(TWO_BEDROOM_HOUSE_TYPE_ID, TWO_BEDROOM_HOUSE_TYPE_NAME));
            add(new HouseType(TWO_AND_HALF_BEDROOM_HOUSE_TYPE_ID, TWO_AND_HALF_BEDROOM_HOUSE_TYPE_NAME));
            add(new HouseType(THREE_BEDROOM_HOUSE_TYPE_ID, THREE_BEDROOM_HOUSE_TYPE_NAME));
            add(new HouseType(THREE_AND_HALF_BEDROOM_HOUSE_TYPE_ID, THREE_AND_HALF_BEDROOM_HOUSE_TYPE_NAME));
            add(new HouseType(FOUR_AND_ABOVE_BEDROOM_HOUSE_TYPE_ID, FOUR_AND_ABOVE_BEDROOM_HOUSE_TYPE_NAME));
        }
    };

    public static HouseType getHouseTypeByName(String name) {
        Optional<HouseType> houseTypeOptional = houseTypes.stream()
                .filter(houseType -> houseType.getName().equals(name))
                .findFirst();
        return houseTypeOptional.orElse(null);
    }

    public static HouseType getHouseTypeById(int id) {
        Optional<HouseType> houseTypeOptional = houseTypes.stream()
                .filter(houseType -> houseType.getId() == id)
                .findFirst();
        return houseTypeOptional.orElse(null);
    }

    public static List<HouseType> getHouseTypes() {
        return houseTypes;
    }
}
