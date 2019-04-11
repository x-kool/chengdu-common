package com.xkool.common.constant;

import com.xkool.common.MarketNewsType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.xkool.common.constant.MarketNewsTypeIdConstant.*;
import static com.xkool.common.constant.MarketNewsTypeNameConstant.*;

public class MarketNewsTypeConstant {

    public static List<MarketNewsType> marketNewsTypes = new ArrayList<MarketNewsType>() {
        {
            add(new MarketNewsType(ESTATE_MARKET_POLICY_MARKET_NEWS_TYPE_ID, ESTATE_MARKET_POLICY_MARKET_NEWS_TYPE_NAME));
            add(new MarketNewsType(MONTHLY_PAYMENTS_SITUATION_MARKET_NEWS_TYPE_ID, MONTHLY_PAYMENTS_SITUATION_MARKET_NEWS_TYPE_NAME));
            add(new MarketNewsType(DEAL_SITUATION_MARKET_NEWS_TYPE_ID, DEAL_SITUATION_MARKET_NEWS_TYPE_NAME));
        }
    };

    public static MarketNewsType getMarketNewsTypeByName(String name) {
        Optional<MarketNewsType> marketNewsTypeOptional = marketNewsTypes.stream()
                .filter(marketNewsType -> marketNewsType.getName().equals(name))
                .findFirst();
        return marketNewsTypeOptional.orElse(null);
    }

    public static MarketNewsType getMarketNewsTypeById(int id) {
        Optional<MarketNewsType> marketNewsTypeOptional = marketNewsTypes.stream()
                .filter(marketNewsType -> marketNewsType.getId() == id)
                .findFirst();
        return marketNewsTypeOptional.orElse(null);
    }

    public static List<MarketNewsType> getMarketNewsTypes() {
        return marketNewsTypes;
    }

}
