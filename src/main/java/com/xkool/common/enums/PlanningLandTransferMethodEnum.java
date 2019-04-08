package com.xkool.common.enums;

import java.util.Arrays;
import java.util.List;

import static com.xkool.common.constant.PlanningLandTransferMethodIdConstant.*;
import static com.xkool.common.constant.PlanningLandTransferMethodNameConstant.*;

public enum PlanningLandTransferMethodEnum {
    LISTING_PLANNING_LAND_TRANSFER_METHOD(LISTING_PLANNING_LAND_TRANSFER_METHOD_ID, LISTING_PLANNING_LAND_TRANSFER_METHOD_NAME),
    AGREEMENT_TRANSFER_PLANNING_LAND_TRANSFER_METHOD(AGREEMENT_TRANSFER_PLANNING_LAND_TRANSFER_METHOD_ID, AGREEMENT_TRANSFER_PLANNING_LAND_TRANSFER_METHOD_NAME),
    TENDER_PLANNING_LAND_TRANSFER_METHOD(TENDER_PLANNING_LAND_TRANSFER_METHOD_ID, TENDER_PLANNING_LAND_TRANSFER_METHOD_NAME),
    AUCTION_PLANNING_LAND_TRANSFER_METHOD(AUCTION_PLANNING_LAND_TRANSFER_METHOD_ID, AUCTION_PLANNING_LAND_TRANSFER_METHOD_NAME);

    private int id;
    private String name;

    PlanningLandTransferMethodEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static PlanningLandTransferMethodEnum getPlanningLandTransferMethodEnumById(int id) {
        for (PlanningLandTransferMethodEnum planningLandTransferMethodEnum : PlanningLandTransferMethodEnum.values()) {
            if (planningLandTransferMethodEnum.getId() == id) {
                return planningLandTransferMethodEnum;
            }
        }
        return null;
    }

    public static PlanningLandTransferMethodEnum getPlanningLandTransferMethodEnumByName(String name) {
        for (PlanningLandTransferMethodEnum planningLandTransferMethodEnum : PlanningLandTransferMethodEnum.values()) {
            if (planningLandTransferMethodEnum.getName().equals(name)) {
                return planningLandTransferMethodEnum;
            }
        }
        return null;
    }

    public static List<PlanningLandTransferMethodEnum> getPlanningLandTransferMethodEnums() {
        return Arrays.asList(PlanningLandTransferMethodEnum.values());
    }
}
