package com.xkool.common.enums;

import java.util.Arrays;
import java.util.List;

import static com.xkool.common.constant.PlanningLandDealStatusIdConstant.*;
import static com.xkool.common.constant.PlanningLandDealStatusNameConstant.*;

public enum PlanningLandDealStatus {

    UNFILLED_PLANNING_LAND_DEAL_STATUS(UNFILLED_PLANNING_LAND_DEAL_STATUS_ID, UNFILLED_PLANNING_LAND_DEAL_STATUS_NAME),
    AUCTION_DEAL_PLANNING_LAND_DEAL_STATUS(AUCTION_DEAL_PLANNING_LAND_DEAL_STATUS_ID, AUCTION_DEAL_PLANNING_LAND_DEAL_STATUS_NAME),
    LISTING_DEAL_PLANNING_LAND_DEAL_STATUS(LISTING_DEAL_PLANNING_LAND_DEAL_STATUS_ID, LISTING_DEAL_PLANNING_LAND_DEAL_STATUS_NAME),
    ABORTIVE_AUCTION_AND_CANCEL_LISTING_PLANNING_LAND_DEAL_STATUS(ABORTIVE_AUCTION_AND_CANCEL_LISTING_PLANNING_LAND_DEAL_STATUS_ID,
            ABORTIVE_AUCTION_AND_CANCEL_LISTING_PLANNING_LAND_DEAL_STATUS_NAME);

    private int id;
    private String name;

    PlanningLandDealStatus(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static PlanningLandDealStatus getPlanningLandDealStatusById(int id) {
        for (PlanningLandDealStatus planningLandDealStatus : PlanningLandDealStatus.values()) {
            if (planningLandDealStatus.getId() == id) {
                return planningLandDealStatus;
            }
        }
        return null;
    }

    public static PlanningLandDealStatus getPlanningLandDealStatusByName(String name) {
        for (PlanningLandDealStatus planningLandDealStatus : PlanningLandDealStatus.values()) {
            if (planningLandDealStatus.getName().equals(name)) {
                return planningLandDealStatus;
            }
        }
        return null;
    }

    public static List<PlanningLandDealStatus> getPlanningLandDealStatusList() {
        return Arrays.asList(PlanningLandDealStatus.values());
    }
}
