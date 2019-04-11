package com.xkool.common.constant;

import com.xkool.common.PlanningLandTransferMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.xkool.common.constant.PlanningLandTransferMethodIdConstant.*;
import static com.xkool.common.constant.PlanningLandTransferMethodNameConstant.*;

public class PlanningLandTransferMethodConstant {

    public static List<PlanningLandTransferMethod> planningLandTransferMethods
            = new ArrayList<PlanningLandTransferMethod>() {
        {
            add(new PlanningLandTransferMethod(LISTING_PLANNING_LAND_TRANSFER_METHOD_ID,
                    LISTING_PLANNING_LAND_TRANSFER_METHOD_NAME));
            add(new PlanningLandTransferMethod(AGREEMENT_TRANSFER_PLANNING_LAND_TRANSFER_METHOD_ID,
                    AGREEMENT_TRANSFER_PLANNING_LAND_TRANSFER_METHOD_NAME));
            add(new PlanningLandTransferMethod(TENDER_PLANNING_LAND_TRANSFER_METHOD_ID,
                    TENDER_PLANNING_LAND_TRANSFER_METHOD_NAME));
            add(new PlanningLandTransferMethod(AUCTION_PLANNING_LAND_TRANSFER_METHOD_ID,
                    AUCTION_PLANNING_LAND_TRANSFER_METHOD_NAME));
        }
    };

    public static PlanningLandTransferMethod getPlanningLandTransferMethodByName(String name) {
        Optional<PlanningLandTransferMethod> planningLandTransferMethodOptional = planningLandTransferMethods.stream()
                .filter(planningLandTransferMethod -> planningLandTransferMethod.getName().equals(name))
                .findFirst();
        return planningLandTransferMethodOptional.orElse(null);
    }

    public static PlanningLandTransferMethod getPlanningLandTransferMethodById(int id) {
        Optional<PlanningLandTransferMethod> planningLandTransferMethodOptional = planningLandTransferMethods.stream()
                .filter(planningLandTransferMethod -> planningLandTransferMethod.getId() == id)
                .findFirst();
        return planningLandTransferMethodOptional.orElse(null);
    }

    public static List<PlanningLandTransferMethod> getPlanningLandTransferMethodes() {
        return planningLandTransferMethods;
    }
}
