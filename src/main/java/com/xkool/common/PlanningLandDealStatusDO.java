package com.xkool.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.xkool.common.constant.PlanningLandDealStatusIdConstant.*;
import static com.xkool.common.constant.PlanningLandDealStatusNameConstant.*;

public class PlanningLandDealStatusDO {

    public static List<PlanningLandDealStatus> planningLandDealStatuses = new ArrayList<PlanningLandDealStatus>() {
        {
            add(new PlanningLandDealStatus(UNFILLED_PLANNING_LAND_DEAL_STATUS_ID,
                    UNFILLED_PLANNING_LAND_DEAL_STATUS_NAME));
            add(new PlanningLandDealStatus(AUCTION_DEAL_PLANNING_LAND_DEAL_STATUS_ID,
                    AUCTION_DEAL_PLANNING_LAND_DEAL_STATUS_NAME));
            add(new PlanningLandDealStatus(LISTING_DEAL_PLANNING_LAND_DEAL_STATUS_ID,
                    LISTING_DEAL_PLANNING_LAND_DEAL_STATUS_NAME));
            add(new PlanningLandDealStatus(ABORTIVE_AUCTION_AND_CANCEL_LISTING_PLANNING_LAND_DEAL_STATUS_ID,
                    ABORTIVE_AUCTION_AND_CANCEL_LISTING_PLANNING_LAND_DEAL_STATUS_NAME));
        }
    };

    public static PlanningLandDealStatus getPlanningLandDealStatusByName(String name) {
        Optional<PlanningLandDealStatus> planningLandDealStatusOptional = planningLandDealStatuses.stream()
                .filter(planningLandDealStatus -> planningLandDealStatus.getName().equals(name))
                .findFirst();
        return planningLandDealStatusOptional.orElse(null);
    }

    public static PlanningLandDealStatus getPlanningLandDealStatusById(int id) {
        Optional<PlanningLandDealStatus> planningLandDealStatusOptional = planningLandDealStatuses.stream()
                .filter(planningLandDealStatus -> planningLandDealStatus.getId() == id)
                .findFirst();
        return planningLandDealStatusOptional.orElse(null);
    }

    public static List<PlanningLandDealStatus> getPlanningLandDealStatuses() {
        return planningLandDealStatuses;
    }
}
