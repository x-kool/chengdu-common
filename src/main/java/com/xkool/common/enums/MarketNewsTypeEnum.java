package com.xkool.common.enums;

import java.util.Arrays;
import java.util.List;

import static com.xkool.common.constant.MarketNewsTypeIdConstant.*;
import static com.xkool.common.constant.MarketNewsTypeNameConstant.*;

public enum MarketNewsTypeEnum {

    ESTATE_MARKET_POLICY_MARKET_NEWS_TYPE(ESTATE_MARKET_POLICY_MARKET_NEWS_TYPE_ID, ESTATE_MARKET_POLICY_MARKET_NEWS_TYPE_NAME),
    MONTHLY_PAYMENTS_SITUATION_MARKET_NEWS_TYPE(MONTHLY_PAYMENTS_SITUATION_MARKET_NEWS_TYPE_ID, MONTHLY_PAYMENTS_SITUATION_MARKET_NEWS_TYPE_NAME),
    DEAL_SITUATION_MARKET_NEWS_TYPE(DEAL_SITUATION_MARKET_NEWS_TYPE_ID, DEAL_SITUATION_MARKET_NEWS_TYPE_NAME);

    private int id;
    private String name;

    MarketNewsTypeEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static MarketNewsTypeEnum getMarketNewsTypeById(int id) {
        for (MarketNewsTypeEnum marketNewsTypeEnum : MarketNewsTypeEnum.values()) {
            if (marketNewsTypeEnum.getId() == id) {
                return marketNewsTypeEnum;
            }
        }
        return null;
    }

    public static MarketNewsTypeEnum getMarketNewsTypeByName(String name) {
        for (MarketNewsTypeEnum marketNewsTypeEnum : MarketNewsTypeEnum.values()) {
            if (marketNewsTypeEnum.getName().equals(name)) {
                return marketNewsTypeEnum;
            }
        }
        return null;
    }

    public static List<MarketNewsTypeEnum> getMarketNewsTypes() {
        return Arrays.asList(MarketNewsTypeEnum.values());
    }
}
