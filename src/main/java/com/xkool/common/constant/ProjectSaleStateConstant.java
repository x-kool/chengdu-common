package com.xkool.common.constant;

import com.xkool.common.ProjectSaleState;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.xkool.common.constant.ProjectSaleStateIdConstant.*;
import static com.xkool.common.constant.ProjectSaleStateNameConstant.*;

@Data
public class ProjectSaleStateConstant {

    public static List<ProjectSaleState> projectSaleStates = new ArrayList<ProjectSaleState>() {
        {
            add(new ProjectSaleState(UNSOLD_PROJECT_SALE_STATE_ID, UNSOLD_PROJECT_SALE_STATE_NAME));
            add(new ProjectSaleState(SALE_PROJECT_SALE_STATE_ID, SALE_PROJECT_SALE_STATE_NAME));
            add(new ProjectSaleState(FOR_SALE_PROJECT_SALE_STATE_ID, FOR_SALE_PROJECT_SALE_STATE_NAME));
            add(new ProjectSaleState(SOLD_OUT_PROJECT_SALE_STATE_ID, SOLD_OUT_PROJECT_SALE_STATE_NAME));
        }
    };

    public static ProjectSaleState getProjectSaleStateByName(String name) {
        Optional<ProjectSaleState> projectSaleStateOptional = projectSaleStates.stream()
                .filter(projectSaleState -> projectSaleState.getName().equals(name))
                .findFirst();
        return projectSaleStateOptional.orElse(null);
    }

    public static ProjectSaleState getProjectSaleStateById(int id) {
        Optional<ProjectSaleState> projectSaleStateOptional = projectSaleStates.stream()
                .filter(projectSaleState -> projectSaleState.getId() == id)
                .findFirst();
        return projectSaleStateOptional.orElse(null);
    }

    public static List<ProjectSaleState> getProjectSaleStates() {
        return projectSaleStates;
    }

}
